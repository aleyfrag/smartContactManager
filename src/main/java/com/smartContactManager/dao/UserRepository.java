package com.smartContactManager.dao;

import com.smartContactManager.entity_model.UserEntityPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface UserRepository extends JpaRepository<UserEntityPojo, Integer> {


//    @Query("select u from UserEntityPojo u where u.userEmailId= : n")
//    List<UserEntityPojo> findByUserEmailId(@Param("n") String userEmailId);


}
