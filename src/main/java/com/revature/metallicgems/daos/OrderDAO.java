package com.revature.metallicgems.daos;

import com.revature.metallicgems.models.Order;

import java.io.IOException;
import java.util.List;

public class OrderDAO implements CrudDAO <Order> {

    @Override
    public void save(Order obj) throws IOException {

    }

    @Override
    public void update(Order obj) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Order getById(String id) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return null;
    }
}
