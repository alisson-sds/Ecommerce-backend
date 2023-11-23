package com.example.Ecommercebackend

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "products")
class Products {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private val id: UUID? = null

    @Column(name = "description", nullable = false)
    @NotBlank
    private val description: String? = null

    @Column(name = "category", nullable = false)
    @NotBlank
    private val category: String? = null

    @Column(name = "price", nullable = false)
    @NotBlank
    private val price: Double? = null

    @Column(name = "discount")
    private val discount: Double? = null

    @Column(name = "weight")
    @NotBlank
    private val weight: Double? = null

    @Column(name = "size", nullable = false)
    @NotBlank
    private val size: String? = null

    @Column(name = "stock_quantity", nullable = false)
    private val stock_quantity: Int? = null

    @Column(name = "created_at")
    private val created_at: Date? = null

    @Column(name = "updated_at")
    private val updated_at: Date? = null
}