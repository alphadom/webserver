package com.example.webservermysql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepo extends JpaRepository<Customer, Long> 
{

}
