package com.example.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText editTextName, editTextAge, editTextGender, editTextDOB, editTextAddress, editTextEmail;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
        editTextGender = findViewById(R.id.editTextGender);
        editTextDOB = findViewById(R.id.editTextDOB);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextEmail = findViewById(R.id.editTextEmail);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();
                String age = editTextAge.getText().toString();
                String gender = editTextGender.getText().toString();
                String dob = editTextDOB.getText().toString();
                String address = editTextAddress.getText().toString();
                String email = editTextEmail.getText().toString();

                // Hiển thị thông tin cá nhân trong một Toast
                String personalInfo = "Tên: " + name + "\nTuổi: " + age + "\nGiới tính: " + gender
                        + "\nNgày sinh: " + dob + "\nĐịa chỉ: " + address + "\nEmail: " + email;
                Toast.makeText(MainActivity.this, personalInfo, Toast.LENGTH_LONG).show();
            }
        });
    }
}
