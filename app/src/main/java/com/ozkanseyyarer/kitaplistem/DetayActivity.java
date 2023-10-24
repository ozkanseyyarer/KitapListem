package com.ozkanseyyarer.kitaplistem;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class DetayActivity extends AppCompatActivity {

    private TextView txtKitapAdi,txtkitapYazari,txtKitapOzeti;
    private ImageView imgKitapResim;

    private String kitapAdi, kitapYazari, kitapOzeti;
    private Bitmap kitapResimi;

    private void init(){
        txtKitapAdi = findViewById(R.id.detay_activity_textViewKitapAdi);
        txtkitapYazari = findViewById(R.id.detay_activity_textViewKitapYazari);
        txtKitapOzeti = findViewById(R.id.detay_activity_textViewKitapOzeti);
        imgKitapResim = findViewById(R.id.detay_activity_imageViewKitapResim);

        kitapAdi= MainActivity.kitapDetayi.getKitapAdi();
        kitapYazari = MainActivity.kitapDetayi.getKitapYazari();
        kitapOzeti = MainActivity.kitapDetayi.getKitapOzeti();
        kitapResimi = MainActivity.kitapDetayi.getKitapResimi();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        init();

        if (!TextUtils.isEmpty(kitapAdi) &&!TextUtils.isEmpty(kitapYazari) &&!TextUtils.isEmpty(kitapOzeti) ){

            txtKitapAdi.setText(kitapAdi);
            txtkitapYazari.setText(kitapYazari);
            txtKitapOzeti.setText(kitapOzeti);
            imgKitapResim.setImageBitmap(kitapResimi );
        }
    }
}