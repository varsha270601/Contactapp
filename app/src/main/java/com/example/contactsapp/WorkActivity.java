package com.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class WorkActivity extends AppCompatActivity {


    private RecyclerView.LayoutManager LayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        final List<ContactModel> Work = new ArrayList<>();
        String Name, Email, Phonenumber;

        Work.add(new ContactModel("A", "ABC@gmail.com", "9874002560"));
        Work.add(new ContactModel("B", "DEF@gmail.com", "9741253698"));
        Work.add(new ContactModel("C", "GHI@gmail.com", "9021475960"));
        Work.add(new ContactModel("D", "IJK@gmail.com", "9025471369"));
        Work.add(new ContactModel("E", "JKL@gmail.com", "9700125489"));
        Work.add(new ContactModel("F", "LMN@gmail.com", "9021402365"));
        Work.add(new ContactModel("G", "NOP@gmail.com", "8841025790"));
        Work.add(new ContactModel("H", "PQR@gmail.com", "7251403698"));
        Work.add(new ContactModel("I", "RST@gmail.com", "8520147536"));
        Work.add(new ContactModel("J", "TUV@gmail.com", "9510024759"));
        Work.add(new ContactModel("K", "VWX@gmail.com", "8102470112"));
        Work.add(new ContactModel("L", "WXY@gmail.com", "7410259600"));
        Work.add(new ContactModel("M", "YZA@gmail.com", "9874100253"));
        Work.add(new ContactModel("N", "BCD@gmail.com", "8520147526"));
        Work.add(new ContactModel("O", "EFT@gmail.com", "9874102530"));
        Work.add(new ContactModel("P", "WXT@gmail.com", "9002417536"));

        RecyclerView Work_recyclerView = findViewById(R.id.recyclerView1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Work_recyclerView.setLayoutManager(LayoutManager);


        ContactAdapter ContactAdapter=new ContactAdapter(this,Work,R.color.category_work);


        Work_recyclerView.setAdapter((RecyclerView.Adapter)ContactAdapter);
    }
}
        







