package com.vsu.project.repos;

import com.vsu.project.models.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRepository extends JpaRepository <Bid,Long> {
}
