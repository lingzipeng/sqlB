package com.gec.service;

import com.gec.entity.Orders;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface OrdersService {
    public List<Orders> getAll();
}
