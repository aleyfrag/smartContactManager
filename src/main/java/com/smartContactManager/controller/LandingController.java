package com.smartContactManager.controller;

import com.smartContactManager.entity_model.UserEntityPojo;
import com.smartContactManager.pojo.ResponsePojo;
import com.smartContactManager.pojo.UserPojo;
import com.smartContactManager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller()
public class LandingController {

   private UserService userService = new UserService();

    @GetMapping("/home")
    public String home() {
        return "home";
    }
    @PostMapping("/signup")
    @ResponseBody
    public ResponsePojo signupController(@RequestBody UserPojo userPojo) {

        ResponsePojo responsePojo = new ResponsePojo();
        System.out.println(userPojo);

        try {
            if (userPojo != null) {
                userService.SignUpProcessor(userPojo);
                responsePojo.setStatus("success");
                responsePojo.setStatusCode(200);
                responsePojo.setMessage("You are register successfully");
             //   responsePojo.setUserModel(userPojo);
            } else {
                responsePojo.setStatus("failed");
                responsePojo.setStatusCode(400);
                responsePojo.setMessage("something went wrong");
                //responsePojo.setUserModel(userPojo);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return responsePojo;
    }

    @PutMapping("/signin")
    public void signInController(@RequestBody UserPojo userPojo)
    {
        System.out.println(userPojo.getUserEmailId());
        System.out.println(userPojo.getPassword());
        userService.signInProcessor(userPojo);

    }


}
