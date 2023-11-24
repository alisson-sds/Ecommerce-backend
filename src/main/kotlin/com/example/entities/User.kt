package com.example.entities

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import java.util.*


@Entity
@Table(name = "orders")
class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private val id: UUID? = null

    @Column(name = "login", nullable = false)
    @NotBlank
    private val login: String? = null

    @Column(name = "email", nullable = false)
    @NotBlank
    private val email: String? = null

    @Column(name = "password", nullable = false)
    @NotBlank
    @Size(min = 6, max = 20)
    private val password: String? = null

    @Column(name = "name", nullable = false)
    @NotBlank
    private val name: String? = null

    @Column(name = "phone_number", nullable = false)
    @NotBlank
    @Size(min = 11, max = 11)
    private val phone_number: Int? = null

}