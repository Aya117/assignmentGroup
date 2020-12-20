package edu.cs.birzeit.groupassinment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class phonedet extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonedet);

        //Intent intent = getIntent();
        //int id = (int)intent.getExtras().get("phone_id");

        //phone phones = phone.phones[id];

        String de= getIntent().getStringExtra("des");
        TextView txtDesc= (TextView)findViewById(R.id.txtDesc);
        txtDesc.setText(de);

    }
}