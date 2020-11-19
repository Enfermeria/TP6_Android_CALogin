package com.johnmolina.calogin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;




public class ActivityBienvenida extends AppCompatActivity {
    private TextView tvSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        tvSaludo = (TextView)findViewById(R.id.tvSaludo);
        tvSaludo.setText( "Bienvenido " + getIntent().getStringExtra("nombre") );
    }
}