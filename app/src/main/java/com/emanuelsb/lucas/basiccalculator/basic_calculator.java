package com.emanuelsb.lucas.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class basic_calculator extends AppCompatActivity{

    private EditText campoOperando1;

    private EditText campoOperando2;

    private Button calcular;

    private TextView resultado;

    private RadioGroup operacoes;

    private RadioButton soma;

    private RadioButton sub;

    private RadioButton multi;

    private RadioButton divi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calculator);

        campoOperando1 = (EditText)findViewById(R.id.campoOperando1);
        campoOperando2 = (EditText)findViewById(R.id.campoOperando2);

        resultado = (TextView)findViewById(R.id.resultado);

        soma = (RadioButton)findViewById(R.id.soma);
        sub = (RadioButton)findViewById(R.id.sub);
        divi = (RadioButton)findViewById(R.id.divi);
        multi = (RadioButton)findViewById(R.id.multi);

        calcular= (Button) findViewById(R.id.calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double valor1 = Double.parseDouble(campoOperando1.getText().toString());
                double valor2 = Double.parseDouble(campoOperando2.getText().toString());
                double resposta = 0;
            /*
                if ("".equals(campoOperando1.getText()))
                    Toast.makeText(this.getApplicationContext(), "Nenhum número encontrado no operando 1!", Toast.LENGTH_SHORT);
                if ("".equals(campoOperando1.getText())) {
                    Toast.makeText(this.getApplicationContext(), "Nenhum número encontrado no operando 2!", Toast.LENGTH_SHORT);
                } else if (Double.parseDouble(campoOperando2.getText().toString()) == 0) {
                    Toast.makeText(this.getApplicationContext(), "Impossível dividir por zero!", Toast.LENGTH_SHORT);
                }
            */

                if (operacoes.isEnabled()) {

                    if (soma.isChecked())
                        resposta = valor1 + valor2;

                    if (sub.isChecked())
                        resposta = valor1 - valor2;

                    if (multi.isChecked())
                        resposta = valor1 * valor2;

                    if (divi.isChecked())
                        resposta = valor1 / valor2;

                    if(resultado.getText().toString().equals(""))
                    resultado.setText(resultado.getText() + " " + Double.toString(resposta));

                else{
                    //Toast.makeText(this.getApplicationContext(), "Nenhuma operacão foi selecionada!", Toast.LENGTH_SHORT );
                }

            }
        });

    }

    }

