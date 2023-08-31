package com.renan.Santander_dev.Controller;
import com.renan.Santander_dev.Entity.BankLoan;
import com.renan.Santander_dev.Service.BankLoanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/bankloan")
public class BankLoanController {

    private final BankLoanService bankLoanService;

    public BankLoanController(BankLoanService bankLoanService) {
        this.bankLoanService = bankLoanService;
    }

    @PostMapping("/{cpf}/{loan}")
    public ResponseEntity<BankLoan> userLoan (@PathVariable Long cpf, @PathVariable Integer loan){
        BankLoan loanBank = bankLoanService.verifyLoan(cpf, loan);
        return ResponseEntity.ok().body(loanBank);
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<BankLoan> serachLoan (@PathVariable Long cpf) {
        BankLoan searchLoan = bankLoanService.searchLoan(cpf);
        return ResponseEntity.ok().body(searchLoan);
    }


}
