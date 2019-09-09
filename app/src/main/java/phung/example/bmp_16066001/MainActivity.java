package phung.example.bmp_16066001;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewKetQua;
    private EditText textTaiKhoan, textMatKhau;
    private Button btnDangNhap, btnThoat;
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewKetQua = (TextView) findViewById(R.id.textViewKetQua);
        textTaiKhoan = (EditText) findViewById(R.id.textTaiKhoan);
        textMatKhau = (EditText) findViewById(R.id.textMatKhau);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        btnDangNhap = (Button) findViewById(R.id.btnDangNhap);
        btnThoat = (Button) findViewById(R.id.btnThoat);
        actionDangNhap();
        actionThoat();
    }
    private void actionDangNhap(){
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox.isChecked()){
                    textViewKetQua.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                }else{
                    textViewKetQua.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
                }
            }
        });
    }
    private void actionThoat(){
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                builder1.setMessage("Bạn có muốn thoát");
                builder1.setCancelable(true);

                builder1.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        System.exit(0);
                    }
                });

                builder1.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });
    }
}
