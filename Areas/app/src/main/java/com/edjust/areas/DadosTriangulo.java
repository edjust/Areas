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

public class DadosTriangulo extends AppCompatActivity {

    private EditText etBaseT;
    private EditText etAlturaT;
    private Button bttnAvancarTriangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dados_triangulo);

        etBaseT = (EditText) findViewById(R.id.etBaseT);
        etAlturaT = (EditText) findViewById(R.id.etAlturaT);
        bttnAvancarTriangulo = (Button) findViewById(R.id.bttnAvançarTriangulo);
    }

    public void clicouTriangulo(View origemDoClique) {

        if ( etBaseT.getText().toString().equals("") || etAlturaT.getText().toString().equals("") ) {
            Toast.makeText(this, "Informe o valor da base e altura", Toast.LENGTH_SHORT).show();

        } else {

            Intent abridor = new Intent(this.getApplicationContext(), AreaTriangulo.class);

            float base = Float.parseFloat(etBaseT.getText().toString());
            float altura = Float.parseFloat(etAlturaT.getText().toString());

            float area = (base * altura) / 2;

            abridor.putExtra("AreaDoTriangulo", area);
            startActivity(abridor);
        }
    }
}
