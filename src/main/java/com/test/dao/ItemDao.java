package com.test.dao;

import com.test.dto.ItemDto;
import com.test.dto.QueryItemVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wxk on 2017-08-06.
 */
@Repository
public interface ItemDao {

    /**
     * 保存物品信息
     *
     * @param itemDto 物品信息
     * @throws Exception
     */
    void insertItem(ItemDto itemDto) throws Exception;

    /**
     * 查询物品列表
     *
     * @param itemDto 物品信息查询条件
     * @return 物品列表
     * @throws Exception
     */
    List<ItemDto> queryAll(QueryItemVo itemDto) throws Exception;

    /**
     * 根据业务ID获取物品信息
     *
     * @param item 物品信息查询条件
     * @return 物品信息
     * @throws Exception
     */
    ItemDto findItemByBusinessId(ItemDto item) throws Exception;
}
