package com.facci.restaurantkm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityKM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_km);
    }

    public void click1(View v){
        Toast.makeText(MainActivityKM.this,"Bandeja de Mariscos",Toast.LENGTH_SHORT).show();


    }
    public void click2(View v){
        Toast.makeText(MainActivityKM.this,"Caldo de Gallina",Toast.LENGTH_SHORT).show();
    }
    public void click3(View v){
        Toast.makeText(MainActivityKM.this,"Ceviche de Camarón",Toast.LENGTH_SHORT).show();
    }
    public void click4(View v){
        Toast.makeText(MainActivityKM.this,"Corviche",Toast.LENGTH_SHORT).show();
    }
    public void click5(View v){
        Toast.makeText(MainActivityKM.this,"Pescado Frito",Toast.LENGTH_SHORT).show();
    }
    public void click6(View v){
        Toast.makeText(MainActivityKM.this,"Salprieta",Toast.LENGTH_SHORT).show();
    }
    public void click7(View v){
        Toast.makeText(MainActivityKM.this,"Arroz de Marisco",Toast.LENGTH_SHORT).show();
    }
}
