package com.example.springproxy;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Override
    public void hello() {
        System.out.println("siema!");
    }

    public void bye() {
        hello();
    }
}