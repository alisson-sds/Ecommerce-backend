package com.example.Ecommercebackend.repository

import com.example.Ecommercebackend.entities.User
import org.springframework.data.jpa.repository.JpaRepository;
interface UserRepository : JpaRepository<User, Int>{

}