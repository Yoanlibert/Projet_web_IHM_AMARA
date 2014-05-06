package com.example.Projet_web_IHM;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Amara Safia on 05/05/14.
 */
public class IdentityPerson extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.identity);
        Button suivant = (Button)findViewById(R.id.bsuivant);
        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IdentityPerson.this, DetailPerson.class);
                startActivity(intent);
            }
        });

    }
}
