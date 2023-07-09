package com.example.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bai2 extends AppCompatActivity implements View.OnClickListener {
    public static final String LAB2_LINK = "https://192.168.0.105/lab1_AndroidNetworking/rectangle_POST.php";
    private EditText edRong;
    private EditText edDai;
    private Button btnSend;
    private TextView tvResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        edDai = (EditText) findViewById(R.id.edDai);
        edRong = (EditText) findViewById(R.id.edRong);
        btnSend = (Button) findViewById(R.id.btnSend);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnSend){
            BackdroundTask_POST backdroundTask_post = new BackdroundTask_POST(this,edRong.getText().toString(),edDai.getText().toString(),tvResult);
            backdroundTask_post.execute();
        }
    }
}