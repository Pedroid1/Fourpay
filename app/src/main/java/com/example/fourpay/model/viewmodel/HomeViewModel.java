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

    public MutableLiveData<Conta> conta = new MutableLiveData<>();

    private MutableLiveData<String> _nome = new MutableLiveData<>();
    public LiveData<String> nome = _nome;

    public MutableLiveData<String> _saldo = new MutableLiveData<>();
    public LiveData<String> saldo = _saldo;

    public void setNome(String nome) {
        _nome.setValue(nome);
    }

    public void setSaldo(String saldo) {
        _saldo.setValue(saldo);
    }

    public void getCurrentUser(Long id) {
        RetrofitMethods methods = RetrofitService.getRetrofitInstance().create(RetrofitMethods.class);
        Call<Conta> data = methods.contaGet(id);
        data.enqueue(new Callback<Conta>() {
            @Override
            public void onResponse(Call<Conta> call, Response<Conta> response) {
                if(response.isSuccessful()) {
                    conta.setValue(response.body());
                } else {
                }
            }

            @Override
            public void onFailure(Call<Conta> call, Throwable t) {

            }
        });
    }
}
