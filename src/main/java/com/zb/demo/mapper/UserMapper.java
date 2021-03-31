package com.zb.demo.mapper;

import com.zb.demo.entity.UserTest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface UserMapper{
    public List<UserTest> userFindList();
}
