package com.hfyang.backendPlus.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hfyang.backendPlus.entity.User;
import com.hfyang.backendPlus.mapper.UserMapper;
import com.hfyang.backendPlus.service.UserService;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
