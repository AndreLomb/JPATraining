package br.com.simplecrud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_curso")
    private String nomeCurso;

    public Course(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }

    public Course(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nomeCurso='" + nomeCurso + '\'' +
                '}';
    }
}
