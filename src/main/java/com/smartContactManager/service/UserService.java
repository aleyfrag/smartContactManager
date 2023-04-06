package com.smartContactManager.service;

import com.smartContactManager.dao.UserRepository;
import com.smartContactManager.entity_model.UserEntityPojo;
import com.smartContactManager.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService extends Exception {
    UserEntityPojo userPojoEntity = new UserEntityPojo();
    @Autowired
    private UserRepository userRepo;

    public void SignUpProcessor(UserPojo user) throws Exception {

        userPojoEntity.setUserEmailId(user.getUserEmailId());
        userPojoEntity.setPassword(user.getPassword());
        userPojoEntity.setDescriptionOfUser(user.getDescriptionOfUser());
        userPojoEntity.setRoleOfUser(user.getRoleOfUser());

        if (userPojoEntity.getRoleOfUser().equalsIgnoreCase("admin")) {
            userPojoEntity.setEnabled(true);
        } else {
            userPojoEntity.setEnabled(false);
        }
        System.out.println(userPojoEntity);
        try {
            userRepo.save(userPojoEntity);
        }
        catch (Exception e)
        {
            System.out.println("exception occurs:" + e.getMessage());
        }
    }


    public void signInProcessor(UserPojo userPojo)
    {
        System.out.println("inside sign in processor");
        userPojoEntity.setUserEmailId(userPojo.getUserEmailId());
        System.out.println(userPojoEntity.getUserEmailId());
        userPojoEntity.setPassword(userPojo.getPassword());
        System.out.println(userPojoEntity.getPassword());
        List<UserEntityPojo> user = userRepo.findByUserEmailId(userPojo.getUserEmailId());
        user.forEach(e->{
            System.out.println(e);
        });


    }

//    public void signInProcessor(UserPojo userPojo) {
//        System.out.println("checkpoint 1");
//        System.out.println(userPojoEntity);
//        List<UserEntityPojo> user = userRepo.findByUserEmailId(userPojo.getUserEmailId());
//        user.forEach(e->{
//            System.out.println(e);
//        });
//
//    }


}
