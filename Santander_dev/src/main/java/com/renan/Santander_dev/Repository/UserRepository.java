package com.renan.Santander_dev.Repository;

import com.renan.Santander_dev.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existAccountNumber(String number);

    User findByAccountNumber(String account);
}
