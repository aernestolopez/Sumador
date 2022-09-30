package com.example.sumador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.editTextNumber);
        et2=findViewById(R.id.editTextNumber2);
        tv1=findViewById(R.id.textView);
    }

    public void sumar(View view) {
        //Creamos unas condiciones para que si el usuario no introduce un numero la aplicacion no deje de funcionar
        //para esto se pondrán 0 como los numeros para las operaciones
        if(et1.getText().toString().isEmpty()){
            et1.setText("0");
        }if(et2.getText().toString().isEmpty()){
            et2.setText("0");
        }
        // Obtenemos los números
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        // Hacemos la suma
        int suma=n1+n2;
        // Establecemos el resultado en el TextView
        tv1.setText(""+suma);
    }

    public void restar(View view){
        //Creamos unas condiciones para que si el usuario no introduce un numero en las cajas de texto nosotros initroducimos
        //el numero 0
        if(et1.getText().toString().isEmpty()){
            et1.setText("0");
        }if(et2.getText().toString().isEmpty()){
            et2.setText("0");
        }
        // Obtenemos los números
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        // Hacemos la resta
        int resta=n1-n2;
        // Establecemos el resultado en el TextView
        tv1.setText(""+resta);
    }

    public void multiplicar(View view){
        if(et1.getText().toString().isEmpty()){
            et1.setText("0");
        }if(et2.getText().toString().isEmpty()){
            et2.setText("0");
        }
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int multiplicacion=n1*n2;
        tv1.setText(""+multiplicacion);

    }

public void dividir(View view){
        //Se comprueba que el usuario haya pasado parametros en caso negativo se ponen 0
    if(et2.getText().toString().isEmpty()){
        et2.setText("0");
    }if(et1.getText().toString().isEmpty()){
        et1.setText("0");
    }
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        //se comprueba que el parametro divisor no sea 0, en caso afirmativo se le hace saber al usuario que no se puede dividir
        if(n2!=0){
            int dividir=n1/n2;
            tv1.setText(""+dividir);
        }if(n2==0){
            tv1.setText("No se puede dividir");
        }
}

}