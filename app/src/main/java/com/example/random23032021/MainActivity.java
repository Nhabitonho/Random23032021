package com.example.random23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

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
        // luồng xử lí của chức năng
        mBtnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "Click button Cộng", Toast.LENGTH_SHORT).show();
                // Lấy dữ liệu từ 2 editText
                // String n = ... để hứng dữ liệu
                String textSoThu1 = mEdtSoThu1.getText().toString();
                String textSoThu2 = mEdtSoThu2.getText().toString();
                // equal, isempty :chuoi rỗng
                // Null : sẽ gặp khi không gán dữ liệu cho object
                if(textSoThu1.length() <=0 || textSoThu2.length() <=0){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ số", Toast.LENGTH_SHORT).show();
                    return ;
                }
                int sothu1 = Integer.parseInt(textSoThu1);
                int sothu2 = Integer.parseInt(textSoThu2);
                int ketqua = sothu1 + sothu2;


                // 5 + 5 = 10
                mTvKetQua.setText(sothu1 + "+" + sothu2 + "=" + ketqua);
            }
        });
        mBtnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textsothu1 = mEdtSoThu1.getText().toString();
                String textsothu2 = mEdtSoThu2.getText().toString();
                if (textsothu1.length() <=0 || textsothu2.length() <=0){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ số", Toast.LENGTH_SHORT).show();
                    return;
                }
                int sothu1 = Integer.parseInt(textsothu1);
                int sothu2 = Integer.parseInt(textsothu2);
                int ketqua = sothu1 - sothu2;
                mTvKetQua.setText(sothu1 + "-"+ sothu2+"="+ ketqua);
            }
        });
        mBtnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textsothu1 = mEdtSoThu1.getText().toString();
                String textsothu2 = mEdtSoThu2.getText().toString();
                if (textsothu1.length() <=0 || textsothu2.length() <=0){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ số", Toast.LENGTH_SHORT).show();
                    return;
                }
                long sothu1 = Long.parseLong(textsothu1);
                long sothu2 = Long.parseLong(textsothu2);
                long ketqua = sothu1 * sothu2;
                DecimalFormat simpleDateFormat = new DecimalFormat("#,###,###");
                mTvKetQua.setText(sothu1 + "/"+ sothu2+"="+ simpleDateFormat.format(ketqua));
            }
        });
        mBtnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textsothu1 = mEdtSoThu1.getText().toString();
                String textsothu2 = mEdtSoThu2.getText().toString();
                if (textsothu1.length() <=0 || textsothu2.length() <=0){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ số", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (textsothu2.equals("0")){
                    Toast.makeText(MainActivity.this, "Số vô nghĩa", Toast.LENGTH_SHORT).show();
                    return;
                }
                float sothu1 = Float.parseFloat(textsothu1);
                float sothu2 = Float.parseFloat(textsothu2);
                float ketqua =  sothu1 / sothu2;

//                DecimalFormat simpleDateFormat = new DecimalFormat("#,###,###");
//                mTvKetQua.setText(sothu1 + "/"+ sothu2+"="+ simpleDateFormat.format(ketqua));
                mTvKetQua.setText(sothu1 + "/"+ sothu2+"="+ ketqua);
            }
        });
mBtnReset.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        mEdtSoThu1.setText("");
        mEdtSoThu2.setText("");
        mTvKetQua.setText("");
    }
});
    }
}