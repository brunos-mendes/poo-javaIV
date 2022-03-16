package com.company;

public class Cliente {
    private static Integer idAcc = 0;
    private Integer id;
    private String nome;
    private String sobrenome;

    public Cliente(String nome, String sobrenome) {
        idAcc += 1;
        this.id = idAcc;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
