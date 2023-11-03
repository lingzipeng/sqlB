package com.gec.service.Impl;

import com.gec.entity.Orders;
import com.gec.mapper.OrdersMapper;
import com.gec.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;


    @Override
    public List<Orders> getAll() {
        //查询对应表中所有数据
        return ordersMapper.selectList(null);
    }

}
