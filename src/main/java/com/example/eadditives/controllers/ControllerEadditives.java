package com.example.eadditives.controllers;

import com.example.eadditives.entity.Additive;
import com.example.eadditives.repository.AdditiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerEadditives {

    @Autowired
    AdditiveRepository additiveRepository;

    @GetMapping("/code")
    public ResponseEntity<List<Additive>> getAddByCode(@RequestParam String code) {
        return new ResponseEntity<List<Additive>>(additiveRepository.findByCode(code), HttpStatus.OK);
    }

}
