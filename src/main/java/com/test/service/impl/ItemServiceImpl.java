package com.test.service.impl;

import com.test.dao.ItemDao;
import com.test.dto.ItemDto;
import com.test.dto.QueryItemVo;
import com.test.dto.Result;
import com.test.enums.ItemTypeEnum;
import com.test.service.ItemService;
import com.test.utils.IdUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 项目名称：${MODULE_NAME}
 * 包名：com.test.service.impl
 * 类名称：ItemServiceImpl.java
 * 类描述：
 * 创建人：wangxiukun
 * 创建时间：2017/8/4 21:00
 * 修改人：wangxiukun
 * 修改时间：2017/8/4 21:00
 * 修改备注：
 */
@Service
public class ItemServiceImpl implements ItemService {

    private Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);
    @Autowired
    private ItemDao itemDao;

    @Override
    public Result queryItemsByLimit(QueryItemVo item, Integer limit) {
        Result result = new Result();

        try {
            item.setLimit(limit);
            List<ItemDto> list = itemDao.queryAll(item);

            result.setCount(list.size());
            result.setItems(list);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        return result;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addItem(ItemDto item) {
        try {
            if(checkBusinessId(item)) {
                throw new ItemException("");
            }

            ItemTypeEnum itemType = ItemTypeEnum.valueOf(item.getType());
            if(itemType == null) {
                throw new ItemException("");
            }

            Double price = item.getPriceWithTax() * item.getQuantity();
            if(price < item.getAmount() || price > item.getAmount()) {
                throw new ItemException("");
            }

            item.setId(IdUtils.genernalId());

            itemDao.insertItem(item);
        } catch (ItemException e) {
            logger.warn(e.getMessage());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }

    /**
     * 检查业务主键是否存在
     *
     * @param item
     * @return true 存在， false 不存在
     */
    private boolean checkBusinessId(ItemDto item) {
        ItemDto result = itemDao.findItemByBusinessId(item);
        if(result == null) {
            return false;
        }
        return true;
    }
}
