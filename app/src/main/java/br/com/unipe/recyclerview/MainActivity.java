package br.com.unipe.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<String> palavras = new LinkedList<>();
    private RecyclerView recyclerView;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 20; i++) {
            palavras.addLast("Palavra " + i);
        }

        // criar o RecyclerView
        recyclerView = findViewById(R.id.recyclerview);

        // criar o adaptador fornecendo os dados a serem exibidos
        adapter = new Adapter(palavras, this);

        // conectar o adapter ao recyclerView
        recyclerView.setAdapter(adapter);

        // definir o layout a ser utilizado para apresentacao dos itens
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);
    }
}
