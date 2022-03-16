package com.company;

import java.math.BigDecimal;

public class Item {
    private String codigo;
    private String nome;
    private Integer qtd;
    private BigDecimal Valor;

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQtd() {
        return qtd;
    }

    public BigDecimal getValor() {
        return Valor;
    }

    public Item(String codigo, String nome, Integer qtd, BigDecimal valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtd = qtd;
        Valor = valor;
    }

    @Override
    public String toString() {
        return "Item{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", qtd=" + qtd +
                ", Valor=" + Valor +
                '}';
    }
}
