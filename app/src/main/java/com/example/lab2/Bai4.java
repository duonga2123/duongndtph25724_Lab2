package com.example.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bai4 extends AppCompatActivity implements View.OnClickListener {
    public static final String SERVER_NAME3 = "https://192.168.0.105/lab1_AndroidNetworking/giaiphuongtrinh_POST.php";
    private EditText edA;
    private EditText edB;
    private EditText edC;
    private Button btnSend;
    private Button btnBack;
    private TextView tvResult;
    String strA, strB, strC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);

        edA = (EditText) findViewById(R.id.ed_a);
        edB = (EditText) findViewById(R.id.ed_b);
        edC = (EditText) findViewById(R.id.ed_c);
        btnSend = (Button) findViewById(R.id.btn_send);
        tvResult = (TextView) findViewById(R.id.tv_result);
        btnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_send) {
            strA = edA.getText().toString();
            strB = edB.getText().toString();
            strC = edC.getText().toString();
            BackgroundTask_POST_Bai4 backgroundTask_post_Bai4 = new BackgroundTask_POST_Bai4(Bai4.this, tvResult, strA, strB, strC);
            backgroundTask_post_Bai4.execute();
        }
    }
}