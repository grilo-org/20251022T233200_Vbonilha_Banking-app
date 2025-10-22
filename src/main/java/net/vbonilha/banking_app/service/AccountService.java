package net.vbonilha.banking_app.service;

import net.vbonilha.banking_app.dto.AccountDto;
import net.vbonilha.banking_app.dto.TransactionDto;
import net.vbonilha.banking_app.dto.TransferFundDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);

    void transferFunds(TransferFundDto transferFundDto);

    List<TransactionDto> getAccountsTransactions(Long accountId);
}
