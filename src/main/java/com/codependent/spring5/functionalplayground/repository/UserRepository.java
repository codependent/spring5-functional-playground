package com.codependent.spring5.functionalplayground.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.codependent.spring5.functionalplayground.entity.User;

public interface UserRepository extends ReactiveCrudRepository<User, Integer>{

}
