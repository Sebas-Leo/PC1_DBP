package com.example.pc_backend.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class ProductoRequest {

    // @DecimalMin / @DecimalMax: Valida el valor mínimo y máximo para tipos numéricos (incluido BigDecimal).
    @NotNull(message = "El precio es obligatorio")
    @DecimalMin(value = "0.000001", message = "El precio debe ser positivo")
    @DecimalMax(value = "99999.99", message = "El precio es demasiado alto")
    private BigDecimal price;

    // @Min / @Max: Valida el valor mínimo y máximo para tipos primitivos (int, long, etc.) y sus wrappers.
    @Min(value = 1, message = "El stock mínimo es 1")
    @Max(value = 1000, message = "El stock máximo es 1000")
    private int stock;
}