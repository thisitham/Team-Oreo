package com.dhruva.shopping;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;
import com.dhruva.shopping.Model.Feed;

public class Inquiry extends AppCompatActivity {

    Button submitbutton;
    AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry);

        final EditText edit_name = findViewById(R.id.edit_name);
        final EditText edit_Inquiry = findViewById(R.id.edit_Inquiry);
        final EditText edit_Contact = findViewById(R.id.edit_Contact);
        final EditText edit_Inquire = findViewById(R.id.edit_Inquire);

        submitbutton = findViewById(R.id.submitbutton);

        submitbutton.setOnClickListener(v -> {

            //initialize validation style
            awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

            //Add validation for name
            awesomeValidation.addValidation(this, R.id.edit_name,
                    RegexTemplate.NOT_EMPTY, R.string.invalid_name);

            //validation for Inquiry
            awesomeValidation.addValidation(this, R.id.edit_Inquiry,
                    RegexTemplate.NOT_EMPTY, R.string.invalid_inquiry);

            //validation for contact
            awesomeValidation.addValidation(this, R.id.edit_Contact
                    , "[5-9]{1}[0-9]{9}$", R.string.invalid_number);

            //validation for Inquire
            awesomeValidation.addValidation(this, R.id.edit_Inquire,
                    RegexTemplate.NOT_EMPTY, R.string.invalid_inquire);


            DAOFeed dao = new DAOFeed();

            Feed feed = new Feed(edit_name.getText().toString(), edit_Inquiry.getText().toString(), edit_Contact.getText().toString(), edit_Inquire.getText().toString());
            dao.add(feed).addOnSuccessListener(suc ->
            {
                if (awesomeValidation.validate()) {
                    Toast.makeText(this, "Inquiry was submitted", Toast.LENGTH_SHORT).show();
                }
            }).addOnFailureListener(er ->
                    Toast.makeText(this, "" + er, Toast.LENGTH_SHORT).show());

            });


    }
}
