package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // modification OK
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // modification OK
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // modification OK
        apiService.deleteUser(user);
    }
}
