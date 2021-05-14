package com.vsu.project.repos;

import com.vsu.project.models.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartamentRepository extends JpaRepository<Apartment,Long> {
}
