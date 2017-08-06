package com.test.controller;

import com.test.dto.ItemDto;
import com.test.dto.QueryItemVo;
import com.test.dto.Result;
import com.test.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 项目名称：${MODULE_NAME}
 * 包名：com.test.controller
 * 类名称：ItemController.java
 * 类描述：
 * 创建人：wangxiukun
 * 创建时间：2017/8/4 20:42
 * 修改人：wangxiukun
 * 修改时间：2017/8/4 20:42
 * 修改备注：
 */
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(path = "api/v1/item/query/{limit}",method = RequestMethod.POST)
    public Result queryItemsByLimit(@PathVariable Integer limit, @RequestBody QueryItemVo item) {
        Result result = itemService.queryItemsByLimit(item, limit);
        return result;
    }

    @RequestMapping(path = "api/v1/item",method = RequestMethod.POST)
    public ItemDto addItem(@RequestBody ItemDto item) {
        itemService.addItem(item);
        return item;
    }


}
