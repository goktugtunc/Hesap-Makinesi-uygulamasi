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
            sonuc.setText(number1 + " + " + number2 + " = " + sonucum);
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
            sonuc.setText(number1 + " - " + number2 + " = " + sonucum);
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
            sonuc.setText(number1 + " * " + number2 + " = " + sonucum);
        }
    }
    public void mod(View view)
    {
        if (sayi1.getText().toString().matches("") || sayi2.getText().toString().matches("") || sayi1.getText().toString().matches("") && sayi2.getText().toString().matches(""))
        {
            sonuc.setText("Lütfen Sayı Giriniz!");
        }
        else
        {
            double number1 = Double.parseDouble(sayi1.getText().toString());
            double number2 = Double.parseDouble(sayi2.getText().toString());
            double sonucum = number1 % number2;
            sonuc.setText(number1 + " % " + number2 + " = " + sonucum);
        }
    }
    public void log(View View)
    {
        if (sayi1.getText().toString().matches("") || sayi2.getText().toString().matches("") || sayi1.getText().toString().matches("") && sayi2.getText().toString().matches(""))
        {
            sonuc.setText("Lütfen Sayı Giriniz!");
        }
        else
        {
            double number1 = Double.parseDouble(sayi1.getText().toString());
            double number2 = Double.parseDouble(sayi2.getText().toString());
            double sonucum = Math.log(number2) / Math.log(number1);
            sonuc.setText(number1 + " logaritma " + number2 + " = " + sonucum);
        }
    }
    public void us(View view)
    {
        if (sayi1.getText().toString().matches("") || sayi2.getText().toString().matches("") || sayi1.getText().toString().matches("") && sayi2.getText().toString().matches(""))
        {
            sonuc.setText("Lütfen Sayı Giriniz!");
        }
        else
        {
            double number1 = Double.parseDouble(sayi1.getText().toString());
            double number2 = Double.parseDouble(sayi2.getText().toString());
            double sonucum = Math.pow(number1, number2);
            sonuc.setText(number1 + " üssü " + number2 + " = " + sonucum);
        }
    }
    public void sin(View view)
    {
        if (sayi1.getText().toString().matches(""))
        {
            sonuc.setText("Lütfen Sayı Giriniz!");
        }
        else
        {
            double number1 = Double.parseDouble(sayi1.getText().toString());
            double sonucum = Math.sin(number1);
            sonuc.setText("sin(" + number1 + ") = " + sonucum);
        }
    }
    public void cos(View view)
    {
        if (sayi1.getText().toString().matches(""))
        {
            sonuc.setText("Lütfen Sayı Giriniz!");
        }
        else
        {
            double number1 = Double.parseDouble(sayi1.getText().toString());
            double sonucum = Math.cos(number1);
            sonuc.setText("cos(" + number1 + ") = " + sonucum);
        }
    }
    public void tan(View view)
    {
        if (sayi1.getText().toString().matches(""))
        {
            sonuc.setText("Lütfen Sayı Giriniz!");
        }
        else {
            double number1 = Double.parseDouble(sayi1.getText().toString());
            double sonucum = Math.tan(number1);
            sonuc.setText("tan(" + number1 + ") = " + sonucum);
        }
    }
    public void cot(View view)
    {
        if (sayi1.getText().toString().matches(""))
        {
            sonuc.setText("Lütfen Sayı Giriniz!");
        }
        else
        {
            double number1 = Double.parseDouble(sayi1.getText().toString());
            double asdasd = Math.cos(number1);
            double deneme = Math.sin(number1);
            double sonucum = asdasd / deneme;
            sonuc.setText("cot(" + number1 + ") = " + sonucum);
        }
    }
    public void ln(View view)
    {
        if (sayi1.getText().toString().matches(""))
        {
            sonuc.setText("Lütfen Sayı Giriniz!");
        }
        else
        {
            double number1 = Double.parseDouble(sayi1.getText().toString());
            double sonucum = Math.log10(number1);
            sonuc.setText("ln(" + number1 + ") = " + sonucum);
        }
    }
    public void karekok(View view)
    {
        if (sayi1.getText().toString().matches(""))
        {
            sonuc.setText("Lütfen Sayı Giriniz!");
        }
        else
        {
            double number1 = Double.parseDouble(sayi1.getText().toString());
            double sonucum = Math.sqrt(number1);
            sonuc.setText("Karekök " + number1 + " = " + sonucum);
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
            sonuc.setText(number1 + " / " + number2 + " = " + sonucum);
        }
    }
}