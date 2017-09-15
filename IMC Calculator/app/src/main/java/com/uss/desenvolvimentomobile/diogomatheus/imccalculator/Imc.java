package com.uss.desenvolvimentomobile.diogomatheus.imccalculator;

import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by diogo on 04/09/2017.
 */

public class Imc extends AppCompatActivity {

        private Button botaocalc;
        private EditText altura;
        private EditText peso;
        private Float imc;
        private Float alturaf;
        private Float pesof;
        private TextView resultadoCalculo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        botaocalc = (Button) findViewById(R.id.bt_calcular_id);
        altura = (EditText) findViewById(R.id.altura_id);
        peso = (EditText) findViewById(R.id.peso_id);
        resultadoCalculo = (TextView) findViewById(R.id.resultado_id);

        botaocalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String alturas = altura.getText().toString();
                alturaf = Float.parseFloat(alturas);

                String pesos = peso.getText().toString();
                pesof = Float.parseFloat(pesos);

                imc = (pesof/(alturaf*alturaf));

                if(imc < 16){
                    resultadoCalculo.setText("IMC: "+imc+"\nMagreza Grave");
                }
                else if(imc < 17){
                    resultadoCalculo.setText("IMC: "+imc+"\nMagreza Moderada");
                }
                else if(imc < 18.5){
                    resultadoCalculo.setText("IMC: "+imc+"\nMagreza Leve");
                }
                else if(imc < 25){
                    resultadoCalculo.setText("IMC: "+imc+"\nSaudável");
                }
                else if(imc < 30){
                    resultadoCalculo.setText("IMC: "+imc+"\nSobrepeso");
                }
                else if(imc < 35){
                    resultadoCalculo.setText("IMC: "+imc+"\nObesidade Grau I");
                }
                else if(imc < 40){
                    resultadoCalculo.setText("IMC: "+imc+"\nObesidade Grau II");
                }
                else {
                        resultadoCalculo.setText("IMC: "+imc+"\nObesidade Grau III");
                }



            }

        });


    }
}
