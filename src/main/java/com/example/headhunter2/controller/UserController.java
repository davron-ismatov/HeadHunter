package com.example.headhunter2.controller;

import com.example.headhunter2.dto.user.UserCreateDTO;
import com.example.headhunter2.dto.user.UserDTOWithRoles;
import com.example.headhunter2.service.UserService;
import com.example.headhunter2.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl service;

    @GetMapping
    public Set<UserDTOWithRoles> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDTOWithRoles getUser(@PathVariable Integer id) {
        return service.getUser(id);
    }

    @PostMapping
    public UserDTOWithRoles createUser(@RequestBody UserCreateDTO createDTO) {
        return service.createUser(createDTO);
    }

    @PutMapping("/{id}")
    public UserDTOWithRoles updateUser(@RequestBody UserCreateDTO createDTO,@PathVariable Integer id) {
        return service.updateUser(createDTO,id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        service.deleteUser(id);
    }
}
