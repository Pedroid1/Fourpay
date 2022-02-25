package com.example.fourpay.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Date;

public class RegisterViewModel extends ViewModel {

    //Fragment 1
    private MutableLiveData<String> _nomeCompleto = new MutableLiveData<>();
    private MutableLiveData<String> _cpf;
    private MutableLiveData<String> _rg;
    private MutableLiveData<String> _email;
    private MutableLiveData<String> _celular;
    private MutableLiveData<Date> _dataNascimento;

    //Fragment 2
    private MutableLiveData<String> _cep;
    private MutableLiveData<String> _logradouro;
    private MutableLiveData<String> _numero;
    private MutableLiveData<String> _bairro;
    private MutableLiveData<String> _cidade;
    private MutableLiveData<String> _estado;

    //Fragment 3
    private MutableLiveData<String> _renda;

    //Fragment 4
    private MutableLiveData<String> _senha1;
    private MutableLiveData<String> _senha2;

    private Conta conta = new Conta();

    public void setNomeCompleto(String nomeCompleto) {
        this._nomeCompleto.setValue(nomeCompleto);
    }

    public LiveData<String> getNomeCompleto() {
        if(_nomeCompleto == null)
            _nomeCompleto = new MutableLiveData<>();
        return _nomeCompleto;
    }
    public LiveData<String> getCpf() {
        if(_cpf == null)
            _cpf = new MutableLiveData<>();
        return _cpf;
    }
    public LiveData<String> getRg() {
        if(_rg == null)
            _rg = new MutableLiveData<>();
        return _rg;
    }
    public LiveData<String> getEmail() {
        if(_email == null)
            _email = new MutableLiveData<>();
        return _email;
    }
    public LiveData<String> getCelular() {
        if(_celular == null)
            _celular = new MutableLiveData<>();
        return _celular;
    }
    public LiveData<Date> getDataNascimento() {
        if(_dataNascimento == null)
            _dataNascimento = new MutableLiveData<>();
        return _dataNascimento;
    }
    public LiveData<String> getCep() {
        if(_cep == null)
            _cep = new MutableLiveData<>();
        return _cep;
    }
    public LiveData<String> getLogradouro() {
        if(_logradouro == null)
            _logradouro = new MutableLiveData<>();
        return _logradouro;
    }
    public LiveData<String> getNumero() {
        if(_numero == null)
            _numero = new MutableLiveData<>();
        return _numero;
    }
    public LiveData<String> getBairro() {
        if(_bairro == null)
            _bairro = new MutableLiveData<>();
        return _bairro;
    }
    public LiveData<String> getCidade() {
        if(_cidade == null)
            _cidade = new MutableLiveData<>();
        return _cidade;
    }
    public LiveData<String> getEstado() {
        if(_estado == null)
            _estado = new MutableLiveData<>();
        return _estado;
    }
    public LiveData<String> getRenda() {
        if(_renda == null)
            _renda = new MutableLiveData<>();
        return _renda;
    }
    public LiveData<String> getSenha1() {
        if(_senha1 == null)
            _senha1 = new MutableLiveData<>();
        return _senha1;
    }
    public LiveData<String> getSenha2() {
        if(_senha2 == null)
            _senha2 = new MutableLiveData<>();
        return _senha2;
    }

}
