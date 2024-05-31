package br.com.alura.comex.trello6;

import java.util.ArrayList;
import java.util.List;

public class AssociacaoClienteEnderecoPedido {
    public static void main(String[] args) {

        //Ação para associação das classes endereco e cliente
        Endereco endereco = new Endereco("Centro","São Paulo","Rua das Flores","SP","Bairro Jardim",1);
        Cliente cliente = new Cliente("João Silva","15975315975","joao.silva@email.com","pessoa comum","33123456789",endereco);
        Produto produto1 = new Produto("Camisa A","Branca", 49.99, 1);

        Pedido pedido1 = new Pedido(001,cliente,produto1,100.00,1);
        Pedido pedido2 = new Pedido(002,cliente,produto1,200.00,2);

        PedidoCliente pedidoCliente1 = new PedidoCliente(pedido1,cliente);
        System.out.println(pedidoCliente1);

        System.out.println("Pedido 1 é mais barato que Pedido 2? " + pedido1.isMaisBaratoQue(pedido2));
        System.out.println("Pedido 1 é mais caro que Pedido 2? " + pedido1.isMaisCaroQue(pedido2));

        // Criando uma lista de pedidos
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);

        // Calculando o valor total de todos os pedidos
        double valorTotal = Pedido.calcularValorTotal(pedidos);

        // Exibindo o valor total no console
        System.out.println("Valor total de todos os pedidos: " + valorTotal);
    }
}
