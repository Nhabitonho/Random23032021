package com.example.random23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //1 : Khai báo biến
    EditText mEdtSoThu1, mEdtSoThu2;
    TextView mTvKetQua;
    Button mBtnCong, mBtnTru, mBtnNhan, mBtnChia, mBtnReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2 : Ánh xạ
        mEdtSoThu1 = findViewById(R.id.editTextSoThu1);
        mEdtSoThu2 = findViewById(R.id.editTextSoThu2);
        mTvKetQua = findViewById(R.id.ButtonKetQua);
        mBtnReset = findViewById(R.id.ButtonReset);
        mBtnCong = findViewById(R.id.ButtonCong);
        mBtnTru = findViewById(R.id.ButtonTru);
        mBtnNhan = findViewById(R.id.ButtonNhan);
        mBtnChia = findViewById(R.id.ButtonChia);

        //Hiển thị thông báo

        //built-in function
        //ctrl + P : xem tham số truyền vào
        // @ : được gọi là annotation
        Toast.makeText(this,"Thong Bao", Toast.LENGTH_LONG).show();

        //kiểm tra dữ liệu system
        Log.d("AAA", mBtnReset.getText().toString());



    }
}