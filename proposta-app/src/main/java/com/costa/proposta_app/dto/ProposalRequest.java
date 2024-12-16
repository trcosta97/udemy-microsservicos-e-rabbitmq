package com.costa.proposta_app.dto;

import java.math.BigDecimal;

public record ProposalRequest(
        String name,
        String lastName,
        String tel,
        String cpf,
        BigDecimal income,
        BigDecimal requestedValue,
        int term
) {
}
