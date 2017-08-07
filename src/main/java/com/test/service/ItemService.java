package com.test.service;

import com.test.dto.ItemDto;
import com.test.dto.QueryItemVo;
import com.test.dto.Result;

/**
 * 项目名称：ex-example
 * 包名：com.test.service
 * 类名称：ItemService.java
 * 类描述：
 * 创建人：wangxiukun
 * 创建时间：2017/8/4 21:00
 * 修改人：wangxiukun
 * 修改时间：2017/8/4 21:00
 * 修改备注：
 */
public interface ItemService {
    /**
     * 查询物品列表
     *
     * @param limit 条数
     * @param item 查询参数对象
     * @return 个数和列表
     */
    Result queryItemsByLimit(QueryItemVo item, Integer limit);

    /**
     * 新增物品信息
     *
     * @param item 物品信息
     */
    void addItem(ItemDto item);
}
