package com.loja.vendas.repository;

import com.loja.vendas.entities.Pedidos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedidos, Long>{ 
    
}
