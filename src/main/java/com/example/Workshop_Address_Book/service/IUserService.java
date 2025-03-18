package com.example.Workshop_Address_Book.service;

import com.example.Workshop_Address_Book.dto.UserDTO;

public interface IUserService {
    String registerUser(UserDTO userDTO);
    String loginUser(String email, String password);
}