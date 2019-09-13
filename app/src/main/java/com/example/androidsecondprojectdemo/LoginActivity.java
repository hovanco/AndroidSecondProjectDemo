package com.example.androidsecondprojectdemo;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();

            }
        });
    }
    private void openHomeActivity() {
        EditText email = findViewById(R.id.email);
        String text_email = email.getText().toString();

        EditText password = findViewById((R.id.password));
        String text_password = password.getText().toString();

        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("EMAIL", text_email);
        intent.putExtra("PASSWORD", text_password);
        startActivity(intent);

    }
}
