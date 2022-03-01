package com.example.fourpay.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fourpay.R;
import com.example.fourpay.databinding.FragmentFourthRegisterBinding;
import com.example.fourpay.model.RegisterViewModel;

public class FourthRegisterFragment extends Fragment {

    private FragmentFourthRegisterBinding binding;
    private RegisterViewModel sharedViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFourthRegisterBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        sharedViewModel = new ViewModelProvider(requireActivity()).get(RegisterViewModel.class);

        binding.btnContinuar.setOnClickListener(view1 -> {

            if (!binding.tilSenha.getText().toString().isEmpty() && !binding.edtConfirmarSenha.getText().toString().isEmpty()) {
                if (binding.tilSenha.getText().toString().equals(binding.edtConfirmarSenha.getText().toString())) {
                    // TODO

                } else {
                    binding.edtConfirmarSenha.setError("As senhas precisam ser identicas");
                }
            } else {
                if (binding.tilSenha.getText().toString().isEmpty()) {
                    binding.tilSenha.setError("Preencha a senha");
                }
                if (binding.edtConfirmarSenha.getText().toString().isEmpty()) {
                    binding.edtConfirmarSenha.setError("Preencha a senha");
                }
            }
        });
    }
}