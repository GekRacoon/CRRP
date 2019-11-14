package com.gdou.crrp.repository;

import com.gdou.crrp.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnoseRepository extends JpaRepository<Department, Integer> {
}
