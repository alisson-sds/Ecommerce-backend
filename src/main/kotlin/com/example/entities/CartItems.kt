package com.example.entities

import com.example.Ecommercebackend.Products
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import java.util.*

@Entity
@Table(name = "carts_items")
class CartItems {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private val id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("hibernateLazyInitializer", "handler")
    @JoinColumn(name = "id")
    private val cart: Carts? = null

    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("hibernateLazyInitializer", "handler")
    @JoinColumn(name = "id")
    private val product: Products? = null

    @Column(name = "quantity", nullable = false)
    @NotBlank
    @Size(min = 1, max = 4)
    private val quantity: Int? = null

}