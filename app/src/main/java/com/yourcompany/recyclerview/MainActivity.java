package com.yourcompany.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView=findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter=new MyAdapter(this,getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList() {
        ArrayList<Model> models=new ArrayList<>();

        Model m=new Model();
        m.setTitle("Zero");
        m.setDescription("This is Zero description");
        m.setImg(R.drawable.id);
        models.add(m);

        m=new Model();
        m.setTitle("First");
        m.setDescription("This is First description");
        m.setImg(R.drawable.au);
        models.add(m);

        m=new Model();
        m.setTitle("Second");
        m.setDescription("This is Second description");
        m.setImg(R.drawable.ch);
        models.add(m);

        m=new Model();
        m.setTitle("Third");
        m.setDescription("This is Third description");
        m.setImg(R.drawable.ps);
        models.add(m);

        m=new Model();
        m.setTitle("Forth");
        m.setDescription("This is Forth description");
        m.setImg(R.drawable.sg);
        models.add(m);

        m=new Model();
        m.setTitle("Sixth");
        m.setDescription("This is Sixth description");
        m.setImg(R.drawable.cp);
        models.add(m);

        m=new Model();
        m.setTitle("Seventh");
        m.setDescription("This is Seventh description");
        m.setImg(R.drawable.pr);
        models.add(m);

        m=new Model();
        m.setTitle("Eighth");
        m.setDescription("This is Eighth description");
        m.setImg(R.drawable.ai);
        models.add(m);

        m=new Model();
        m.setTitle("Ninth");
        m.setDescription("This is Ninth description");
        m.setImg(R.drawable.ae);
        models.add(m);

        m=new Model();
        m.setTitle("Tenth");
        m.setDescription("This is Tenth description");
        m.setImg(R.drawable.sp);
        models.add(m);
        return models;
    }
}
