package com.example.Ecommercebackend.entities

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import jakarta.persistence.*
import java.util.*


@Entity
@Table(name = "carts")
class Carts {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private val id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("hibernateLazyInitializer", "handler")
    @JoinColumn(name = "id")
    private val user: User? = null

}