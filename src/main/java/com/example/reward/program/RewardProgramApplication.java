package com.example.reward.program;

import com.example.reward.program.modal.Transaction;
import com.example.reward.program.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RewardProgramApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RewardProgramApplication.class, args);
	}

	@Autowired
	private TransactionRepository transactionRepository;

	@Override
	public void run(String... args) throws Exception {
		this.transactionRepository.save(new Transaction("product", 150, "date", 20));
	}
}
