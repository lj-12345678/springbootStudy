package com.dailiangjin.springboot.study.dao;

import com.dailiangjin.springboot.study.entity.TbDept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TbDeptDao {
    List<TbDept> queryAll(TbDept tbDept) throws Exception;

    int add(TbDept dept) throws Exception;

}
