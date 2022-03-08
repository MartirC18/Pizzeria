package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button factura;
    CheckBox pepperoni;

    TextView totall;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pepperoni=findViewById(R.id.chbpepe);
        factura=findViewById(R.id.btnfactura);


        totall=findViewById(R.id.txttotall);



    factura.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            if (pepperoni.isChecked()==true){


                totall.setText("Usted selecciono pepperoni");


            }
        }
    });








    }
}