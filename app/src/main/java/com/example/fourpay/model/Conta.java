package com.example.fourpay.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.fourpay.model.enums.TipoConta;

public class Conta implements Serializable {

    private Long id;

    private Double saldo = 0.0;

    private String senha = "123456";

    private Cliente cliente = new Cliente();

    private TipoConta tipoConta = TipoConta.POUPANCA;

    private CartaoCredito cartaoCredito = new CartaoCredito();

    private CartaoDebito cartaoDebito = new CartaoDebito();

    private Double taxa = 0.0;

    private String dataTaxa = "2001-05-21";

    private List<Recarga> list = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public CartaoDebito getCartaoDebito() {
        return cartaoDebito;
    }

    public void setCartaoDebito(CartaoDebito cartaoDebito) {
        this.cartaoDebito = cartaoDebito;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public String getDataTaxa() {
        return dataTaxa;
    }

    public void setDataTaxa(String dataTaxa) {
        this.dataTaxa = dataTaxa;
    }

    public List<Recarga> getList() {
        return list;
    }

    public void setList(List<Recarga> list) {
        this.list = list;
    }

}