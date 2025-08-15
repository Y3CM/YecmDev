package com.devsenior.yecm.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.devsenior.yecm.exception.NotFoundException;

public class UserServicesTest {
    private UserServices userServices;
    private String username = "Yecm";
    private String email = "Yecm@gmail";
    private String id = "1234";

    @BeforeEach
    public void setup() {
        userServices = new UserServices();
    }

    @Test
    void testAddUser() {

        // WHEN
        userServices.addUser(username, email, id);
        // THEN
        assertEquals(1, userServices.getUsers().size());
    }

    @Test
    void testGetUserById() throws NotFoundException {

        userServices.addUser(username, email, id);
        userServices.getUserById("1234");

        assertEquals(1, userServices.getUsers().size());

    }

    @Test
    void testGetUsers() {
        // GIVEN
        var username2 = "Jones";
        var email2 = "jones@gmail";
        var id2 = "1325";
        // WHEN
        userServices.addUser(username, email, id);
        userServices.addUser(username2, email2, id2);
        // THEN
        assertEquals(2, userServices.getUsers().size());

    }

    @Test
    void testUpdateUserEmail() throws NotFoundException {
        userServices.addUser(username, email, id);

        userServices.updateUserEmail("1234", "YecmUpdated@gmail");

        assertEquals("YecmUpdated@gmail", userServices.getUserById("1234").getEmail());

    }

    @Test
    void testUpdateUserName() throws NotFoundException {
        userServices.addUser(username, email, id);

        userServices.updateUserName("1234", "YecmUpdated");

        assertEquals("YecmUpdated", userServices.getUserById("1234").getUsername());
    }
}
