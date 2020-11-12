package com.example.contactsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.List;

public class ContactAdapter<color> extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private Context context;
    private List<ContactModel> contactModelList;
    private int ColorResId;

    public ContactAdapter(Context context, List<ContactModel> list, int colorResId) {
        this.context = context;
        this.contactModelList = list;
        this.ColorResId = colorResId;
    }

    TextView name, email, phonenumber;

    @NonNull
    @Override

    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        ContactViewHolder contactViewHolder = new ContactViewHolder(view);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ContactViewHolder holder, int position) {
        holder.name.setText(contactModelList.get(position).getName());
        holder.email.setText(contactModelList.get(position).getEmail());
        holder.phonenumber.setText((Integer) contactModelList.get(position).getphonenumber());

    }


    @Override
    public int getItemCount() {
        return contactModelList.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder {

        TextView name, email, phonenumber;


        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv1);
            email = itemView.findViewById(R.id.tv2);
            phonenumber = itemView.findViewById(R.id.tv3);
        }
    }
}
















