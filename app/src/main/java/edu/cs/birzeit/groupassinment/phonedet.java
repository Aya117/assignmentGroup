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
        TextView txtDesc = (TextView) findViewById(R.id.txtDesc);
        //Intent intent = getIntent();
        //int id = (int)intent.getExtras().get("phone_id");
        //phone phones = phone.phones[id];
        if(getIntent().hasExtra("des")) {
            String de = getIntent().getStringExtra("des");
            txtDesc.setText(de);
        }
    }
}