package com.renan.Santander_dev.Service.impl;
import com.renan.Santander_dev.Entity.User;
import com.renan.Santander_dev.Repository.UserRepository;
import com.renan.Santander_dev.Service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {

    private final UserRepository userRepository;

    public UserImpl (UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchFieldError::new);
    }

    @Override
    public User saveUser(User user) throws IllegalAccessException {
        if (userRepository.existAccountNumber(user.getAccount().getNumber())){
            throw new IllegalAccessException("This Account number exists");
        }
        return userRepository.save(user);
    }
}
