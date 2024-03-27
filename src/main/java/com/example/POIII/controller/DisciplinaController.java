package com.example.POIII.controller;

import com.example.POIII.model.Disciplina;
import com.example.POIII.service.DisciplinaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/disciplinas")
public class DisciplinaController {

    private final DisciplinaService disciplinaService;

    @Autowired
    public DisciplinaController(DisciplinaService disciplinaService) {
        this.disciplinaService = disciplinaService;
    }

    @GetMapping
    public ResponseEntity<List<Disciplina>> listarDisciplinas() {
        List<Disciplina> disciplinas = disciplinaService.listarDisciplinas();
        return ResponseEntity.ok(disciplinas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Disciplina> buscarDisciplinaPorId(@PathVariable Long id) {
        Disciplina disciplina = disciplinaService.buscarDisciplinaPorId(id);
        return ResponseEntity.ok(disciplina);
    }

    @PostMapping
    public ResponseEntity<Disciplina> salvarDisciplina(@RequestBody Disciplina disciplina) {
        Disciplina novaDisciplina = disciplinaService.salvarDisciplina(disciplina);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaDisciplina);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Disciplina> atualizarDisciplina(@PathVariable Long id, @RequestBody Disciplina disciplina) {
        Disciplina disciplinaAtualizada = disciplinaService.atualizarDisciplina(id, disciplina);
        return ResponseEntity.ok(disciplinaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarDisciplina(@PathVariable Long id) {
        disciplinaService.deletarDisciplina(id);
        return ResponseEntity.noContent().build();
    }
}
