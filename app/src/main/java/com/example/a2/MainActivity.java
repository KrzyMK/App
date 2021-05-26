package com.example.a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView mainList;
    private ArrayList<Painter> lista;
    private View button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        mainList = findViewById(R.id.mainList);
        lista = new ArrayList<>();

        lista.add(new Painter("Jan", "Matejko", R.drawable.dziadek));
        lista.add(new Painter("Leonardo", "da Vinci", R.drawable.vinci));
        lista.add(new Painter("Edward", "Munch", R.drawable.krzyk));

        PainterAdapter adapter = new PainterAdapter(this, lista);
        mainList.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                for (int i = 0; i < lista.size(); i++) {
                    if(lista.get(i).isToDelete() == true){
                        lista.remove(i);
                    }
                }
                adapter.notifyDataSetChanged();
            }
        });
    }
}