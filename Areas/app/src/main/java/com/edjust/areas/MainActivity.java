package com.edjust.areas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton rbRetangulo;
    private RadioButton rbTriangulo;
    private RadioButton rbCirculo;
    private RadioGroup rgSelecao;
    private Button bttnAvançar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbRetangulo = (RadioButton) findViewById(R.id.rbRetangulo);
        rbTriangulo = (RadioButton) findViewById(R.id.rbTriangulo);
        rbCirculo = (RadioButton) findViewById(R.id.rbCirculo);
        rgSelecao = (RadioGroup) findViewById(R.id.rgSelecao);
        bttnAvançar = (Button) findViewById(R.id.bttnAvançar);

    }

    public void clicouNoBotao(View origemDoClique){
        //Intent abridor = new Intent(this.getApplicationContext(), DadosCirculo.class);
        //Intent abridor = new Intent(this.getApplicationContext(), DadosTriangulo.class);
        //Intent abridor = new Intent(this.getApplicationContext(), DadosRetangulo.class);

        //startActivity(abridor);

        int rb = rgSelecao.getCheckedRadioButtonId();
        RadioButton selecao = (RadioButton) findViewById(rb);

        if( selecao == null ){
            Toast.makeText(MainActivity.this.getApplicationContext(), "Escolha uma das opções acima", Toast.LENGTH_SHORT).show();

        }else if( selecao.getText().toString().equals("Retângulo") ){
            Intent abridor = new Intent(this.getApplicationContext(), DadosRetangulo.class);
            startActivity(abridor);

        }else if( selecao.getText().toString().equals("Triângulo") ){
            Intent abridor = new Intent(this.getApplicationContext(), DadosTriangulo.class);
            startActivity(abridor);

        }else if( selecao.getText().toString().equals("Circulo") ){
            Intent abridor = new Intent(this.getApplicationContext(), DadosCirculo.class);
            startActivity(abridor);
        }

    }
}
