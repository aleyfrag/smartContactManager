package com.smartContactManager.dao;

import com.smartContactManager.entity_model.UserEntityPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntityPojo, Integer> {

    @Query("SELECT u FROM user_scm u WHERE u.user_email_id = :n")
    List<UserEntityPojo> findByUserEmailId(@Param("n") String userEmailId);

}
