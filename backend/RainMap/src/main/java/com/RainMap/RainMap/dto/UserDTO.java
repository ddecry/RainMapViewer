package com.RainMap.RainMap.dto;

import com.RainMap.RainMap.models.User;

import java.util.Optional;

public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String password;

    public UserDTO(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public UserDTO() {
    }

    public UserDTO(User user) {
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
        password = user.getPassword();
    }

    public UserDTO(Optional<User> user) {

        id = user.get().getId();
        name = user.get().getName();
        email = user.get().getEmail();
        password = user.get().getPassword();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
