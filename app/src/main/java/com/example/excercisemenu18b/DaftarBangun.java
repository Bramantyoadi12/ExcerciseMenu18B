package com.example.excercisemenu18b;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;

public class DaftarBangun extends AppCompatActivity implements
        PopupMenu.OnMenuItemClickListener{

    Button persegi, segitiga, trapesium, persegiPanjang, lingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_bangun);

        persegi = findViewById(R.id.persegi);
        persegiPanjang = findViewById(R.id.persegiPanjang);
        segitiga = findViewById(R.id.segitiga);
        trapesium = findViewById(R.id.trapesium);
        lingkaran = findViewById(R.id.lingkaran);

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(DaftarBangun.this, view);
                popup.setOnMenuItemClickListener(DaftarBangun.this);
                popup.inflate(R.menu.menu1);
                popup.show();
            }
        });
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup2 = new PopupMenu(DaftarBangun.this, view);
                popup2.setOnMenuItemClickListener(DaftarBangun.this);
                popup2.inflate(R.menu.menu2);
                popup2.show();
            }
        });
        persegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup3 = new PopupMenu(DaftarBangun.this, view);
                popup3.setOnMenuItemClickListener(DaftarBangun.this);
                popup3.inflate(R.menu.menu3);
                popup3.show();
            }
        });
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup4 = new PopupMenu(DaftarBangun.this, view);
                popup4.setOnMenuItemClickListener(DaftarBangun.this);
                popup4.inflate(R.menu.menu4);
                popup4.show();
            }
        });
        trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup5 = new PopupMenu(DaftarBangun.this, view);
                popup5.setOnMenuItemClickListener(DaftarBangun.this);
                popup5.inflate(R.menu.menu2);
                popup5.show();
            }
        });
    }

    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Luas:
                startActivity(new Intent(this, LuasPersegi.class));
                return true;
            case R.id.Keliling:
                startActivity(new Intent(this, KelilingPersegi.class));
                return true;
            case R.id.Luas:
                startActivity(new Intent(this, LuasLingkaran.class));
                return true;
            case R.id.Keliling:
                startActivity(new Intent(this, KelilingLingkaran.class));
                return true;
            case R.id.Luas:
                startActivity(new Intent(this, LuasPersegiPanjang.class));
                return true;
            case R.id.Keliling:
                startActivity(new Intent(this, KelilingPersegiPanjang.class));
                return true;
            case R.id.Luas:
                startActivity(new Intent(this, LuasSegitiga.class));
                return true;
            case R.id.Keliling:
                startActivity(new Intent(this, KelilingSegitiga.class));
                return true;
            case R.id.Luas:
                startActivity(new Intent(this, LuasTrapesium.class));
                return true;
            case R.id.Keliling:
                startActivity(new Intent(this, KelilingTrapesium.class));
                return true;
            default:
                return false;
        }
    }
}
