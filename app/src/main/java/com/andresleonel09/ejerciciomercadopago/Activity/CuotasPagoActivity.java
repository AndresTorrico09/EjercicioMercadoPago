package com.andresleonel09.ejerciciomercadopago.Activity;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.andresleonel09.ejerciciomercadopago.Adapter.ComboAdapter;
import com.andresleonel09.ejerciciomercadopago.Api.MercadoPagoService;
import com.andresleonel09.ejerciciomercadopago.MercadoPagoAplication;
import com.andresleonel09.ejerciciomercadopago.Models.CuotasPago;
import com.andresleonel09.ejerciciomercadopago.Models.ItemComboData;
import com.andresleonel09.ejerciciomercadopago.Models.PagoActual;
import com.andresleonel09.ejerciciomercadopago.R;
import com.andresleonel09.ejerciciomercadopago.Globals;
import com.andresleonel09.ejerciciomercadopago.ResumenFragment;

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
                for (int i=0; i < 3; i++)
                {
                    Toast.makeText(CuotasPagoActivity.this
                            , Globals.getInstance().getPagoActual().toString() + "\n\n"
                                    + "Su pago se ha realizado con exito!"
                            , Toast.LENGTH_LONG).show();
                }

                Intent intent = new Intent(getApplicationContext(), IngresaMontoActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<ItemComboData> list=new ArrayList<>();

        for (CuotasPago m : Globals.getInstance().getCuotasPago()) {
            for (CuotasPago.PayerCost p : m.getPayerCosts()) {
                list.add(new ItemComboData(String.valueOf(p.getInstallments())
                        ,p.getRecommendedMessage()
                        ,m.getIssuer().getSecureThumbnail()));
            }
        }

        Spinner sp=(Spinner)findViewById(R.id.spinner);
        ComboAdapter adapter=new ComboAdapter(this, R.layout.layout_combo,R.id.txt,list);
        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                ItemComboData item = (ItemComboData)parent.getItemAtPosition(position);

                PagoActual p = Globals.getInstance().getPagoActual() == null ? new PagoActual() : Globals.getInstance().getPagoActual();
                p.setCuotasPago(item.getText());
                Globals.getInstance().setPagoActual(p);

            } // to close the onItemSelected
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
    }
}
