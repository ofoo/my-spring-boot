package com.example.demo.service;

import com.example.demo.common.Jr;
import com.example.demo.dao.BeautyDao;
import com.example.demo.dto.BeautyDto;
import com.example.demo.entity.Beauty;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public PageInfo<BeautyDto> list(BeautyDto query) {
        PageHelper.startPage(query.getPageNum(), query.getPageSize());
        List<BeautyDto> list = beautyDao.list(query);
        return new PageInfo<>(list);
    }

    public BeautyDto getById(Long id) {
        return beautyDao.getById(id);
    }

    public Jr saveEnhance(Beauty beauty) {
        if (beauty.getId() != null) {
            BeautyDto byDate = beautyDao.getByName(beauty.getName());
            if (byDate != null) {
                if (byDate.getId().longValue() != beauty.getId()) {
                    return Jr.nom("女神已添加");
                }
            }
        } else {
            BeautyDto byDate = beautyDao.getByName(beauty.getName());
            if (byDate != null) {
                return Jr.nom("女神已添加");
            }
        }
        save(beauty);
        return Jr.yesd(beauty.getId());
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
