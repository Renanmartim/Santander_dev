package com.renan.Santander_dev.Service;
import com.renan.Santander_dev.Entity.User;

public interface UserService {

    User findById(Long id);

    User saveUser(User user) throws IllegalAccessException;

}
