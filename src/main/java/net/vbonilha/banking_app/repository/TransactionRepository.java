package net.vbonilha.banking_app.repository;

import net.vbonilha.banking_app.entity.Account;
import net.vbonilha.banking_app.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountIdOrderByTimestampDesc(Long accountId);
}
