package Modulos;

import java.util.Date;
import java.util.List;

public class Pedidos {
    private Integer id;
    private Double valorFrete;
    private Double valorDesconto;
    private Double valorCupom;
    private Double valorTotal;
    private Date data;

    private List<Item> listaItens;

    public Pedidos(){
        
    }

    public Pedidos(Integer id, Double valorFrete, Double valorDesconto, Double valorCupom, Double valorTotal, Date data) {
        this.id = id;
        this.valorFrete = valorFrete;
        this.valorDesconto = valorDesconto;
        this.valorCupom = valorCupom;
        this.valorTotal = valorTotal;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Double getValorCupom() {
        return valorCupom;
    }

    public void setValorCupom(Double valorCupom) {
        this.valorCupom = valorCupom;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) {
        this.listaItens = listaItens;
    }
}
