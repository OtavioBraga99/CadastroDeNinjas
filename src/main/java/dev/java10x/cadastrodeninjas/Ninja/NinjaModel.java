package dev.java10x.cadastrodeninjas.Ninja;

import jakarta.persistence.*;

// TRANFORMA A CLASSE EM UMA ENTIDADE NO BANCO DE DADOS
@Entity
@Table (name = "db_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int idade;
    private String email;

    public NinjaModel() {
    }

    public NinjaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
