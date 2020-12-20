package edu.cs.birzeit.groupassinment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //test comment
        setContentView(R.layout.activity_main);

        RecyclerView recycler = (RecyclerView)findViewById(R.id.phone_recycler);

        String[] captions = new String[phone.phones.length];
        int[] ids = new int[phone.phones.length];
         String [] ca=new String[phone.phones.length];
        for(int i = 0; i<captions.length;i++){
            captions[i] = phone.phones[i].getName();
            ids[i] = phone.phones[i].getImageID();
            ca[i]=phone.phones[i].getDescription();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids,ca);
        recycler.setAdapter(adapter);
    }
}
