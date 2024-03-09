package vd2.vd2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nut1,nut2,nut3,nut4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();
    }
    void TimDieuKhien(){
        editTextSo1 = (EditText)findViewById(R.id.edt1);
        editTextSo2 = (EditText)findViewById(R.id.edt2);
        editTextKQ = (EditText)findViewById(R.id.edtkq);
        nut1 = (Button) findViewById(R.id.btn1);
        nut2 = (Button) findViewById(R.id.btn2);
        nut3 = (Button) findViewById(R.id.btn3);
        nut4 = (Button) findViewById(R.id.btn4);
    }
    public void XuLyCong(View v){


        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo1.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        float tong = soA + soB;

        String chuoiKQ = String.valueOf(tong);

        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyTru(View v){

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo1.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        float hieu = soA - soB;

        String chuoiKQ = String.valueOf(hieu);

        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyNhan(View v){

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo1.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        float tich = soA * soB;

        String chuoiKQ = String.valueOf(tich);

        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyChia(View v){

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo1.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        float thuong = soA / soB;

        String chuoiKQ = String.valueOf(thuong);

        editTextKQ.setText(chuoiKQ);
    }
}