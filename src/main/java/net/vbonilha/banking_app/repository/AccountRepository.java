package net.vbonilha.banking_app.repository;

import net.vbonilha.banking_app.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    // Custom query methods can be defined here if needed
    // For example, to find accounts by account holder name:
    // List<Account> findByAccountHolderName(String accountHolderName);
}
