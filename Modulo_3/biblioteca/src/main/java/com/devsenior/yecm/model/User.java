package com.devsenior.yecm.model;

import java.time.LocalDate;

public class User {
private String username;
private String email;
private String id;
private LocalDate registerDate;

public User(String username, String email, String id) {
    this(username, email, id, LocalDate.now());
}

public User(String username, String email, String id, LocalDate registerDate) {
    this.username = username;
    this.email = email;
    this.id = id;
    this.registerDate = registerDate;
}

public String getUsername() {
    return username;
}

public String getEmail() {
    return email;
}

public String getId() {
    return id;
}

public LocalDate getRegisterDate() {
    return registerDate;
}

public void setUsername(String username) {
    this.username = username;
}

public void setEmail(String email) {
    this.email = email;
}

public void setRegisterDate(LocalDate registerDate) {
    this.registerDate = registerDate;
}

}
