package com.faulinaindri202102297;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.faulinaindri202102297.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView _recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);

        List<NegaraModel> negaraModelList = new ArrayList<>();

        NegaraModel nm =new NegaraModel();
        nm.setNama("Albania");
        nm.getDeskripsi("Negara ini menggunakan bendera merah.");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Albania-Flag-icon.png");
        negaraModelList.add(nm);

        nm =new NegaraModel();
        nm.setNama("Hungary");
        nm.getDeskripsi("Negara ini bernama Hungaria dalam bahasa Indonesia");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Hungary-Flag-icon.png");
        negaraModelList.add(nm);

        nm =new NegaraModel();
        nm.setNama("Slovenia");
        nm.getDeskripsi("Belum ada deskripsi untuk negara ini. silahkan ditambahkan");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Slovenia-Flag-icon.png");
        negaraModelList.add(nm);

        nm =new NegaraModel();
        nm.setNama("Belgium");
        nm.getDeskripsi("Namanya belgia dalam bahasa Indonesia. Negara ini terdapat di Eropa");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Belgium-Flag-icon.png");
        negaraModelList.add(nm);

        nm =new NegaraModel();
        nm.setNama("Canada");
        nm.getDeskripsi("Negara ini terdapat disebelah utara negara Amerika Serikat");
        nm.setUrl("https://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Canada-Flag-icon.png");
        negaraModelList.add(nm);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
        _recyclerView1.setLayoutManager(lm);

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(),negaraModelList);
    }
}