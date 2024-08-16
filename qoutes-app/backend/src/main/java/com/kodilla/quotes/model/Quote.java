package com.kodilla.quotes.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "quotes")
public final class Quote {
    @Id
    private Long id;
    private String author;
    private String content;
}
