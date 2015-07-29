package keny.pooejercicio1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Calcular_Nomina extends ActionBarActivity {

    EditText etnomina;
    Nomina nomina2= new Nomina();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular__nomina);
        etnomina=(EditText)findViewById(R.id.etnomina);
        etnomina.setText(" "+nomina2.getNomina());
    }

    public void ev_regresar(View v){
        Intent regresar= new Intent();
        regresar.setClass(this, Principal.class);
        startActivity(regresar);
    }


}
