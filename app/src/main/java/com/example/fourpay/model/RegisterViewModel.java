package com.example.fourpay.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Date;

public class RegisterViewModel extends ViewModel {

    //Fragment 1
    private MutableLiveData<String> _nomeCompleto = new MutableLiveData<>();
    public LiveData<String> nomeCompleto = _nomeCompleto;

    private MutableLiveData<String> _cpf  = new MutableLiveData<>();
    public LiveData<String> cpf = _cpf;

    private MutableLiveData<String> _rg  = new MutableLiveData<>();
    public LiveData<String> rg = _rg;

    private MutableLiveData<String> _email  = new MutableLiveData<>();
    public LiveData<String> email = _email;

    private MutableLiveData<String> _celular  = new MutableLiveData<>();
    public LiveData<String> celular = _celular;

    private MutableLiveData<String> _dataNascimento  = new MutableLiveData<>();
    public LiveData<String> dataNascimento = _dataNascimento;

    //Fragment 2
    private MutableLiveData<String> _cep  = new MutableLiveData<>();
    public LiveData<String> cep = _cep;

    private MutableLiveData<String> _logradouro  = new MutableLiveData<>();
    public LiveData<String> logradouro = _logradouro;

    private MutableLiveData<String> _numero  = new MutableLiveData<>();
    public LiveData<String> numero = _numero;

    private MutableLiveData<String> _bairro  = new MutableLiveData<>();
    public LiveData<String> bairro = _bairro;

    private MutableLiveData<String> _cidade  = new MutableLiveData<>();
    public LiveData<String> cidade = _cidade;

    private MutableLiveData<String> _estado  = new MutableLiveData<>();
    public LiveData<String> estado = _estado;

    //Fragment 3
    private MutableLiveData<String> _renda  = new MutableLiveData<>();
    public LiveData<String> renda = _renda;

    //Fragment 4
    private MutableLiveData<String> _senha1  = new MutableLiveData<>();
    public LiveData<String> senha1 = _senha1;

    private MutableLiveData<String> _senha2  = new MutableLiveData<>();
    public LiveData<String> senha2 = _senha2;



    public void setNomeCompleto(String nomeCompleto) {
        this._nomeCompleto.setValue(nomeCompleto);
    }

    public void setCpf(String cpf) {
        this._cpf.setValue(cpf);
    }

    public void setRg(String rg) {
        this._rg.setValue(rg);
    }

    public void setEmail(String email) {
        this._email.setValue(email);
    }

    public void setCelular(String celular) {
        this._celular.setValue(celular);
    }

    public void setDataNascimento(String dataNascimento) {
        this._dataNascimento.setValue(dataNascimento);
    }

    public void setCep(String cep) {
        this._cep.setValue(cep);
    }

    public void setLogradouro(String logradouro) {
        this._logradouro.setValue(logradouro);
    }

    public void setNumero(String numero) {
        this._numero.setValue(numero);
    }

    public void setBairro(String bairro) {
        this._bairro.setValue(bairro);
    }

    public void setCidade(String cidade) {
        this._cidade.setValue(cidade);
    }

    public void setEstado(String estado) {
        this._estado.setValue(estado);
    }

    public void setRenda(String renda) {
        this._renda.setValue(renda);
    }

    public void setSenha1(String senha1) {
        this._senha1.setValue(senha1);
    }

    public void setSenha2(String senha2) {
        this._senha2.setValue(senha2);
    }
}
