package dev.java10x.cadastrodeninjas.Missoes;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private String dificuldade;

    public MissaoEntity() {
    }

    public MissaoEntity(int id, String nome, String dificuldade) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
