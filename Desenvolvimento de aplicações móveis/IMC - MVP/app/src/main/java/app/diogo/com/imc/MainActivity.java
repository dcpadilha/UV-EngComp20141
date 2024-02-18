package app.diogo.com.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botaocalc;
    private EditText altura;
    private EditText peso;
    private Float imc;
    private Float alturaf;
    private Float pesof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaocalc = (Button) findViewById(R.id.bt_calcular_id);
        altura = (EditText) findViewById(R.id.altura_id);
        peso = (EditText) findViewById(R.id.peso_id);

        botaocalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String alturas = altura.getText().toString();
               alturaf = Float.parseFloat(alturas);

               String pesos = peso.getText().toString();
               pesof = Float.parseFloat(pesos);

               imc = (pesof/(alturaf*alturaf));

               if(imc < 17){
                   Toast.makeText(MainActivity.this, "IMC: "+imc+" Muito abaixo do peso", Toast.LENGTH_LONG).show();
               }
               else if(imc < 18.5){
                    Toast.makeText(MainActivity.this, "IMC: "+imc+" Abaixo do peso", Toast.LENGTH_LONG).show();
                }
               else if(imc < 24.5){
                   Toast.makeText(MainActivity.this, "IMC: "+imc+" Peso normal", Toast.LENGTH_LONG).show();
               }
               else if(imc < 30){
                   Toast.makeText(MainActivity.this, "IMC: "+imc+" Acima do peso", Toast.LENGTH_LONG).show();
               }
               else if(imc < 35){
                   Toast.makeText(MainActivity.this, "IMC: "+imc+" Obesidade I", Toast.LENGTH_LONG).show();
               }
               else if(imc < 40){
                   Toast.makeText(MainActivity.this, "IMC: "+imc+" Obesidade II (severa)", Toast.LENGTH_LONG).show();
               }
               else {
                   Toast.makeText(MainActivity.this, "IMC: "+imc+" Obesidade III (mórbida)", Toast.LENGTH_LONG).show();
               }

            }
        });


    }
}
