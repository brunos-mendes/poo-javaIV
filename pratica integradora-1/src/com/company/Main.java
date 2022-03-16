package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    // Pratica 1
    /*public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Bruno", "Mendes");
        Cliente cliente2 = new Cliente("Luiza", "Vieira");
        Cliente cliente3 = new Cliente("Isabella", "Mendes");
        String number = null;

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        clientes.stream().forEach(System.out::println);

        clientes.remove(cliente3);
        clientes.stream().forEach(System.out::println);

        System.out.println("escreva o id de um cliente para procura-lo");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            number = reader.readLine();
        } catch (IOException e) {
            System.out.println("Input invalido");
        }

        try {
            Integer finalNumber = Integer.valueOf(number);
            clientes.stream().filter(cliente -> cliente.getId().equals(finalNumber)).findFirst()
                    .ifPresentOrElse(System.out::println, () -> System.out.println("Cliente nao cadastrado"));
        } catch (NumberFormatException e) {
            System.out.println("Input invalido");
        }
    }*/
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Bruno", "Mendes");
        Cliente cliente2 = new Cliente("Luiza", "Vieira");
        Cliente cliente3 = new Cliente("Isabella", "Mendes");
        Fatura compraBruno = new Fatura (cliente1);
        Fatura compraLuiza = new Fatura(cliente2);
        Fatura compraIsabella = new Fatura(cliente3);

        Item macBookPro = new Item("AP001", "MacBookPro", 3, BigDecimal.valueOf(15000));
        Item monitor = new Item("AOC581", "Monitor AOC 21", 9, BigDecimal.valueOf(700));
        Item telefone = new Item("AP0856", "Iphone 12", 4, BigDecimal.valueOf(8000));
        Item foneDeOuvido = new Item("JBL6708", "Fones Ouvido  JBL", 1, BigDecimal.valueOf(600));

        compraBruno.addItem(macBookPro);
        compraBruno.addItem(monitor);
        compraBruno.addItem(foneDeOuvido);

        System.out.println(compraBruno);
        System.out.println(macBookPro.getValor().multiply(BigDecimal.valueOf(macBookPro.getQtd())));
    }
}
