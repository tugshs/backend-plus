package com.hfyang.backendPlus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hfyang.backendPlus.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}