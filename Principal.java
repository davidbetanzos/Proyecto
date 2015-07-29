package keny.pooejercicio1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Principal extends ActionBarActivity {

    EditText et1,et2,et3,et4,et5,et6,et7,et8,et9,et10;
    Nomina nomina= new Nomina();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        et4=(EditText)findViewById(R.id.et4);
        et5=(EditText)findViewById(R.id.et5);
        et6=(EditText)findViewById(R.id.et6);
        et7=(EditText)findViewById(R.id.et7);
        et8=(EditText)findViewById(R.id.et8);
        et9=(EditText)findViewById(R.id.et9);
        et10=(EditText)findViewById(R.id.et10);
    }

    public void ev_calcular(View v){
        nomina.setN1(Double.parseDouble(et1.getText().toString()));
        nomina.setN2(Double.parseDouble(et2.getText().toString()));
        nomina.setN3(Double.parseDouble(et3.getText().toString()));
        nomina.setN4(Double.parseDouble(et4.getText().toString()));
        nomina.setN5(Double.parseDouble(et5.getText().toString()));
        nomina.setN6(Double.parseDouble(et6.getText().toString()));
        nomina.setN7(Double.parseDouble(et7.getText().toString()));
        nomina.setN8(Double.parseDouble(et8.getText().toString()));
        nomina.setN9(Double.parseDouble(et9.getText().toString()));
        nomina.setN10(Double.parseDouble(et10.getText().toString()));

        Intent intento= new Intent();
        intento.setClass(this,Calcular_Nomina.class);
        startActivity(intento);

    }


}
