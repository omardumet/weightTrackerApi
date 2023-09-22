package com.example.weighttrackerapi.controller;

import com.example.weighttrackerapi.model.Weight;
import com.example.weighttrackerapi.repo.WeightRepo;
import com.example.weighttrackerapi.service.WeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class WeightController {

    @Autowired
    private WeightRepo weightRepo;

    @Autowired
    private WeightService weightService;

    @GetMapping("/weights")
    public List<Weight> weights(@RequestParam String email){
        return weightService.getWeights(email);
    }

    @PostMapping("/weight")
    public Weight weight(@RequestBody Weight weight){
        return weightService.saveWeight(weight);
    }











}
