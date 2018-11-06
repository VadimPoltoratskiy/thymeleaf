package com.thymeleaf.course.domain.service;

//import com.thymeleaf.course.Repository.UserRepository;
import com.thymeleaf.course.domain.model.dto.UserSignUpRequest;
import com.thymeleaf.course.domain.model.entity.User;
import com.thymeleaf.course.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Random;

@Service
//@AllArgsConstructor
public class UserService {

    @Autowired
     private UserRepository userRepository;

      public void saveUser(UserSignUpRequest request) {
       /* TODO userRepository.save(request)*/
        User newUser = new User();
        newUser.setId((long) new Random().nextInt());
        newUser.setFirstName(request.getFirstName());
        newUser.setLastName(request.getLastName());
        newUser.setEmail(request.getEmail());
        newUser.setPassword(request.getPassword());

        userRepository.save(newUser);


    }
}
