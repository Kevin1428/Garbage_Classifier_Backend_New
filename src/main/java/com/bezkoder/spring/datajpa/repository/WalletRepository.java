package com.bezkoder.spring.datajpa.repository;
import com.bezkoder.spring.datajpa.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {

}