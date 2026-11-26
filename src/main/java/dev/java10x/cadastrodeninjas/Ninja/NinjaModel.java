package dev.java10x.cadastrodeninjas.Ninja;

import dev.java10x.cadastrodeninjas.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// TRANFORMA A CLASSE EM UMA ENTIDADE NO BANCO DE DADOS
@Entity
@Table(name = "db_cadastro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String email;

    private int idade;

    //@ManyToOne - um ninja pode ter uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //forein key ou chave estrangeira
    private MissaoModel missoes;
}
