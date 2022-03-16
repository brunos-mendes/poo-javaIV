package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
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
    }
}
