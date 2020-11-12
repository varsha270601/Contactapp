package com.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    private Object LayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<ContactModel> Family = new ArrayList<>();
        String Name, Email,Phonenumber;

        Family.add(new ContactModel("aa","aa@gmail.com","8545121247"));
        Family.add(new ContactModel("bb","bb@gmail.com","9874125360"));
        Family.add(new ContactModel("cc","cc@gmail.com","8512479360"));
        Family.add(new ContactModel("dd","dd@gmail.com","8512369741"));
        Family.add(new ContactModel("ee","ee@gmail.com","8520047935"));
        Family.add(new ContactModel("ff","ff@gmail.com","7851236951"));
        Family.add(new ContactModel("gg","gg@gmail.com","8956230147"));
        Family.add(new ContactModel("hh","hh@gmail.com","8956147236"));
        Family.add(new ContactModel("ii","ii@gmail.com","9651236974"));
        Family.add(new ContactModel("jj","jj@gmail.com","9632587410"));
        Family.add(new ContactModel("kk","kkgmail.com","85236901475"));
        Family.add(new ContactModel("ll","llgmail.com","96325874104"));
        Family.add(new ContactModel("mm","mm@gmai.com","96322587441"));
        Family.add(new ContactModel("nn","nngmail.com","96300114475"));
        Family.add(new ContactModel("oo","oo@gmail.com","8521136974"));
        Family.add(new ContactModel("pp","pp@gmail.com","9988452036"));

        RecyclerView Family_recyclerView = findViewById(R.id.recyclerView3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Family_recyclerView.setLayoutManager((RecyclerView.LayoutManager) LayoutManager);

        ContactAdapter ContactAdapter=new ContactAdapter(this,Family,R.color.category_family);


        Family_recyclerView.setAdapter((RecyclerView.Adapter)ContactAdapter);

    }
}