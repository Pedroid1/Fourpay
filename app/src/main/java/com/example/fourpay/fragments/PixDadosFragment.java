package com.example.fourpay.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.example.fourpay.R;
import com.example.fourpay.databinding.FragmentPixDadosBinding;
import com.example.fourpay.model.viewmodel.HomeViewModel;


public class PixDadosFragment extends Fragment {

    private FragmentPixDadosBinding binding = null;
    private HomeViewModel sharedViewModel = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPixDadosBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sharedViewModel = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        binding.setPixViewModel(sharedViewModel);

        binding.btnContinuar2.setOnClickListener(view1 -> {
            if (!binding.editValorPagar.getText().toString().isEmpty()) {
                Double valorPagar = Double.parseDouble(binding.editValorPagar.getText().toString());
                if (valorPagar <= sharedViewModel.getConta().getSaldo()) {
                    sharedViewModel.getConta().setSaldo(sharedViewModel.getConta().getSaldo() - valorPagar);
                    sharedViewModel.updateUser();
                    navigateToConfirmacao();
                }
            }
        });
    }

    private void navigateToConfirmacao() {
        NavHostFragment.findNavController(this).navigate(R.id.action_pixDadosFragment_to_pagamentoConfirmacaoFragment);
    }
}