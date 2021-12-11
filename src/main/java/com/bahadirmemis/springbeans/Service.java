package com.bahadirmemis.springbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

    @Autowired
    private Dao dao;

    public Service(Dao dao) {
        this.dao = dao;
    }

    public void test(){
        dao.test();
    }
}
