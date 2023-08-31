package com.renan.Santander_dev.Service;
import com.renan.Santander_dev.Entity.BankLoan;
import com.renan.Santander_dev.Entity.User;

public interface BankLoanService {

    BankLoan verifyLoan(Long cpf, Integer loan);

    BankLoan searchLoan (Long cpf);
}
