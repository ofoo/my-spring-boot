package com.example.demo.service;

import com.example.demo.dao.BeautyDao;
import com.example.demo.entity.Beauty;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author guochao
 * @Date 2021/12/31 23:40
 * @Version 1.0
 */
@Service
public class BeautyService {
    @Resource
    private BeautyDao beautyDao;
    public List<Beauty> list() {
        return beautyDao.list();
    }

    public Beauty getById(Long id) {
        return beautyDao.getById(id);
    }

    public void save(Beauty beauty) {
        if (beauty.getId()!=null) {
            beauty.setUpdateTime(new Date());
            beautyDao.update(beauty);
        } else {
            beauty.setAddTime(new Date());
            beautyDao.insert(beauty);
        }
    }

    public void delete(Long id) {
        Beauty beauty = new Beauty();
        beauty.setId(id);
        beauty.setDeleteTime(new Date());
        beautyDao.delete(beauty);
    }
}
