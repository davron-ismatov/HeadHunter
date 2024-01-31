package com.example.headhunter2.controller;

import com.example.headhunter2.dto.role.RoleCreateDTO;
import com.example.headhunter2.dto.role.RoleDTOWithPermissions;
import com.example.headhunter2.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RoleController {
    private final RoleService service;

    @GetMapping
    public Set<RoleDTOWithPermissions> getAllRoles() {
        return service.getAllRoles();
    }

    @GetMapping("/{id}")
    public RoleDTOWithPermissions getRole(@PathVariable Integer id) {
        return service.getRole(id);
    }

    @PostMapping
    public RoleDTOWithPermissions createRole(@RequestBody RoleCreateDTO createDTO) {
        return service.createRole(createDTO);
    }

    @PutMapping("/{id}")
    public RoleDTOWithPermissions updateRole(@RequestBody RoleCreateDTO createDTO,@PathVariable Integer id) {
        return service.updateRole(createDTO,id);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Integer id) {
        service.deleteRole(id);
    }
}
