package com.example.demo.dao;

import com.example.demo.dto.BeautyDto;
import com.example.demo.entity.Beauty;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author guochao
 * @Date 2021/12/31 23:40
 * @Version 1.0
 */
@Mapper
public interface BeautyDao {
    List<BeautyDto> list(BeautyDto beautyDto);

    BeautyDto getById(Long id);

    void delete(Beauty beauty);

    void update(Beauty beauty);

    void insert(Beauty beauty);

    BeautyDto getByName(String name);
}
