package com.example.Ecommercebackend.service

import com.example.Ecommercebackend.repository.UserRepository
import org.springframework.stereotype.Service


@Service
class UserService {

    private var userRepository: UserRepository? = null

    fun UserService(userRepository: UserRepository?) {
        this.userRepository = userRepository
    }
}