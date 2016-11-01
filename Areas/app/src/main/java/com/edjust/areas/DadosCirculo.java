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

public class DadosCirculo extends AppCompatActivity {

    private EditText etRaio;
    private Button bttnAvancarCirculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dados_circulo);

        etRaio = (EditText) findViewById(R.id.etRaio);
        bttnAvancarCirculo= (Button) findViewById(R.id.bttnAvançarCirculo);
    }

    public void clicouCirculo(View origemDoClique) {

        if ( etRaio.getText().toString().equals("") ) {
            Toast.makeText(this, "Informe o valor do raio", Toast.LENGTH_SHORT).show();

        } else {

            Intent abridor = new Intent(this.getApplicationContext(), AreaCirculo.class);

            float raio = Float.parseFloat(etRaio.getText().toString());
            float pi = (float) 3.14159265359;

            float area = (raio * raio) * pi;

            abridor.putExtra("AreaDoCirculo", area);
            startActivity(abridor);
        }
    }
}
