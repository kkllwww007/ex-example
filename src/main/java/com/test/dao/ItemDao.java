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

    void insertItem(ItemDto itemDto) throws Exception;

    List<ItemDto> queryAll(QueryItemVo itemDto) throws Exception;

    ItemDto findItemByBusinessId(ItemDto item);
}
