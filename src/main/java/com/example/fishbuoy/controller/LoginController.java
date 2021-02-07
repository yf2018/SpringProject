package com.example.fishbuoy.controller;
import com.example.fishbuoy.api.CommonResult;
import com.example.fishbuoy.entity.Data_table;
import com.example.fishbuoy.entity.User;
import com.example.fishbuoy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class LoginController {
    @Autowired
    private UserRepository userRepository;
    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public CommonResult login(@RequestBody User user) {
        List<User> userList = userRepository.findAll();
        List<User> userList1 = new ArrayList<>();
        for(int i = 0; i < userList.size(); i++){
            User user1 = userList.get(i);
//            if(user1.getUsername().equals(user.getUsername()) && user1.getPassword().equals(user.getPassword())){
//                userList1.add(user1);
//            }
            if(user1.getUsername().equals("admin") && user1.getPassword().equals("123456")){
                userList1.add(user1);
            }
        }
//        System.out.println(userList1);
        if (userList1.size()!=0)
            return CommonResult.success("admin");
        else
            return CommonResult.validateFailed();
    }
}
