package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai1 extends AppCompatActivity implements View.OnClickListener {

    private EditText edtname, edtscore;
    Button btnSend;
    TextView tvResult;
    public static final String Server_name = "https://192.168.0.105/lab1_AndroidNetworking/student_GET.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        edtname = findViewById(R.id.name);
        edtscore = findViewById(R.id.diem);
        btnSend = findViewById(R.id.send);
        tvResult = findViewById(R.id.result);

        btnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String strName, strScore;
        if (view.getId()==R.id.send){
            strName = edtname.getText().toString();
            strScore = edtscore.getText().toString();
            new BackgroundTask_GET(this,tvResult,strName,strScore).execute();
        }
    }
}