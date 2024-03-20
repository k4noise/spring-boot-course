package com.example.demo.controller;

import com.example.demo.dto.PenDto;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@Validated
public class PenController {
    @PostMapping("/isCorrectPen")
    public ResponseEntity<Void> checkPen(@Valid @RequestBody PenDto pen) {
        log.info("Pen " + pen.name() + " is correct");
        return ResponseEntity.ok().build();
    }
}
