package dev.guedes.CadastroDeNinjas.Ninjas;

import dev.guedes.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@Data //getter e setters
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //Um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name="missoes_id") // Foreign Key
    private MissoesModel missoes;
}
