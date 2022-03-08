package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button ir;

 CheckBox pepperoni;
    CheckBox jamon;
    CheckBox aceituna;
    CheckBox cebolla;
    CheckBox salmon;
    CheckBox chile;
    CheckBox sardina;
    CheckBox salchicha;
    TextView total;

    RadioButton pequena;
    RadioButton mediana;
    RadioButton grande;
    EditText cliente;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pequena=findViewById(R.id.rbpequena);
        mediana=findViewById(R.id.rbmediana);
        grande=findViewById(R.id.rbgrande);
        cliente=findViewById(R.id.edtcliente);
        pepperoni=findViewById(R.id.chbpepe);
        jamon=findViewById(R.id.chbjamon);
        aceituna=findViewById(R.id.chbaceituna);
        cebolla=findViewById(R.id.chbcebolla);
        salmon=findViewById(R.id.chbsalmon);
        chile=findViewById(R.id.chbchile);
        sardina=findViewById(R.id.chbsardina);
        salchicha=findViewById(R.id.chbsalchicha);
        total=findViewById(R.id.txttotall);


        ir=findViewById(R.id.btnir);

        ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantalla2 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(pantalla2);



            }
        });













    }
}