package com.costa.proposta_app.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_proposal")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Proposal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private BigDecimal requestedValue;

    private int paymentTerm;

    private boolean aproved;

    private boolean integrated;

    private String obs;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
