package com.example.Projet_web_IHM;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Amara Safia on 05/05/14.
 */
public class DetailPerson extends Activity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        Button bajouter = (Button)findViewById(R.id.bajouter);
        bajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Scolarité ajouté", Toast.LENGTH_SHORT).show();
            }
        });

        Button bajouter2 = (Button)findViewById(R.id.bajouter2);
        bajouter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"ExperiencePro ajouté",Toast.LENGTH_SHORT).show();
            }
        });

        Button bajouter3 = (Button)findViewById(R.id.bajouter3);
        bajouter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Objectif ajouté",Toast.LENGTH_SHORT).show();
            }
        });

        Button suivant = (Button)findViewById(R.id.bsuivant);
        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailPerson.this, DetailsPerson.class);
                startActivity(intent);
            }
        });

        Button retour = (Button)findViewById(R.id.bretour);
        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailPerson.this, IdentityPerson.class);
                startActivity(intent);
            }
        });

    }

}
