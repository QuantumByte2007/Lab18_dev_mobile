package com.ensa.viewmodellivedatademoenrichi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    CountViewModel viewModel;
    TextView tv;
    Button btn_res, btn_dec, btn_inc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv_num);
        btn_dec = findViewById(R.id.btn_dec);
        btn_res = findViewById(R.id.btn_res);
        btn_inc = findViewById(R.id.btn_inc);

        viewModel = new ViewModelProvider(this).get(CountViewModel.class);
        
        viewModel.getMutData().observe(this, integer -> tv.setText(String.valueOf(integer)));

        btn_inc.setOnClickListener(v -> viewModel.inc());
        btn_dec.setOnClickListener(v -> viewModel.dec());
        btn_res.setOnClickListener(v -> viewModel.reset());
    }
}
