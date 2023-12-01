package com.example.Ecommercebackend.entities

import com.example.Ecommercebackend.Products
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import java.util.*

@Entity
@Table(name = "orders_items")
class OrderItems {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private val id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("hibernateLazyInitializer", "handler")
    @JoinColumn(name = "id")
    private val order: Orders? = null

    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("hibernateLazyInitializer", "handler")
    @JoinColumn(name = "id")
    private val product: Products? = null

    @Column(name = "quantity", nullable = false)
    @NotBlank
    @Size(min = 1, max = 4)
    private val quantity: Int? = null

    @Column(name = "unit_price", nullable = false)
    @NotBlank
    private val unitPrice: Double? = null

    @Column(name = "subtotal", nullable = false)
    @NotBlank
    private val subtotal: Double? = null


}