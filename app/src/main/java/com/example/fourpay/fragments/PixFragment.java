package com.example.fourpay.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fourpay.R;
import com.example.fourpay.databinding.FragmentPixBinding;
import com.example.fourpay.model.viewmodel.HomeViewModel;


public class PixFragment extends Fragment {
    private FragmentPixBinding binding = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPixBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.transferirPix.setOnClickListener(view1 -> {
            NavHostFragment.findNavController(this).navigate(R.id.action_pixFragment_to_pixDadosFragment);

        });

    }
}