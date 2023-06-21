package com.example.surveyproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import org.w3c.dom.Text;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Survey> {
    private Context context;
    private int resource;

    private DatabaseReference databaseReference;


    public ListViewAdapter(@NonNull Context context, int resource, @NonNull List<Survey> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        if( convertView == null )
            convertView = inflater.inflate(resource,parent,false);
        TextView q = convertView.findViewById(R.id.q);
        TextView answer1 = convertView.findViewById(R.id.answer1);
        Text answer2 = convertView.findViewById(R.id.answer2);


        databaseReference = FirebaseDatabase.getInstance().getReference("Surveys");

        return convertView;

    }


}
