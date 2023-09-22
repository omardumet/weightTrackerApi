package com.example.weighttrackerapi.service;

import com.example.weighttrackerapi.model.Weight;
import com.example.weighttrackerapi.repo.WeightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeightService {

    @Autowired
    private WeightRepo weightRepo;

    public List<Weight> getWeights(String email){
        return weightRepo.findAllByEmail(email);
    }

    public Weight saveWeight( Weight weight){
        return weightRepo.save(weight);
    }
}
