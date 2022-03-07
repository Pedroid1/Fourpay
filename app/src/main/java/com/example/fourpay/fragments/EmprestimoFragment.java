package com.example.fourpay.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fourpay.R;
import com.example.fourpay.activitys.EmprestimoConfirmarActivity;
import com.example.fourpay.activitys.FotoActivity;
import com.example.fourpay.activitys.HomeActivity;
import com.example.fourpay.databinding.FragmentEmprestimoBinding;
import com.example.fourpay.model.viewmodel.HomeViewModel;

public class EmprestimoFragment extends Fragment {


    private FragmentEmprestimoBinding binding = null;
    private HomeViewModel viewModel = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentEmprestimoBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModel = new ViewModelProvider(requireActivity()).get(HomeViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(getViewLifecycleOwner());

        binding.btnVoltar.setOnClickListener(view1 -> {
            backToPreviousScreen();
        });

        binding.btnAcessar.setOnClickListener(view1 -> {

            if (!binding.melhorData.getSelectedItem().equals("") && !binding.parcelas.getSelectedItem().equals("") && !binding.valorSimular.getText().toString().isEmpty()) {

                if (Float.parseFloat(binding.valorSimular.getText().toString()) > 5000f)
                    binding.valorSimular.setError("Valor indisponível");
                else {
                    viewModel.set_parcelas(binding.parcelas.getSelectedItem().toString());
                    viewModel.set_diaPagamento(binding.melhorData.getSelectedItem().toString());
                    viewModel.set_valorSimulado(binding.valorSimular.getText().toString());
                    goToNextScreen();
                }
            } else {

                if (binding.melhorData.getSelectedItem().equals("")) {
                    ((TextView) binding.melhorData.getSelectedView()).setError("Selecione um campo");
                }
                if (binding.parcelas.getSelectedItem().equals("")) {
                    ((TextView) binding.parcelas.getSelectedView()).setError("Selecione um campo");
                }
                if (binding.valorSimular.getText().toString().isEmpty()) {
                    binding.valorSimular.setError("Preencha o campo");
                }
            }
        });
    }
    private void backToPreviousScreen() {
        NavHostFragment.findNavController(EmprestimoFragment.this).navigate(R.id.action_emprestimoFragment_to_homeFragment);
    }
    private void goToNextScreen() {
        NavHostFragment.findNavController(EmprestimoFragment.this).navigate(R.id.action_emprestimoFragment_to_confirmacaoEmprestimoFragment);
    }

}