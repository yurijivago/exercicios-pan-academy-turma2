package com.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }

    double obterValorTotal(){
        double total = 0;

        for(Compra compraAtual: compras){
            total += compraAtual.obterValorTotal();
        }

        return total;
    }

    void imprimirListaCompra(){
        System.out.println("Lista de compras");
        System.out.println(" - - - - - - - - - - - - - - ");
        for(Compra compraIndividual: compras){
            for(Item itemDaCompra: compraIndividual.itens){
                System.out.println("Produto: " + itemDaCompra.produto.nome + " | " +
                "Quantidade: " + itemDaCompra.quantidade + " | " +
                "Total: R$" + compraIndividual.obterValorIndividual(itemDaCompra)
                );
            }
            System.out.println("\n" +
                    "Valor total da compra: R$" + compraIndividual.obterValorTotal());
        }
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("Valor total da compra: R$" + obterValorTotal());
    }
}