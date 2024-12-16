package com.costa.proposta_app.controller;

import com.costa.proposta_app.dto.ProposalRequest;
import com.costa.proposta_app.dto.ProposalResponse;
import com.costa.proposta_app.service.ProposalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/propose")
public class ProposalController {

    @Autowired
    private ProposalService service;

    @PostMapping
    public ResponseEntity<ProposalResponse> create(@RequestBody ProposalRequest request){
        ProposalResponse response = service.create(request);
        return ResponseEntity.ok().body(response);


    }
}
