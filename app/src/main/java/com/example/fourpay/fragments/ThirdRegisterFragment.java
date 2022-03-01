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
import com.example.fourpay.databinding.FragmentThirdRegisterBinding;
import com.example.fourpay.model.RegisterViewModel;

public class ThirdRegisterFragment extends Fragment {

    private FragmentThirdRegisterBinding binding = null;
    private RegisterViewModel sharedViewModel = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentThirdRegisterBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        sharedViewModel = new ViewModelProvider(requireActivity()).get(RegisterViewModel.class);

        binding.btnContinuar.setOnClickListener(view2 -> {
            String renda = binding.edtRenda.getText().toString();

            if (!renda.isEmpty()) {

                sharedViewModel.setRenda(binding.edtRenda.getText().toString());

            } else {

                if (renda.isEmpty()) {
                    binding.edtRenda.setError("Renda obrigatória");
                }
            }
        });
    }
}