package com.example.stockkeeping.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "issuance")
public class Issuance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotEmpty
    private String itemCode;
    @NotEmpty
    private String itemName;
    private int issuedQuantity;
    @NotEmpty
    private String station;
    @NotEmpty
    private String issuer;
    private LocalDate issuedDate = LocalDate.now();



}
