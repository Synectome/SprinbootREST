package com.rest_provider.repository;

import org.springframework.data.repository.CrudRepository;

import com.rest_provider.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
