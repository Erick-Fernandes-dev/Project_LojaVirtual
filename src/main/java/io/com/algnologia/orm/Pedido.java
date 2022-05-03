package io.com.algnologia.orm;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

    private Integer id;
    private Integer quantPedido;
    private double precoPedido;
    private String descricao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantPedido() {
        return quantPedido;
    }

    public void setQuantPedido(Integer quantPedido) {
        this.quantPedido = quantPedido;
    }

    public double getPrecoPedido() {
        return precoPedido;
    }

    public void setPrecoPedido(double precoPedido) {
        this.precoPedido = precoPedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
