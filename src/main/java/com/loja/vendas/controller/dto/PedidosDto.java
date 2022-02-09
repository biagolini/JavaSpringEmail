package com.loja.vendas.controller.dto;

import com.loja.vendas.entities.Pedidos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidosDto {

    private String email;
    private String descricao;
    private Double valor;

    public PedidosDto(Pedidos pedido) {
        this.email = pedido.getEmail();
        this.descricao = pedido.getDescricao();
        this.valor = pedido.getValor();
    }
    
}
