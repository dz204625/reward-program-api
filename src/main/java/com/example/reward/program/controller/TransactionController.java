package com.example.reward.program.controller;


import com.example.reward.program.modal.Transaction;
import com.example.reward.program.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping("transactions")
    public List <Transaction> getTransactions(){
        return this.transactionRepository.findAll();
    }

    @PostMapping("transactions")
    public Transaction saveTransaction(@RequestBody Transaction transaction){
        return this.transactionRepository.save(transaction);
    }
}
