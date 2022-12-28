package com.tuncbillisim.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayi1 = findViewById(R.id.sayi1);
        sayi2 = findViewById(R.id.sayi2);
        sonuc = findViewById(R.id.sonuc);
    }
    EditText sayi1;
    EditText sayi2;
    TextView sonuc;

    public void toplama(View view)
    {
        if (sayi1.getText().toString().matches("") || sayi2.getText().toString().matches("") || sayi1.getText().toString().matches("") && sayi2.getText().toString().matches(""))
        {
            sonuc.setText("Lütfen Sayı Giriniz!");
        }
        else
        {
            double number1 = Double.parseDouble(sayi1.getText().toString());
            double number2 = Double.parseDouble(sayi2.getText().toString());
            double sonucum = number1 + number2;
            sonuc.setText("" + sonucum);
        }
    }
    public void cikarma(View view)
    {
        if (sayi1.getText().toString().matches("") || sayi2.getText().toString().matches("") || sayi1.getText().toString().matches("") && sayi2.getText().toString().matches(""))
        {
            sonuc.setText("Lütfen Sayı Giriniz!");
        }
        else
        {
            double number1 = Double.parseDouble(sayi1.getText().toString());
            double number2 = Double.parseDouble(sayi2.getText().toString());
            double sonucum = number1 - number2;
            sonuc.setText("" + sonucum);
        }
    }
    public void carpma(View view)
    {
        if (sayi1.getText().toString().matches("") || sayi2.getText().toString().matches("") || sayi1.getText().toString().matches("") && sayi2.getText().toString().matches(""))
        {
            sonuc.setText("Lütfen Sayı Giriniz!");
        }
        else
        {
            double number1 = Double.parseDouble(sayi1.getText().toString());
            double number2 = Double.parseDouble(sayi2.getText().toString());
            double sonucum = number1 * number2;
            sonuc.setText("" + sonucum);
        }
    }
    public void bolme(View view)
    {
        if (sayi1.getText().toString().matches("") || sayi2.getText().toString().matches("") || sayi1.getText().toString().matches("") && sayi2.getText().toString().matches(""))
        {
            sonuc.setText("Lütfen Sayı Giriniz!");
        }
        else if (sayi2.getText().toString().matches("0"))
        {
            sonuc.setText("Tanımsız!");
        }
        else
        {
            double number1 = Double.parseDouble(sayi1.getText().toString());
            double number2 = Double.parseDouble(sayi2.getText().toString());
            double sonucum = number1 / number2;
            sonuc.setText("" + sonucum);
        }
    }
}