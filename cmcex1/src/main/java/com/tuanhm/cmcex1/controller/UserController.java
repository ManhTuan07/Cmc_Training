package com.tuanhm.cmcex1.controller;


import com.tuanhm.cmcex1.model.User;
import com.tuanhm.cmcex1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController

@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    @Value("${spring.application.name}")
    private String applicationName;
    private final UserService userService;

    @GetMapping
    public ResponseEntity<?> getAll (){

        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/page")
    public ResponseEntity<?> getPage (Pageable pageable){
        return ResponseEntity.ok(userService.getPage(pageable));
    }

    @GetMapping("/get-prop")
    public ResponseEntity<?> getProperty (){
        return ResponseEntity.ok(applicationName);
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userService.getOne(id));
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
