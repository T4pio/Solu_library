package com.solu.library.controller;

import com.solu.library.entity.User;
import com.solu.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    // Tüm kullanıcıları getir (Sayıyı bulmak için)
    @GetMapping
    public java.util.List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User loginRequest) {
        return userService.loginUser(loginRequest.getUsername(), loginRequest.getPassword());

    }

    // PROFİL GÜNCELLEME İSTEĞİ (PUT)
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    // ID ile Kullanıcı Bilgisi Çekme (Sayfa yenilenince en güncel hali almak için)
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getAllUsers().stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}