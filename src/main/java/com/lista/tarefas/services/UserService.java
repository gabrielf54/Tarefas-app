//package com.lista.tarefas.services;
//
//import com.lista.tarefas.AuthenticationResponse;
//import com.lista.tarefas.entities.User;
//import com.lista.tarefas.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//
//import javax.swing.text.html.Option;
//import java.util.Optional;
//
//@Service
//public class UserService {
//    @Autowired
//    private UserRepository userRepository;
//
//    private BCryptPasswordEncoder passwordEncoder;
//
//
//    public UserService(BCryptPasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//    }
//
//
//    public User getUserById(Long id) {
//        return userRepository.findById(id).orElse(null);
//    }
//
//    public User createUser(User user) {
//        return userRepository.save(user);
//    }
//
//    public User updateUser(Long id, User updatedUser) {
//        User user = userRepository.findById(id).orElse(null);
//        if (user != null) {
//            user.setUsername(updatedUser.getUsername());
//            user.setPassword(updatedUser.getPassword());
//
//            return userRepository.save(user);
//        } else {
//            return null;
//        }
//    }
//
//    public boolean deleteUser(Long id) {
//        User user = userRepository.findById(id).orElse(null);
//        if (user != null) {
//            userRepository.delete(user);
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public User registerUser(String username, String password) {
//        if (isUsernameTaken(username)) {
//            throw new RuntimeException("Username já existe!!");
//        }
//
//        User user = new User();
//        user.setUsername(username);
//        String hashedPassword = passwordEncoder.encode(password);
//        user.setPassword(hashedPassword);
//
//
//        userRepository.save(user);
//        return user;
//    }
//
//    public boolean isUsernameTaken(String username) {
//        Optional<User> userOptional = userRepository.findByUsername(username);
//        return userOptional.isPresent();
//    }
//
//    public User authenticateUser(String username, String password) {
//        Optional<User> optionalUser = userRepository.findByUsername(username);
//
//        if (optionalUser.isPresent()) {
//            User user = optionalUser.get();
//            if (passwordEncoder.matches(password, user.getPassword())) {
//                return user;
//            }
//        }
//        return null;
//    }
//}
