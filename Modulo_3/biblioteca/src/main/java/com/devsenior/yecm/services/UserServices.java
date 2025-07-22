package com.devsenior.yecm.services;

import java.util.ArrayList;
import java.util.List;

import com.devsenior.yecm.exception.NotFoundException;
import com.devsenior.yecm.model.User;

public class UserServices {
private List<User> users;

public UserServices() {
    users = new ArrayList<>();
}

public void addUser(String username, String email, String id) {
    users.add(new User(username, email, id));
}

public List<User> getUsers() {
    return users;
}

    public User getUserById(String id) throws NotFoundException {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        throw new NotFoundException("Usuario con el id: " + id + " no encontrado");
    } 

    public void updateUserEmail(String id, String email) throws NotFoundException {
        for (User user : users) {
            if (user.getId().equals(id)) {
                user.setEmail(email);
                return;
            }
        }
        throw new NotFoundException("Usuario con el id: " + id + " no encontrado");
    }

    public void updateUserName(String id, String username) throws NotFoundException {
        for (User user : users) {
            if (user.getId().equals(id)) {
                user.setUsername(username);
                return;
            }
        }
        throw new NotFoundException("Usuario con el id: " + id + " no encontrado");
    }
}
