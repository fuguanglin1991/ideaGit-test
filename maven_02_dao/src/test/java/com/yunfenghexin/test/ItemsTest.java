package com.yunfenghexin.test;

import com.yunfenghexin.domain.Items;
import com.yunfenghexin.mapper.ItemsMapper;
//import com.yunfenghexin.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
    public void testItems() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        /*测试mapper*/
        ItemsMapper itemMapper =  ac.getBean(ItemsMapper.class);
        Items items = itemMapper.findById(1);
        System.out.println(items.getName());
/*
        ItemsService itemsService = ac.getBean(ItemsService.class);
        Items items = itemsService.findById(1);
        System.out.println(items);*/

    }
}
