package com.johnmolina.calogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import com.johnmolina.calogin.Claves;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnIngresar;
    private EditText etNombre, etPassword;
    private final String NOMBRE   = "User";
    private final String PASSWORD = "1234";
    private Claves claves = new Claves();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        claves.generaClaves(); //genera unas claves de ejemplo
        etNombre = (EditText)findViewById(R.id.etNombre);
        etPassword = (EditText)findViewById(R.id.etPassword);
        btnIngresar = (ImageButton)findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ingresar();
            }
        }); //setOnClickListener
    } //onCreate

    private void ingresar() {
        if ( claves.claveCorrecta(etNombre.getText().toString(), etPassword.getText().toString()) ) {
            Intent intentActivityBienvenida = new Intent(this, ActivityBienvenida.class);
            intentActivityBienvenida.putExtra("nombre", etNombre.getText().toString());
            startActivity(intentActivityBienvenida); //llama a la otra activity
        }
        else
            Toast.makeText(this, "Usuario o contraseña no válidos", Toast.LENGTH_SHORT).show();
    } // ingresar
} //class MainActivity