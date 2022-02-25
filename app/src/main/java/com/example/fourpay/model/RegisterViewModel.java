package com.example.fourpay.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Date;

public class RegisterViewModel extends ViewModel {

    //Fragment 1
    private MutableLiveData<String> _nomeCompleto = new MutableLiveData<>();
    public LiveData<String> nomeCompleto = _nomeCompleto;

    private MutableLiveData<String> _cpf;
    public LiveData<String> cpf = _cpf;

    private MutableLiveData<String> _rg;
    public LiveData<String> rg = _rg;

    private MutableLiveData<String> _email;
    public LiveData<String> email = _email;

    private MutableLiveData<String> _celular;
    public LiveData<String> celular = _celular;

    private MutableLiveData<String> _dataNascimento;
    public LiveData<String> dataNascimento = _dataNascimento;

    //Fragment 2
    private MutableLiveData<String> _cep;
    public LiveData<String> cep = _cep;

    private MutableLiveData<String> _logradouro;
    public LiveData<String> logradouro = _logradouro;

    private MutableLiveData<String> _numero;
    public LiveData<String> numero = _numero;

    private MutableLiveData<String> _bairro;
    public LiveData<String> bairro = _bairro;

    private MutableLiveData<String> _cidade;
    public LiveData<String> cidade = _cidade;

    private MutableLiveData<String> _estado;
    public LiveData<String> estado = _estado;

    //Fragment 3
    private MutableLiveData<String> _renda;
    public LiveData<String> renda = _renda;

    //Fragment 4
    private MutableLiveData<String> _senha1;
    public LiveData<String> senha1 = _senha1;

    private MutableLiveData<String> _senha2;
    public LiveData<String> senha2 = _senha2;

}
