package com.loja.vendas.controller;

import com.loja.vendas.controller.dto.PedidosForm;
import com.loja.vendas.services.PedidosService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value= "/pedidos")
@AllArgsConstructor
public class PedidosController {

    private final PedidosService pedidosService;

    // Obter dado de um pedido
    @GetMapping("/{id}")
    public ResponseEntity<?> acharPedido(@PathVariable Long id) {return this.pedidosService.findPedidoById(id); }
    
	// Postar um novo pedido
    @PostMapping
    public ResponseEntity<?> postarPedido(@RequestBody PedidosForm form){
        return this.pedidosService.postNewPedido(form);
    }

}
