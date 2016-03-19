package com.matheus.isnaldo.calc;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener  {

//public abstract class Calculadora extends Activity implements OnClickListener {

    /* duas variávies do tipo double pra efetuar as operações */
    private double operador1;
    private double operador2;

    /* variável do tipo String que armazena as operações */
    private String operadores;

    /* componente de texto para o visor da calculadora */
    private EditText txt_visor;

    private Button bt_1;
    private Button bt_2;
    private Button bt_3;
    private Button bt_4;
    private Button bt_5;
    private Button bt_6;
    private Button bt_7;
    private Button bt_8;
    private Button bt_9;

    /* componente button, para inserir um ponto no visor pra operações
     * com números decimais */
    private Button bt_ponto;

    /* componentes button para realizar as as quatro operações matemáticas */
    private Button bt_soma;
    private Button bt_subt;
    private Button bt_multi;
    private Button bt_divi;

    /* componente button para gerar o resultado */
    private Button bt_igual;

    /* componente button para limpar o visor da calculadora */
    private Button bt_limpar;

    /* componente button que fecha o aplicativo */
    private Button bt_sair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void inicializar() {

        txt_visor = (EditText) findViewById(R.id.txt_visor);

        Button bt_0 = (Button) findViewById(R.id.bt_0);
        bt_1 = (Button) findViewById(R.id.bt_1);
        bt_2 = (Button) findViewById(R.id.bt_2);
        bt_3 = (Button) findViewById(R.id.bt_3);
        bt_4 = (Button) findViewById(R.id.bt_4);
        bt_5 = (Button) findViewById(R.id.bt_5);
        bt_6 = (Button) findViewById(R.id.bt_6);
        bt_7 = (Button) findViewById(R.id.bt_7);
        bt_8 = (Button) findViewById(R.id.bt_8);
        bt_9 = (Button) findViewById(R.id.bt_9);
        bt_ponto = (Button) findViewById(R.id.bt_ponto);


        bt_soma = (Button) findViewById(R.id.bt_soma);
        bt_subt = (Button) findViewById(R.id.bt_subt);
        bt_multi = (Button) findViewById(R.id.bt_multi);
        bt_divi = (Button) findViewById(R.id.bt_divi);

        bt_igual = (Button) findViewById(R.id.bt_igual);

        bt_limpar = (Button) findViewById(R.id.bt_limpar);
        bt_sair = (Button) findViewById(R.id.bt_sair);

    }

    //tecladonumerocp
    private void tecladoNumerico(int leNumero) {

        if (txt_visor.getText().toString().trim().equals("0.0")) {

            limparVisor();
            txt_visor.setText(txt_visor.getText().toString()
                    + String.valueOf(leNumero));

        } else {

            txt_visor.setText(txt_visor.getText().toString()
                    + String.valueOf(leNumero));

        }

    }

    //Limpa tudo
    private void limparVisor() {

        txt_visor.setText("");

    }

    //ope necessaria
    private void operacoes(String operadores) {

        this.operadores = operadores;

        if (operadores == "+") {

            operador1 = Double.parseDouble(txt_visor.getText().toString().trim());
            limparVisor();

        } else if (operadores == "-") {

            operador1 = Double.parseDouble(txt_visor.getText().toString().trim());
            limparVisor();

        } else if (operadores == "*") {

            operador1 = Double.parseDouble(txt_visor.getText().toString().trim());
            limparVisor();

        } else if (operadores == "/") {

            operador1 = Double.parseDouble(txt_visor.getText().toString().trim());
            limparVisor();

        }

    }

    //Verigualdade
    private void igual() {

        if (!txt_visor.getText().toString().trim().equals("")) {

            if (operadores == "+") {

                operador2 = operador1 + Double.parseDouble(txt_visor.getText().toString().trim());

            } else if (operadores == "-") {

                operador2 = operador1 - Double.parseDouble(txt_visor.getText().toString().trim());

            } else if (operadores == "*") {

                operador2 = operador1 * Double.parseDouble(txt_visor.getText().toString().trim());

            } else if (operadores == "/") {

                if (operador1 == 0) {

                    operador2 = 0;

                } else {

                    operador2 = operador1 / Double.parseDouble(txt_visor.getText().toString().trim());

                }

            }

        } else {

            operador2 = 0;

        }

        txt_visor.setText(String.valueOf(operador2));

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.bt_0:

                tecladoNumerico(0);
                break;

            case R.id.bt_1:

                tecladoNumerico(1);
                break;

            case R.id.bt_2:

                tecladoNumerico(2);
                break;

            case R.id.bt_3:

                tecladoNumerico(3);
                break;

            case R.id.bt_4:

                tecladoNumerico(4);
                break;

            case R.id.bt_5:

                tecladoNumerico(5);
                break;

            case R.id.bt_6:

                tecladoNumerico(6);
                break;

            case R.id.bt_7:

                tecladoNumerico(7);
                break;

            case R.id.bt_8:

                tecladoNumerico(8);
                break;

            case R.id.bt_9:

                tecladoNumerico(9);
                break;

            case R.id.bt_limpar:

                limparVisor();
                break;

            case R.id.bt_igual:

                igual();
                break;




            case R.id.bt_soma:

                operacoes("+");
                break;

            case R.id.bt_subt:

                operacoes("-");
                break;

            case R.id.bt_multi:

                operacoes("*");
                break;

            case R.id.bt_divi:

                operacoes("/");
                break;

        }

    }

     }
