package com.tuanhm.cmcex1.controller;


import com.tuanhm.cmcex1.model.User;
import com.tuanhm.cmcex1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
//    public ResponseEntity<List<User>> getUser(@RequestHeader(name = "permissionName", required = false) String permissionName){
//        System.out.println(userService.getAll(permissionName));
//        return ResponseEntity.ok().body(userService.getAll(permissionName));
//    }
    public ResponseEntity<?> get (@RequestHeader(name = "permissionName", required = false) String permissionName){
        return ResponseEntity.ok(userService.getAll(permissionName));
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }


}
