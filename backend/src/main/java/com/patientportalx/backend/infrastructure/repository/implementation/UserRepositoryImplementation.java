package com.patientportalx.backend.infrastructure.repository.implementation;

import com.patientportalx.backend.domain.enums.Role;
import com.patientportalx.backend.domain.model.User;
import com.patientportalx.backend.domain.repository.UserRepository;
import com.patientportalx.backend.infrastructure.entity.UserEntity;
import com.patientportalx.backend.infrastructure.mapper.UserEntityMapper;
import com.patientportalx.backend.infrastructure.repository.UserJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImplementation implements UserRepository {
    private final UserJpaRepository userJpaRepository;

    public UserRepositoryImplementation(final UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        Optional<UserEntity> result = userJpaRepository.findByEmail(email);

        if (result.isPresent()) {
            UserEntity entity = result.get();
            User user = UserEntityMapper.toDomain(entity);
            return Optional.of(user);
        }

        return Optional.empty();
    }

    @Override
    public Optional<User> findByUsername(String username) {
        Optional<UserEntity> result = userJpaRepository.findByUsername(username);

        if (result.isPresent()) {
            UserEntity entity = result.get();
            User user = UserEntityMapper.toDomain(entity);
            return Optional.of(user);
        }

        return Optional.empty();
    }

    @Override
    public List<User> findByRole(Role role) {
        List<UserEntity> userEntityList = userJpaRepository.findByRole(role);

        List<User> users = new ArrayList<>();
        for (UserEntity userEntity : userEntityList) {
            User user = UserEntityMapper.toDomain(userEntity);
            users.add(user);
        }

        return users;
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = UserEntityMapper.toEntity(user);
        UserEntity userEntitySaved = userJpaRepository.save(userEntity);
        return UserEntityMapper.toDomain(userEntitySaved);
    }
}
