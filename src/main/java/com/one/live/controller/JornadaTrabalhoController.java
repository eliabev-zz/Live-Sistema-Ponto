package com.one.live.controller;

import com.one.live.model.JornadaTrabalho;
import com.one.live.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho)
    {
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList() {
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada")
    public ResponseEntity <JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long id) throws Exception {
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new Exception("Jornada não encontrada")));

    }

}
