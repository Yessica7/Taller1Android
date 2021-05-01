package co.yessica.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.VirtualLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView txtView;
    private Button btnAumentar, btnCambiar, btnEsconder;
    int ValTxt = 0;
    public ArrayList<Integer> colores;
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
        colores =new ArrayList<>();

        colores.add(Color.YELLOW);
        colores.add(Color.GREEN);
        colores.add(Color.RED);
        colores.add(Color.BLUE);
        colores.add(Color.BLACK);

        TextView txtView = (TextView) findViewById(R.id.HolaMundo);
        btnAumentar = (Button) findViewById(R.id.btnAumentar);
        btnAumentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ValTxt == 0) {
                    ValTxt = 24;
                }
                if (ValTxt < 50) {
                    ValTxt = ValTxt + 2;
                    txtView.setTextSize(ValTxt);
                }
                else
                    ValTxt = 14;

            }
        });

        btnCambiar = (Button) findViewById(R.id.btnCambiar);
        btnCambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            txtView.setTextColor(colores.get(0));
            contador = contador + 1;
            if(contador == colores.size()){
                contador=0;
                txtView.setTextColor(colores.get(contador));
            }else{
                txtView.setTextColor(colores.get(contador));
            }
            System.out.println(contador + "" + colores.size());

            }
        });

        btnEsconder = (Button) findViewById(R.id.btnEsconder);
        btnEsconder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txtView.getVisibility()==View.INVISIBLE){
                    txtView.setVisibility(View.VISIBLE);
                }else{
                    txtView.setVisibility(View.INVISIBLE);
                }


            }
        });
    }

}