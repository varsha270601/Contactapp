package com.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {

    private RecyclerView.LayoutManager LayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);


        final List<ContactModel> Friends = new ArrayList<>();
        String Name, Email, Phonenumber;

        Friends.add(new ContactModel("a", "abc@gmail.com", "9845100236"));
        Friends.add(new ContactModel("b", "bcd@gmail.com", "7851025634"));
        Friends.add(new ContactModel("c", "cde@gmail.com", "7851201245"));
        Friends.add(new ContactModel("d", "def@gmail.com", "8852104712"));
        Friends.add(new ContactModel("e", "efg@gmail.com", "7854100269"));
        Friends.add(new ContactModel("f", "fgh@gmail.com", "8885100246"));
        Friends.add(new ContactModel("g", "ghi@gmail.com", "9845123698"));
        Friends.add(new ContactModel("h", "jkl@gmail.com", "7412589630"));
        Friends.add(new ContactModel("j", "lmn@gmail.com", "7785102651"));
        Friends.add(new ContactModel("k", "opq@gmail.com", "8510236974"));
        Friends.add(new ContactModel("l", "qrs@gmail.com", "8520147963"));
        Friends.add(new ContactModel("m", "rst@gmail.com", "9652031478"));
        Friends.add(new ContactModel("n", "tuv@gmail.com", "7841236981"));
        Friends.add(new ContactModel("o", "uvw@gmail.com", "8745123698"));
        Friends.add(new ContactModel("p", "xyz@gmail.com", "8520147963"));

        RecyclerView Friends_recyclerView = findViewById(R.id.recyclerView2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Friends_recyclerView.setLayoutManager(LayoutManager);


        ContactAdapter ContactAdapter=new ContactAdapter(this,Friends,R.color.category_friends);


        Friends_recyclerView.setAdapter((RecyclerView.Adapter)ContactAdapter);

    }
}






