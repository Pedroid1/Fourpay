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

<<<<<<< HEAD
=======

>>>>>>> viewBinding
        binding.btnContinuar.setOnClickListener(view1 -> {
            String nome = binding.edtDataNascimento.getText().toString();
            String dataNascimento = binding.tilCpf.getText().toString();
            String cpf = binding.tilCpf.getText().toString();
            String rg = binding.edtRg.getText().toString();
            String email = binding.txtEmail.getText().toString();
            String numero = binding.txtNumero.getText().toString();

            if (!nome.isEmpty() &&
                    !dataNascimento.isEmpty() &&
                    !cpf.isEmpty() &&
                    !rg.isEmpty() &&
                    !email.isEmpty() &&
                    !numero.isEmpty()) {

                    sharedViewModel.setNomeCompleto(nome);
                    sharedViewModel.setDataNascimento(nome);
                    sharedViewModel.setCpf(nome);
                    sharedViewModel.setRg(nome);
                    sharedViewModel.setEmail(nome);
                    sharedViewModel.setNumero(nome);


                goToNextScreen();

            } else {
                if (nome.isEmpty()) {
                    binding.txtNome.setError("Nome obrigatório");
                }
                if (dataNascimento.isEmpty()) {
                    binding.edtDataNascimento.setError("Data de nascimento obrigatório");
                }
                if (cpf.isEmpty()) {
                    binding.tilCpf.setError("CPF obrigatório");
                }
                if (rg.isEmpty()) {
                    binding.edtRg.setError("RG obrigatório");
                }
                if (email.isEmpty()) {
                    binding.txtEmail.setError("E-mail obrigatório");
                }
                if (numero.isEmpty()) {
                    binding.txtNumero.setError("Celular obrigatório");
                }
            }
        });
    }

    public void goToNextScreen() {
        NavHostFragment.findNavController(FirstRegisterFragment.this).navigate(R.id.action_firstRegisterFragment_to_secondRegisterFragment);
    }
}