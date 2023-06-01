//package com.lista.tarefas.controllers;
//
//import com.lista.tarefas.entities.User;
//import com.lista.tarefas.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController {
//@Autowired
//    private UserService userService;
//@PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody User user) {
//    String username = user.getUsername();
//    String password = user.getPassword();
//
//    User authenticatedUser = userService.authenticateUser(username, password);
//
//    if(authenticatedUser != null) {
//        return ResponseEntity.ok().build();
//    } else {
//        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
//    }
//}
//
//}
