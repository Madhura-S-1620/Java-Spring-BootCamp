package com.pack.springapp.Repository;

import com.pack.springapp.Model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,Integer>{



}