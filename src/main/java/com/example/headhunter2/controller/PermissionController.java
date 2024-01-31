package com.example.headhunter2.controller;

import com.example.headhunter2.dto.permission.PermissionCreateDTO;
import com.example.headhunter2.dto.permission.PermissionDTOWithRoles;
import com.example.headhunter2.dto.permission.PermissionDTOWithoutRoles;
import com.example.headhunter2.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/permissions")
@RequiredArgsConstructor
public class PermissionController {
    private final PermissionService service;

    @GetMapping
    public Set<PermissionDTOWithRoles> getAllPermissions() {
        return service.getAllPermissions();
    }

    @GetMapping("/{id}")
    public PermissionDTOWithRoles getPermission(@PathVariable Integer id) {
        return service.getPermission(id);
    }

    @PostMapping
    public PermissionDTOWithoutRoles createPermission(@RequestBody PermissionCreateDTO createDTO) {
        return service.createPermission(createDTO);
    }

    @PutMapping("/{id}")
    public PermissionDTOWithRoles updatePermission(@RequestBody PermissionCreateDTO createDTO,@PathVariable Integer id) {
        return service.updatePermission(createDTO,id);
    }

    @DeleteMapping("/{id}")
    public void deletePermission(@PathVariable Integer id) {
        service.deletePermission(id);
    }
}
