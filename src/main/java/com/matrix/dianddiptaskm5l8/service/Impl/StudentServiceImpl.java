package com.matrix.dianddiptaskm5l8.service.Impl;

import com.matrix.dianddiptaskm5l8.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements CustomerService {
    private UserServiceImpl userServiceImpl;

//    public void setUserServiceImpl(UserService userServiceImpl){
//        this.userServiceImpl = userServiceImpl;
//    }

    public StudentServiceImpl(UserServiceImpl userServiceImpl){
        this.userServiceImpl = userServiceImpl;
    }

    @Override
    public String sayhello(){
        return "hello from student service";
    }
}
