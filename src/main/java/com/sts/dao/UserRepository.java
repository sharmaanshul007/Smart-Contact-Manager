package com.sts.dao;

import org.springframework.data.repository.CrudRepository;

import com.sts.model.User;
public interface UserRepository extends CrudRepository<User
,Integer>{

}
