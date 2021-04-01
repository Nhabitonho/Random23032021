package com.example.random23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //1 : Khai báo biến
    EditText mEdtSoThu1, mEdtSoThu2;
    TextView mTvKetQua;
    Button mBtnCong, mBtnTru, mBtnNhan, mBtnChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2 : Ánh xạ
        mEdtSoThu1 = findViewById(R.id.editTextSoThu1);
        mEdtSoThu2 = findViewById(R.id.editTextSoThu2);
        mBtnCong = findViewById(R.id.ButtonCong);
        mBtnTru = findViewById(R.id.ButtonTru);
        mBtnNhan = findViewById(R.id.ButtonNhan);
        mBtnChia = findViewById(R.id.ButtonChia);

    }
}