package com.patientportalx.backend.controller;

import com.patientportalx.backend.controller.dto.RegisterUserDTO;
import com.patientportalx.backend.controller.dto.UserDTO;
import com.patientportalx.backend.controller.mapper.UserControllerMapper;
import com.patientportalx.backend.domain.model.User;
import com.patientportalx.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserDTO> register (@RequestBody RegisterUserDTO dto) {
        User user = UserControllerMapper.registrationToDomain(dto);

        userService.register(user);

        UserDTO response = UserControllerMapper.userToDTO(user);

        return ResponseEntity.ok(response);
    }
}
