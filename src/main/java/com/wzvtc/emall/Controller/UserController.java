package com.wzvtc.emall.Controller;

import com.wzvtc.emall.Repository.UserRepository;
import com.wzvtc.emall.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/add")
    public String add(UserEntity user){
        userRepository.save(user);
        return "保存成功";
    }


}
