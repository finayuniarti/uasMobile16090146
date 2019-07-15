package com.example.fina.myuas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.input_nama)
    EditText inputNama;
    @BindView(R.id.input_nohp)
    EditText inputNo;
    @BindView(R.id.input_alamat)
    EditText inputAlamat;
    @BindView(R.id.input_jk)
    EditText inputJk;
    @BindView(R.id.simpan_button)
    Button simpan_button;
    @BindView(R.id.hasil_nama)
    TextView hasilNama;
    @BindView(R.id.hasil_nomor)
    TextView hasilNo;
    @BindView(R.id.hasil_alamat)
    TextView hasilAlamat;
    @BindView(R.id.hasil_kelamin)
    TextView hasilKelamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.simpan_button)
    public void btnClicked() {
        String nama = inputNama.getText().toString();
        hasilNama.setText(nama);
        String no = inputNo.getText().toString();
        hasilNo.setText(no);
        String alamat = inputAlamat.getText().toString();
        hasilAlamat.setText(alamat);
        String kelamin = inputJk.getText().toString();
        hasilKelamin.setText(kelamin);
    }
}
