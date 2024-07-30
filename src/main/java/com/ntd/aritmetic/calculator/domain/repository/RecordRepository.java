package com.ntd.aritmetic.calculator.domain.repository;

import com.ntd.aritmetic.calculator.domain.entity.RecordEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<RecordEntity, UUID> {

}
