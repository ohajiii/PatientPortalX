package com.patientportalx.backend.service.implementation;

import com.patientportalx.backend.domain.model.User;
import com.patientportalx.backend.infrastructure.entity.UserEntity;
import com.patientportalx.backend.infrastructure.mapper.UserEntityMapper;
import com.patientportalx.backend.infrastructure.repository.UserRepository;
import com.patientportalx.backend.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImplementation(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public void register(User user){
        if(userRepository.findByEmail(user.getEmail()).isPresent()){
            throw new IllegalArgumentException("Email already exists");
        }

        if(userRepository.findByUsername(user.getUsername()).isPresent()){
            throw new IllegalArgumentException("Username already exists");
        }

        String hashedPassword = passwordEncoder.encode(user.getPasswordHash());
        user.updatePassword(hashedPassword);

        UserEntity userEntity = UserEntityMapper.toEntity(user);

        userRepository.save(userEntity);
    }
}
