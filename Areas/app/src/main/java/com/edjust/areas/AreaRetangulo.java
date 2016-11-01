package com.edjust.areas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Edgar on 11/1/16.
 */

public class AreaRetangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area_retangulo);

        float area = getIntent().getFloatExtra("AreaDoRetangulo", 0);
        String areastring = String.valueOf(area);
        TextView tvAreaR = (TextView) findViewById(R.id.tvAreaRetangulo);
        tvAreaR.setText("Área: "+areastring+"cm²");
    }

    public void Voltar(View origemDoClique) {
        Intent abridor = new Intent(this.getApplicationContext(), MainActivity.class);
        startActivity(abridor);
    }
}
