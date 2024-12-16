package com.costa.proposta_app.repository;

import com.costa.proposta_app.entity.Proposal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProposalRepository extends CrudRepository<Proposal, Long> {
}
