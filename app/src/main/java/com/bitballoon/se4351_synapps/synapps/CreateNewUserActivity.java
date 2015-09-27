package com.bitballoon.se4351_synapps.synapps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Bontavy on 9/18/2015.
 */
public class CreateNewUserActivity extends AppCompatActivity {
    private EditText firstName;
    private EditText lastName;
    private EditText emailAddress;
    private EditText password;
    private EditText confirmPassword;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_new_user);

        initiateUI();
        createNewUser();
    }

    // initiate UI elements
    private void initiateUI() {
        firstName = (EditText)findViewById(R.id.first_name_edittext);
        lastName = (EditText)findViewById(R.id.last_name_edittext);
        emailAddress = (EditText)findViewById(R.id.email_address_edittext);
        password = (EditText)findViewById(R.id.password_edittext);
        confirmPassword = (EditText)findViewById(R.id.confirm_password_edittext);
        submitButton = (Button)findViewById(R.id.submit_button);
    }

    private void createNewUser() {
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!password.getText().toString().equals(confirmPassword.getText().toString())) {
                    Toast.makeText(CreateNewUserActivity.this, R.string.unmatched_password, Toast.LENGTH_LONG);
                    password.setText("");
                    confirmPassword.setText("");
                }
                if (!(firstName.getText().toString().equals("")
                    && lastName.getText().toString().equals("")
                    && emailAddress.getText().toString().equals("")
                    && password.getText().toString().equals("")
                    && confirmPassword.getText().toString().equals("")))
                if (firstName.getText().toString().equals("")) {

                } else {
                    Intent intent = new Intent(CreateNewUserActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });
    }
}
