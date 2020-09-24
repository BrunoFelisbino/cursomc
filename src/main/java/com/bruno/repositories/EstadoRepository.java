package com.bruno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bruno.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}