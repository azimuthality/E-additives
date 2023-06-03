package com.example.eadditives.repository;

import com.example.eadditives.entity.Additive;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdditiveRepository extends JpaRepository<Additive, Long> {

    List<Additive> findByCode(String code);
}

