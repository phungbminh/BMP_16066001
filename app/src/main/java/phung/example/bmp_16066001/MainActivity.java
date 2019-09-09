package phung.example.bmp_16066001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewKetQua;
    private EditText textTaiKhoan, textMatKhau;
    private Button btnDangNhap;
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
        actionDangNhap();
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
}
