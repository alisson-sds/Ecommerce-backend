package com.example.Ecommercebackend.controller

import com.example.Ecommercebackend.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController {

    private var userService: UserService? = null

    @PostMapping("/create")
    fun ResponseEntity<String> createUser(){
        try{

        }
    }

}