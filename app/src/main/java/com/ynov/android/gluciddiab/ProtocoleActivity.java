package com.ynov.android.gluciddiab;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by admin on 30/03/17.
 */

public class ProtocoleActivity extends AppCompatActivity{

    EditText matinGlucideLent;
    EditText matinGlucideRapide;
    EditText midiGlucideLent;
    EditText midiGlucideRapide;
    EditText gouterGlucideLent;
    EditText gouterGlucideRapide;
    EditText soirGlucideLent;
    EditText soirGlucideRapide;

    TextView protocoleTitle;
    TextView glucideText;

    Button btnProtocoleValidate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protocole);

        protocoleTitle = (TextView) findViewById(R.id.textViewProtocoleTitle);

        //glucideText = (TextView) findViewById(R.id.textGlucides);

        matinGlucideLent = (EditText) findViewById(R.id.editTextMatinLent);
        matinGlucideRapide = (EditText) findViewById(R.id.editTextMatinRapide);

        midiGlucideLent = (EditText) findViewById(R.id.editTextMidiLent);
        midiGlucideRapide = (EditText) findViewById(R.id.editTextMidiRapide);

        gouterGlucideLent = (EditText) findViewById(R.id.editTextAPLent);
        gouterGlucideRapide = (EditText) findViewById(R.id.editTextAPRapide);

        soirGlucideLent = (EditText) findViewById(R.id.editTextSoirLent);
        soirGlucideRapide = (EditText) findViewById(R.id.editTextSoirRapide);




        btnProtocoleValidate = (Button) findViewById(R.id.buttonValidate);

        //btnProtocoleValidate.setEnabled(false);

        btnProtocoleValidate.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Toast msgLoadNextPage = Toast.makeText(getBaseContext(),"chargement next page",Toast.LENGTH_LONG);
                        Toast msgEmptyField = Toast.makeText(getBaseContext(),"Un ou plusieurs champs sont vides !",Toast.LENGTH_LONG);

                        if (!matinGlucideLent.getText().toString().equals("") && !matinGlucideRapide.getText().toString().equals("") && !midiGlucideRapide.getText().toString().equals("") && !midiGlucideLent.getText().toString().equals("") && !gouterGlucideRapide.getText().toString().equals("") && !gouterGlucideLent.getText().toString().equals("") && !soirGlucideRapide.getText().toString().equals("") && !soirGlucideLent.getText().toString().equals(""))
                            {
                            msgLoadNextPage.show();

                            Context context = ProtocoleActivity.this;

                            Class destinationActivity = RestoActivity.class;

                            Intent startRestoActivityIntent = new Intent(context, destinationActivity);

                            startActivity(startRestoActivityIntent);
                        }

                        else msgEmptyField.show();


                    }
                });



    }


}
