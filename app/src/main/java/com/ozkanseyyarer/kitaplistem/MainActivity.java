package com.ozkanseyyarer.kitaplistem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private KitapAdapter adapter;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.add_menu_add_book){
            //intent geçişi olucak burada
            Intent addBookIntent = new Intent(MainActivity.this,AddBookActivity.class);
            startActivity(addBookIntent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.main_activiy_recyclerView);
        adapter = new KitapAdapter(Kitap.getData(this),this);
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new KitapAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Kitap kitap) {

            }
        });
    }
}