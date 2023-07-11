package com.example.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bai3 extends AppCompatActivity implements View.OnClickListener {
    public static final String SERVER_NAME2 = "https://192.168.0.105/lab1_AndroidNetworking/canh_POST.php";
    private EditText edCanh;
    private Button btnSend;
    private Button btnBack;
    private TextView tvResult;
    String strCanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        edCanh = (EditText) findViewById(R.id.ed_canh);
        btnSend = (Button) findViewById(R.id.btn_send);
        tvResult = (TextView) findViewById(R.id.tv_result);
        btnSend.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        strCanh = edCanh.getText().toString();
        BackgroundTask_POST_Bai3 backgroundTask_post_Bai3 = new BackgroundTask_POST_Bai3(Bai3.this, tvResult);
        backgroundTask_post_Bai3.execute(strCanh);
    }
}