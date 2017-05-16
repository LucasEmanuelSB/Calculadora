package com.emanuelsb.lucas.basiccalculator;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class basic_calculator extends AppCompatActivity{

    private EditText campoOperando1;

    private EditText campoOperando2;

    private Button calcular;

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

        soma = (RadioButton)findViewById(R.id.soma);
        sub = (RadioButton)findViewById(R.id.sub);
        divi = (RadioButton)findViewById(R.id.divi);
        multi = (RadioButton)findViewById(R.id.multi);

        calcular= (Button) findViewById(R.id.calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (campoOperando1.length() == 0){
                    Toast.makeText(getApplicationContext(), "Campo do operando 1 vazio",Toast.LENGTH_SHORT).show();
                }
                else if (campoOperando1.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Campo do operando 2 vazio",Toast.LENGTH_SHORT).show();

                } else if (Double.parseDouble(campoOperando2.getText().toString()) == 0) {
                    AlertDialog.Builder alerta = new AlertDialog.Builder(basic_calculator.this);
                    alerta.setTitle("Erro");
                    alerta.setIcon(R.drawable.error);
                    alerta.setMessage("Impossível dividir por 0");
                    alerta.show();
                } else {

                    double valor1 = Double.parseDouble(campoOperando1.getText().toString());
                    double valor2 = Double.parseDouble(campoOperando2.getText().toString());

                    if (soma.isChecked()) {
                        AlertDialog.Builder alerta = new AlertDialog.Builder(basic_calculator.this);
                        alerta.setTitle("Resposta: ");
                        alerta.setMessage(Double.toString(valor1 + valor2));
                        alerta.show();
                    } else if (sub.isChecked()) {
                        AlertDialog.Builder alerta = new AlertDialog.Builder(basic_calculator.this);
                        alerta.setTitle("Resposta: ");
                        alerta.setMessage(Double.toString(valor1 - valor2));
                        alerta.show();
                    } else if (multi.isChecked()) {
                        AlertDialog.Builder alerta = new AlertDialog.Builder(basic_calculator.this);
                        alerta.setTitle("Resposta: ");
                        alerta.setMessage(Double.toString(valor1 * valor2));
                        alerta.show();
                    } else if (divi.isChecked()) {
                        AlertDialog.Builder alerta = new AlertDialog.Builder(basic_calculator.this);
                        alerta.setTitle("Resposta: ");
                        alerta.setMessage(Double.toString(valor1 / valor2));
                        alerta.show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Nenhuma operação foi selecionada", Toast.LENGTH_SHORT).show();

                    }
                }

            }
        });

    }

    }

