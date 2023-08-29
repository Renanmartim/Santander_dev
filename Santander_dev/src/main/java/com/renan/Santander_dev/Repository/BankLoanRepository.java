package com.renan.Santander_dev.Repository;

import com.renan.Santander_dev.Entity.BankLoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankLoanRepository extends JpaRepository<BankLoan, Long> {
}
