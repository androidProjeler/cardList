package com.umitcelebi.cardlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    List<Item> mList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //durum çubuğu arka planını şeffaf olarak ayarlama
        Window w=getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        baslat();
    }

    public void baslat(){

        recyclerView=findViewById(R.id.rv_list);
        mList=new ArrayList<>();
        mList.add(new Item(R.drawable.manzara8,"Manzara",R.drawable.profil,150));
        mList.add(new Item(R.drawable.manzara8,"Manzara2",R.drawable.profil2,150));
        mList.add(new Item(R.drawable.manzara8,"Manzara3",R.drawable.profil3,150));
        mList.add(new Item(R.drawable.manzara8,"Manzara4",R.drawable.profil,150));
        mList.add(new Item(R.drawable.manzara8,"Manzara5",R.drawable.profil2,150));
        mList.add(new Item(R.drawable.manzara8,"Manzara6",R.drawable.profil3,150));
        mList.add(new Item(R.drawable.manzara8,"Manzara7",R.drawable.profil,150));
        mList.add(new Item(R.drawable.manzara8,"Manzara8",R.drawable.profil2,150));
        adapter=new Adapter(this,mList);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
