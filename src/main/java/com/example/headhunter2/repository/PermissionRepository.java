package com.example.headhunter2.repository;

import com.example.headhunter2.entities.Permission;
import com.example.headhunter2.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PermissionRepository extends JpaRepository<Permission,Integer> {

    @Query(value = "select r from Role r join fetch Permission p on r.id=p.id where p.id=:id")
    public Set<Role> getPermissionRoles(@Param("id") Integer id);

    @Query(value = "select r from Role r join fetch Permission p on r.id=p.id")
    Set<Role> getPermissionsWithRoles();
}
