package com.ussd.repository;


import com.ussd.model.LoginForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginForm,String> {
}
