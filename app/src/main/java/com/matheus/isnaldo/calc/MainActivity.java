package com.matheus.isnaldo.calc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    /* duas variávies do tipo double pra efetuar as operações */
    private double operador1;
    private double operador2;

    /* variável do tipo String que armazena as operações */
    private String operadores;

    /* componente de texto para o visor da calculadora */
    private EditText txt_visor;

    /* componentes button que para o teclado numérico da calculadora */
    private Button bt_0;
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

        bt_0 = (Button) findViewById(R.id.bt_0);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
