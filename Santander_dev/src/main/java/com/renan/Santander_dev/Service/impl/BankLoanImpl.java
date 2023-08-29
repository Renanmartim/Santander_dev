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

    public BankLoanImpl (UserRepository userRepository, BankLoanRepository bankLoanRepository){
        this.userRepository = userRepository;
        this.bankLoanRepository = bankLoanRepository;
    }

    @Override
    public BankLoan verifyLoan(String account, Integer loan) {
        User usuario = userRepository.findByAccountNumber(account);
        boolean creditAproval = false;
        BankLoan bankLoanNew = null;
        if (usuario != null) {
            int possibilityCredit = (int) ((usuario.getWage() * 0.2) * 12);
            if (possibilityCredit >= loan) {
                creditAproval = true;
                bankLoanNew = bankLoanRepository.save(new BankLoan(usuario, creditAproval));
            }
        }
        return bankLoanNew;
    }
}
