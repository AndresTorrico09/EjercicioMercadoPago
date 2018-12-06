package com.andresleonel09.ejerciciomercadopago.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.andresleonel09.ejerciciomercadopago.Adapter.ComboAdapter;
import com.andresleonel09.ejerciciomercadopago.Models.Banco;
import com.andresleonel09.ejerciciomercadopago.Models.CuotasPago;
import com.andresleonel09.ejerciciomercadopago.Models.ItemComboData;
import com.andresleonel09.ejerciciomercadopago.R;
import com.andresleonel09.ejerciciomercadopago.Utils.Globals;

import java.util.ArrayList;

public class CuotasPagoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuotas_pago);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Button btn = (Button) findViewById(R.id.btn_finalizar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(getApplicationContext(), CuotasPagoActivity.class);
                startActivity(intent);*/
            }
        });

        ArrayList<ItemComboData> list=new ArrayList<>();

        for (CuotasPago.PayerCost m : Globals.getInstance().getCuotasPago().getPayerCosts()) {
            list.add(new ItemComboData(String.valueOf(m.getInstallments()),m.getRecommendedMessage(),R.mipmap.ic_launcher));
        }

        Spinner sp=(Spinner)findViewById(R.id.spinner);
        ComboAdapter adapter=new ComboAdapter(this, R.layout.layout_combo,R.id.txt,list);
        sp.setAdapter(adapter);
    }
}
