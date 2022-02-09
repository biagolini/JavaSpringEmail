package com.loja.vendas.controller.dto;

import com.loja.vendas.entities.Pedidos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidosForm {

    private String email;
    private String descricao;
    private Double valor;

    public Pedidos createNewPedido() {
        return new Pedidos(this.email, this.descricao, this.valor);
    }    
}
