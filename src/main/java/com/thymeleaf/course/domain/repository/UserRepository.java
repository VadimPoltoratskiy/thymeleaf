package com.thymeleaf.course.domain.repository;

import org.springframework.data.repository.CrudRepository;
import com.thymeleaf.course.domain.model.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository  {

    List<User> users = new ArrayList<>();

      public void save(User newUser){
        users.add(newUser);
    };



}
