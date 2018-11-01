package com.thymeleaf.course.Repository;

import com.thymeleaf.course.domain.model.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {



}
