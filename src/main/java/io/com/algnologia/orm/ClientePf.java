package io.com.algnologia.orm;

public class ClientePf extends  Cliente {

    private String cpf;

    public ClientePf(String cpf, String nome, Integer idade) {
        super(nome, idade);
        this.cpf = cpf;
    }
}
