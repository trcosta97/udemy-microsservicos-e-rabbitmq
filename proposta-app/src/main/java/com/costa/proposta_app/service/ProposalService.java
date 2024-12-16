package com.costa.proposta_app.service;

import com.costa.proposta_app.dto.ProposalRequest;
import com.costa.proposta_app.dto.ProposalResponse;
import com.costa.proposta_app.entity.Proposal;
import com.costa.proposta_app.repository.ProposalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class ProposalService {

    private ProposalRepository repository;

    public ProposalResponse create(ProposalRequest request){
        Proposal proposal = repository.save(new Proposal(request));
        return new ProposalResponse(proposal);
    }


}
