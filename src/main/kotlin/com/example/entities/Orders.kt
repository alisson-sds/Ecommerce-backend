package com.example.entities

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import java.util.*


@Entity
@Table(name = "orders")
class Orders {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private val id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("hibernateLazyInitializer", "handler")
    @JoinColumn(name = "id")
    private val user: User? = null

    @Column(name = "date")
    @NotBlank
    private val date: Date? = null

    @Column(name = "total")
    @NotBlank
    private val total: Double? = null

    @Column(name = "status", nullable = false)
    @NotBlank
    private val status: String? = null

}