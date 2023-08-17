package com.matrix.dianddiptaskm5l8.service.Impl;

import com.matrix.dianddiptaskm5l8.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements CustomerService {
    @Override
    public String sayhello() {
        return "hello from user service";
    }

}
