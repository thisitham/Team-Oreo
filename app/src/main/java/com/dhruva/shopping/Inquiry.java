package com.dhruva.shopping;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.dhruva.shopping.Model.Feed;

public class Inquiry extends AppCompatActivity {

    Button nextbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry);


        nextbutton = (Button) findViewById(R.id.nextbutton);
        nextbutton.setOnClickListener((V) ->
        {
            startActivity(new Intent(Inquiry.this, Feedback.class));

            final EditText edit_name = findViewById(R.id.edit_name);
            final EditText edit_Inquiry = findViewById(R.id.edit_Inquiry);
            final EditText edit_Contact = findViewById(R.id.edit_Contact);
            final EditText edit_Inquire = findViewById(R.id.edit_Inquire);

            Button btn = findViewById(R.id.submitbutton);
            DAOFeed dao = new DAOFeed();

            btn.setOnClickListener(v ->
            {
                Feed feed = new Feed(edit_name.getText().toString(), edit_Inquiry.getText().toString(), edit_Contact.getText().toString(), edit_Inquire.getText().toString());
                dao.add(feed).addOnSuccessListener(suc ->
                {
                    Toast.makeText(this, "Inquiry was submitted", Toast.LENGTH_SHORT).show();

                }).addOnFailureListener(er ->
                {
                    Toast.makeText(this, "Some thing went wrong" + er, Toast.LENGTH_SHORT).show();
                });


            /*HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("name", edit_name.getText().toString());
            hashMap.put("Inquiry", edit_Inquiry.getText().toString());
            hashMap.put("Contact", edit_Contact.getText().toString());
            hashMap.put("Inquire", edit_Inquire.getText().toString());

            dao.update("-MkMlKbKhpREFol5JVKr", hashMap).addOnSuccessListener(suc ->
            {
                Toast.makeText(this, "Record is updated", Toast.LENGTH_SHORT).show();

            }).addOnFailureListener(er ->

            {
                Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
            });*/


            /*dao.remove("-MkMlKbKhpREFol5JVKr").addOnSuccessListener(suc ->
            {
                Toast.makeText(this, "Record is removed", Toast.LENGTH_SHORT).show();

            }).addOnFailureListener(er ->

            {
                Toast.makeText(this, "" + er.getMessage(), Toast.LENGTH_SHORT).show();
            });*/

            });
        });
    }
}
