package com.example.POIII.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String professor;
    private int turma;
    private int sala;
    private Date horario;

    public Disciplina() {
    }

    public Disciplina(String professor, int turma, int sala, Date horario) {
        this.professor = professor;
        this.turma = turma;
        this.sala = sala;
        this.horario = horario;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }
}
