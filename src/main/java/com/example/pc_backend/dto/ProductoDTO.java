package com.example.pc_backend.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class ProductoDTO {

    // @DecimalMin / @DecimalMax: Valida el valor mínimo y máximo para tipos numéricos (incluido BigDecimal).
    @NotNull(message = "El precio es obligatorio")
    @DecimalMin(value = "0.000001", message = "El precio debe ser positivo")
    @DecimalMax(value = "99999.99", message = "El precio es demasiado alto")
    private BigDecimal price;

    // @Min / @Max: Valida el valor mínimo y máximo para tipos primitivos (int, long, etc.) y sus wrappers.
    @Min(value = 1, message = "El stock mínimo es 1")
    @Max(value = 1000, message = "El stock máximo es 1000")
    private int stock;

    // 4. Validación de fechas

    // @Past / @Future: Valida que un campo de fecha sea en el pasado o en el futuro.
    @Past(message = "La fecha de fabricación debe ser una fecha pasada")
    private java.time.LocalDate fechaFabricacion;
}