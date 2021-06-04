package com.vsu.project.repos;

import com.vsu.project.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

interface  BillRepository extends JpaRepository<Bill,Long> {
}
