package com.example.fourpay.fragments;

import android.icu.text.IDNA;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.fourpay.R;
import com.example.fourpay.SenhaFragment;
import com.example.fourpay.databinding.FragmentConfirmacaoEmprestimoBinding;
import com.example.fourpay.model.Conta;
import com.example.fourpay.model.viewmodel.HomeViewModel;
import com.example.fourpay.retrofit.RetrofitMethods;
import com.example.fourpay.retrofit.RetrofitService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ConfirmacaoEmprestimoFragment extends Fragment {

    private FragmentConfirmacaoEmprestimoBinding binding = null;
    private HomeViewModel viewModel = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentConfirmacaoEmprestimoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModel = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(getViewLifecycleOwner());

        binding.txtValorEmprestimo.setText(viewModel.getValorSimulado().getValue());
        binding.txtDataPagamento.setText(viewModel.getDiaPagamento().getValue());
        binding.txtQuantidadeParcelas.setText(viewModel.getParcelas().getValue());

        binding.btnContratar.setOnClickListener(view1 -> {
            // replaceFragment(new SenhaFragment());
            registerEmprestimo();
            goToNextScreen();
        });

        binding.btnVoltar.setOnClickListener(view1 -> {
            backToPreviousScreen();
        });

    }

   /* private void replaceFragment(SenhaFragment senhaFragment) {
        binding.btnContratar.setVisibility(View.INVISIBLE);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame, senhaFragment);
        fragmentTransaction.commit();
    } */

    public void registerEmprestimo() {
        Double valSimulado = Double.parseDouble(viewModel.getValorSimulado().getValue());
        Double saldoAtual = viewModel.getConta().getSaldo() + valSimulado;
        viewModel.getConta().setSaldo(saldoAtual);
        viewModel.updateUser();
    }

    private void backToPreviousScreen() {
        NavHostFragment.findNavController(ConfirmacaoEmprestimoFragment.this).navigate(R.id.action_confirmacaoEmprestimoFragment_to_emprestimoFragment);
    }

    private void goToNextScreen() {
        NavHostFragment.findNavController(ConfirmacaoEmprestimoFragment.this).navigate(R.id.action_confirmacaoEmprestimoFragment_to_pagamentoRealizadoFragment);
    }
}