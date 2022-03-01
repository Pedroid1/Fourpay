package com.example.fourpay.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.fourpay.databinding.FragmentSecondRegisterBinding;
import com.example.fourpay.model.RegisterViewModel;

public class SecondRegisterFragment extends Fragment {

    private FragmentSecondRegisterBinding binding = null;
    private RegisterViewModel sharedViewModel = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondRegisterBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        sharedViewModel = new ViewModelProvider(requireActivity()).get(RegisterViewModel.class);

        binding.btnContinuar.setOnClickListener(view1 -> {

            if (!binding.edtCep.getText().toString().isEmpty() &&
                    !binding.edtEndereco.getText().toString().isEmpty() &&
                    !binding.edtBairro.getText().toString().isEmpty() &&
                    !binding.edtCidade.getText().toString().isEmpty() &&
                    !binding.edtEstado.getText().toString().isEmpty() &&
                    !binding.edtNumeroCasa.getText().toString().isEmpty()) {

                // TODO

            } else {

                if (binding.edtCep.getText().toString().isEmpty()) {
                    binding.edtCep.setError("Cambo obrigatório");
                }
                if (binding.edtEndereco.getText().toString().isEmpty()) {
                    binding.edtEndereco.setError("Cambo obrigatório");
                }
                if (binding.edtBairro.getText().toString().isEmpty()) {
                    binding.edtBairro.setError("Cambo obrigatório");
                }
                if (binding.edtCidade.getText().toString().isEmpty()) {
                    binding.edtCidade.setError("Cambo obrigatório");
                }
                if (binding.edtEstado.getText().toString().isEmpty()) {
                    binding.edtEstado.setError("Cambo obrigatório");
                }
                if (binding.edtNumeroCasa.getText().toString().isEmpty()) {
                    binding.edtNumeroCasa.setError("Cambo obrigatório");
                }
            }
        });


    }
}