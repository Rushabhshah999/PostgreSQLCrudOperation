package com.company;

import com.company.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<com.company.Employee, Long> {
    // JPA gives you CRUD methods out-of-the-box
}
