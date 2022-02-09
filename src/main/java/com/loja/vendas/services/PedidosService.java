package com.loja.vendas.services;

import java.util.Optional;

import com.loja.vendas.controller.dto.PedidosDto;
import com.loja.vendas.controller.dto.PedidosForm;
import com.loja.vendas.entities.Pedidos;
import com.loja.vendas.repository.PedidosRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PedidosService {

    private PedidosRepository pedidosRepository;

    public ResponseEntity<?> findPedidoById(Long id) {
        Optional<Pedidos> pedido = pedidosRepository.findById(id);
        if (pedido.isPresent()) {
            return ResponseEntity.ok(new PedidosDto(pedido.get()));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id não encontrado.");
    }

    public ResponseEntity<?> postNewPedido(PedidosForm form) {
        Pedidos pedido = form.createNewPedido();
        pedidosRepository.save(pedido);       
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("PEDIDO CRIADO.");
    }
    
}
