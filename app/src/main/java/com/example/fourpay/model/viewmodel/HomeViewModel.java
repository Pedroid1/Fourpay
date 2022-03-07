package com.example.fourpay.model.viewmodel;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.fourpay.model.Conta;
import com.example.fourpay.retrofit.RetrofitMethods;
import com.example.fourpay.retrofit.RetrofitService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeViewModel extends ViewModel {

    //Variável para fazer consultas na API
    private RetrofitMethods methods = RetrofitService.getRetrofitInstance().create(RetrofitMethods.class);

    //Current conta
    private Conta conta;

    private MutableLiveData<String> _nome = new MutableLiveData<>();
    public LiveData<String> nome = _nome;

    private MutableLiveData<String> _saldo = new MutableLiveData<>();
    public LiveData<String> saldo = _saldo;

    private MutableLiveData<String> _endereco = new MutableLiveData<>();
    public LiveData<String> endereco = _endereco;

    private MutableLiveData<String> _email = new MutableLiveData<>();
    public LiveData<String> email = _email;

    private MutableLiveData<String> _telefone = new MutableLiveData<>();
    public LiveData<String> telefone = _telefone;

    // Tela de Emprestimo

    private MutableLiveData<String> _diaPagamento = new MutableLiveData<>();
    public LiveData<String> diaPagamento = _diaPagamento;

    private MutableLiveData<String> _parcelas = new MutableLiveData<>();
    public LiveData<String> parcelas = _parcelas;

    private MutableLiveData<String> _valorSimulado = new MutableLiveData<>();
    public LiveData<String> valorSimulado = _valorSimulado;


    public Conta getConta() {
        return conta;
    }

    public void updateUi() {
        _nome.setValue(conta.getCliente().getNome());
        _saldo.setValue(String.valueOf(conta.getSaldo()));
        String enderecoTemp = conta.getCliente().getEndereco().getCidade() + " | " +
                conta.getCliente().getEndereco().getEstado();
        _endereco.setValue(enderecoTemp);
        _email.setValue(conta.getCliente().getEmail());
        _telefone.setValue(conta.getCliente().getTelefone());
    }

    public void getCurrentUser(Long id) {
        Call<Conta> data = methods.contaGet(id);
        data.enqueue(new Callback<Conta>() {
            @Override
            public void onResponse(Call<Conta> call, Response<Conta> response) {
                if(response.isSuccessful()) {
                    conta = response.body();
                    updateUi();
                } else {
                }
            }

            @Override
            public void onFailure(Call<Conta> call, Throwable t) {
            }
        });
    }

    public void updateUser() {
        Call<Conta> data = methods.contaPost(conta);
        data.enqueue(new Callback<Conta>() {
            @Override
            public void onResponse(Call<Conta> call, Response<Conta> response) {
                if(response.isSuccessful()) {
                    conta = response.body();
                    updateUi();
                } else {
                }
            }

            @Override
            public void onFailure(Call<Conta> call, Throwable t) {
            }
        });
    }

    public void setMethods(RetrofitMethods methods) {
        this.methods = methods;
    }

    public void set_diaPagamento(String diaPagamento) {
        this._diaPagamento.setValue(diaPagamento);
    }

    public void set_parcelas(String parcelas) {
        this._parcelas.setValue(parcelas);
    }

    public void set_valorSimulado(String valorSimulado) {
        this._valorSimulado.setValue(valorSimulado);
    }

    public LiveData<String> getDiaPagamento() {
        return diaPagamento;
    }

    public LiveData<String> getParcelas() {
        return parcelas;
    }

    public LiveData<String> getValorSimulado() {
        return valorSimulado;
    }
}
