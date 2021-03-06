package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Fatura {
    private Cliente cliente;
    private ArrayList<Item> itens = new ArrayList<Item>();
    private BigDecimal total = BigDecimal.valueOf(0);

    public Fatura(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItem(Item item) {
        BigDecimal subtotal = item.getValor().multiply(BigDecimal.valueOf(item.getQtd()));
        this.itens.add(item);
        this.total = this.total.add(subtotal);
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "cliente=" + cliente +
                ", itens=" + itens +
                ", total=" + total +
                '}';
    }
}
