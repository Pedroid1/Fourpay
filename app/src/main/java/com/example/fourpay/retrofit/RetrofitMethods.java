package com.example.fourpay.retrofit;

import com.example.fourpay.model.Cliente;
import com.example.fourpay.model.Conta;
import com.example.fourpay.model.Endereco;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RetrofitMethods {

    @GET("login/{email}/{senha}")
    Call<Conta> contaLoginGet(@Path("email") String email, @Path("senha") String senha);

    @GET("contas/read/{id}")
    Call<Conta> contaGet(@Path("id") int id);

    @POST("enderecos/create")
    Call<Endereco> enderecoPost(@Body Endereco endereco);

    @POST("clientes/create")
    Call<Cliente> clientePost(@Body Cliente cliente);

    @POST("contas/create")
    Call<Conta> contaPost(@Body Conta conta);
}


