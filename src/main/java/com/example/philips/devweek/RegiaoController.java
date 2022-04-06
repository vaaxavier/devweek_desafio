package com.example.philips.devweek;

import com.example.philips.devweek.Repository.RegiaoRepo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegiaoController {

    private final RegiaoRepo repository;

    public RegiaoController(RegiaoRepo repository) {
        this.repository = repository;
    }

    public RegiaoController(RegiaoRepo repository)
}
