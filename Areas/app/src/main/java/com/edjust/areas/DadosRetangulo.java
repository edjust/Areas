package com.edjust.areas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Edgar on 11/1/16.
 */

public class DadosRetangulo extends AppCompatActivity {

    private EditText etBaseR;
    private EditText etAlturaR;
    private Button bttnAvancarRetangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dados_retangulo);

        etBaseR = (EditText) findViewById(R.id.etBaseR);
        etAlturaR = (EditText) findViewById(R.id.etAlturaR);
        bttnAvancarRetangulo = (Button) findViewById(R.id.bttnAvançarRetangulo);
    }

    public void clicouRetangulo(View origemDoClique) {
        if ( etBaseR.getText().toString().equals("") || etAlturaR.getText().toString().equals("") ) {
            Toast.makeText(this, "Informe o valor da base e altura", Toast.LENGTH_SHORT).show();

        } else {

            Intent abridor = new Intent(this.getApplicationContext(), AreaRetangulo.class);

            float base = Float.parseFloat(etBaseR.getText().toString());
            float altura = Float.parseFloat(etAlturaR.getText().toString());

            float area = (base * altura);

            abridor.putExtra("AreaDoRetangulo", area);
            startActivity(abridor);
        }
    }
}
