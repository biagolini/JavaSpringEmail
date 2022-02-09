package com.loja.vendas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Pedidos {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String descricao;
    private Double valor;
    
    public Pedidos(String email, String descricao,Double valor){
        this.email = email;
        this.descricao = descricao;
        this.valor = valor;
    }

}

