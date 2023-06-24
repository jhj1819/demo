package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void save(User user) {
        UserEntity userEntity = UserEntity.toUserEntity(user);
        userRepository.save(userEntity);
    }
}
