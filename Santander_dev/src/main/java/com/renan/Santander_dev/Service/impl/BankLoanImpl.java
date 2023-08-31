package com.renan.Santander_dev.Service.impl;

import com.renan.Santander_dev.Entity.BankLoan;
import com.renan.Santander_dev.Entity.User;
import com.renan.Santander_dev.Repository.BankLoanRepository;
import com.renan.Santander_dev.Repository.UserRepository;
import com.renan.Santander_dev.Service.BankLoanService;
import org.springframework.stereotype.Service;

@Service
public class BankLoanImpl implements BankLoanService {

    private final UserRepository userRepository;
    private final BankLoanRepository bankLoanRepository;

    public BankLoanImpl(UserRepository userRepository, BankLoanRepository bankLoanRepository) {
        this.userRepository = userRepository;
        this.bankLoanRepository = bankLoanRepository;
    }

    @Override
    public BankLoan verifyLoan(Long cpf, Integer loan) {
        User user = userRepository.findByCpf(cpf);
        if (user == null) {
            return null;  // User not found
        }

        int maxPossibleLoan = (int) (user.getWage() * 0.2 * 12);
        if (loan <= maxPossibleLoan) {
            BankLoan bankLoan = new BankLoan(user.getCpf(), true);
            return bankLoanRepository.save(bankLoan);
        }

        return null;  // Loan amount exceeds the maximum possible
    }

    @Override
    public BankLoan searchLoan(Long cpf) {
        BankLoan searchLoan = bankLoanRepository.searchByCpf(cpf);
        if (searchLoan == null) {
            throw  new IllegalArgumentException("Cpf not exists");
        }
        return searchLoan;
    }
}
