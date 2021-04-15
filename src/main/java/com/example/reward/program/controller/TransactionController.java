package com.example.reward.program.controller;


import com.example.reward.program.modal.Transaction;
import com.example.reward.program.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping("transactions")
    public List<Transaction> getTransactions(){
        return this.transactionRepository.findAll();
    }
}
