package com.test.dto;

import java.util.List;

/**
 * 项目名称：${MODULE_NAME}
 * 包名：com.test.dto
 * 类名称：Result.java
 * 类描述：
 * 创建人：wangxiukun
 * 创建时间：2017/8/4 20:53
 * 修改人：wangxiukun
 * 修改时间：2017/8/4 20:53
 * 修改备注：
 */
public class Result {
    private Integer count;
    private List<ItemDto> items;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<ItemDto> getItems() {
        return items;
    }

    public void setItems(List<ItemDto> items) {
        this.items = items;
    }
}
