package com.example.Projet_web_IHM;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Amara Safia on 05/05/14.
 */
public class DetailsPerson extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_resume);
        Button bajouter = (Button)findViewById(R.id.bajouter);
        bajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Competence ajouté", Toast.LENGTH_SHORT).show();
               /* Competence cmp = new Comepetence("txt", "txt2");
                EditText txt = (EditText)findViewById(R.id.jdate);
                EditText txt2 = (EditText)findViewById(R.id.jdescription);
                */
            }
        });

        Button bajouter2 = (Button)findViewById(R.id.bajouter2);
        bajouter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Langue ajouté",Toast.LENGTH_SHORT).show();
            }
        });

        Button bajouter3 = (Button)findViewById(R.id.bajouter3);
        bajouter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Competence Info ajouté",Toast.LENGTH_SHORT).show();
            }
        });


        Button enregistrer = (Button)findViewById(R.id.benregistrer);
        enregistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsPerson.this, MyActivity.class);
                startActivity(intent);
            }
        });

        Button retour = (Button)findViewById(R.id.bretour);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsPerson.this, DetailPerson.class);
                startActivity(intent);
            }
        });

    }
}
