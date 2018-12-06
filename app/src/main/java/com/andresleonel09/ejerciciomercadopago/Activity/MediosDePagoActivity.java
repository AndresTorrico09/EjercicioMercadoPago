package com.andresleonel09.ejerciciomercadopago.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

import com.andresleonel09.ejerciciomercadopago.Api.MercadoPagoService;
import com.andresleonel09.ejerciciomercadopago.Models.PagoActual;
import com.andresleonel09.ejerciciomercadopago.Utils.Globals;
import com.andresleonel09.ejerciciomercadopago.Models.ItemComboData;
import com.andresleonel09.ejerciciomercadopago.Models.MedioDePago;
import com.andresleonel09.ejerciciomercadopago.R;
import com.andresleonel09.ejerciciomercadopago.Adapter.ComboAdapter;

import java.util.ArrayList;

public class MediosDePagoActivity extends AppCompatActivity {
    public static final String PUBLIC_KEY = "444a9ef5-8a6b-429f-abdf-587639155d88";
    public static final String PAYMENT_METHOD = "visa";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medios_de_pago);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        Button btn = (Button) findViewById(R.id.btn_siguiente);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BancosActivity.class);
                startActivity(intent);
            }
        });

        Globals g = Globals.getInstance();
        ArrayList<ItemComboData> list=new ArrayList<>();

        for (MedioDePago m : g.getlistMP()) {
            list.add(new ItemComboData(m.getId(),m.getName(),R.mipmap.ic_launcher));
        }

        Spinner sp=(Spinner)findViewById(R.id.spinner);
        ComboAdapter adapter=new ComboAdapter(this, R.layout.layout_combo,R.id.txt,list);
        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                ItemComboData item = (ItemComboData)parent.getItemAtPosition(position);

                PagoActual p = Globals.getInstance().getPagoActualActual() == null ? new PagoActual() : Globals.getInstance().getPagoActualActual();
                p.setMetodo_pago(item.getId());
                Globals.getInstance().setPagoActualActual(p);

                MercadoPagoService.getInstance().getBancos(PUBLIC_KEY,item.getId());

            } // to close the onItemSelected
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
    }
}
