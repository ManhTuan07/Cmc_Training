package com.tuanhm.cmcex1.controller;


import com.tuanhm.cmcex1.model.User;
import com.tuanhm.cmcex1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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
    public ResponseEntity<?> get (){
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/users/page")
    public ResponseEntity<?> getPage (Pageable pageable){
        return ResponseEntity.ok(userService.getPage(pageable));
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }


}
