package com.aixiyou.textson.service.impl;


import com.aixiyou.textson.dao.Dao;
import com.aixiyou.textson.pojo.Text;
import com.aixiyou.textson.service.DaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaoServiceImpl implements DaoService {
    @Autowired
    private Dao dao;
    @Override
    public Text gettext(String name, String pwd) {
        return dao.get(name,pwd);
    }
}
