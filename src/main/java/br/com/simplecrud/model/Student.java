package br.com.simplecrud.model;

import jakarta.persistence.*;

@Entity
@Table (name = "alunos")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "nomes")
    private String nome;

    @Column(name = "idades")
    private Integer idade;

    @Column(name = "numero_matricula")
    private Integer matricula;

    public Student(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
