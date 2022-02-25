package com.example.fourpay.model;

import android.util.Log;

import com.example.fourpay.model.enums.TipoCliente;
import com.example.fourpay.model.enums.TipoConta;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {

    private Long id;

    private String cpf = "090.336.044-11";

    private String nome = "Joao cabelin";

    private String dataDeNascimento = "2022-02-23";

    private Endereco endereco = new Endereco();

    private String email = "joão@gamil.com";

    private String telefone = "+55(74)99963-7391";

    private TipoCliente tipo = TipoCliente.COMUM;

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    /*
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

     */

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    /*
    public Object getDataString() {
        return dataString;
    }

    public void setDataString(Object dataString) {
        this.dataString = dataString;
    }

     */

}