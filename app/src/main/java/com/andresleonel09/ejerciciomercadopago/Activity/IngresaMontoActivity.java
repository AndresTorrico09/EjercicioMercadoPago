package com.andresleonel09.ejerciciomercadopago.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.andresleonel09.ejerciciomercadopago.Models.PagoActual;
import com.andresleonel09.ejerciciomercadopago.R;
import com.andresleonel09.ejerciciomercadopago.Utils.Globals;

public class IngresaMontoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btn = (Button) findViewById(R.id.btn_siguiente);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MediosDePagoActivity.class);
                startActivity(intent);
            }
        });

        EditText edit = (EditText)findViewById(R.id.montoPago);
        Double montoPago = ((edit.getText().toString().equals("")) ? 0.0 : Double.valueOf(edit.getText().toString()));

        PagoActual p = Globals.getInstance().getPagoActualActual() == null ? new PagoActual() : Globals.getInstance().getPagoActualActual();
        p.setMonto(montoPago);
        Globals.getInstance().setPagoActualActual(p);
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

    @Override
    public void onResume() {
        super.onResume();
/*        if (!ConnectionUtil.isInternetAvailable(this)) {
            notConnection();
        }*/
    }

    public void notConnection() {
        Toast.makeText(this,  getResources().getString(R.string.alert_verifique_internet), Toast.LENGTH_SHORT).show();
        startActivity(new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS));
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
