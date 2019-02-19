package com.yunfenghexin.service.impl;

import com.yunfenghexin.domain.Items;
import com.yunfenghexin.mapper.ItemsMapper;
import com.yunfenghexin.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    public Items findById(Integer id) {
        return itemsMapper.findById(id);
    }
}
