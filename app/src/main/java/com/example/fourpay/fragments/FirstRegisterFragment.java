package com.example.fourpay.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fourpay.R;
import com.example.fourpay.databinding.FragmentFirstRegisterBinding;
import com.example.fourpay.model.Cliente;
import com.example.fourpay.model.Conta;
import com.example.fourpay.model.Endereco;
import com.example.fourpay.model.RegisterViewModel;
import com.example.fourpay.retrofit.RetrofitMethods;
import com.example.fourpay.retrofit.RetrofitService;

import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class FirstRegisterFragment extends Fragment {

    private FragmentFirstRegisterBinding binding = null;
    private RegisterViewModel sharedViewModel = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFirstRegisterBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sharedViewModel = new ViewModelProvider(requireActivity()).get(RegisterViewModel.class);
        binding.setViewModel(sharedViewModel);

        RetrofitMethods retrofitMethods = RetrofitService.getRetrofitInstance().create(RetrofitMethods.class);



        binding.btnContinuar.setOnClickListener(view1 -> {
            if (!binding.txtNome.getText().toString().isEmpty() &&
                    !binding.edtDataNascimento.getText().toString().isEmpty() &&
                    !binding.tilCpf.getText().toString().isEmpty() &&
                    !binding.edtRg.getText().toString().isEmpty() &&
                    !binding.txtEmail.getText().toString().isEmpty() &&
                    !binding.txtNumero.getText().toString().isEmpty()) {

                goToNextScreen();

            } else {
                if (binding.txtNome.getText().toString().isEmpty()) {
                    binding.txtNome.setError("Nome obrigatório");
                }
                if (binding.edtDataNascimento.getText().toString().isEmpty()) {
                    binding.edtDataNascimento.setError("Data de nascimento obrigatório");
                }
                if (binding.tilCpf.getText().toString().isEmpty()) {
                    binding.tilCpf.setError("CPF obrigatório");
                }
                if (binding.edtRg.getText().toString().isEmpty()) {
                    binding.edtRg.setError("RG obrigatório");
                }
                if (binding.txtEmail.getText().toString().isEmpty()) {
                    binding.txtEmail.setError("E-mail obrigatório");
                }
                if (binding.txtNumero.getText().toString().isEmpty()) {
                    binding.txtNumero.setError("Celular obrigatório");
                }
            }
        });
    }

    public void goToNextScreen() {
        NavHostFragment.findNavController(FirstRegisterFragment.this).navigate(R.id.action_firstRegisterFragment_to_secondRegisterFragment);
    }
}