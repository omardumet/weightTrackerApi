package com.example.weighttrackerapi.repo;

import com.example.weighttrackerapi.model.Weight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeightRepo extends JpaRepository<Weight, Integer> {


    List<Weight> findAllByEmail(String email);
}
