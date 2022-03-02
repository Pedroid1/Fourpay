package com.example.fourpay.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.fourpay.R;
import com.example.fourpay.databinding.ActivityHomeBinding;
import com.example.fourpay.model.Conta;
import com.example.fourpay.model.viewmodel.HomeViewModel;


public class HomeActivity extends AppCompatActivity {

    public static final String KEY_ID = "ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent getIntent = getIntent();
        Long id = getIntent.getLongExtra(KEY_ID, -1);

    }

    public void abrirMeusCartoes(View view) {
        startActivity(new Intent(HomeActivity.this, MeusCartoesActivity.class));
    }

    public void abrirEmprestimo(View view) {
        startActivity(new Intent(HomeActivity.this, EmprestimoActivity.class));
    }

    public void abrirTelaPix(View view) {
        startActivity(new Intent(HomeActivity.this, PixActivity.class));
    }

    public void abrirScanQrCode(View view) {
        startActivity(new Intent(HomeActivity.this, ScanQRCodeActivity.class));
    }

    public void abrirTransferencia(View view) {
        startActivity(new Intent(HomeActivity.this, TransferenciaActivity.class));
    }

    public void abrirRecarga(View view) {
        startActivity(new Intent(HomeActivity.this, RecargaActivity.class));
    }

    public void abrirConfiguracao(View view) {
        startActivity(new Intent(HomeActivity.this, ConfiguracaoActivity.class));
    }

    public void abrirDeposito(View view) {
        startActivity(new Intent(HomeActivity.this, DepositoActivity.class));
    }

}



