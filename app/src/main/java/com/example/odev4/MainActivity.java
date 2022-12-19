package com.example.odev4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.odev4.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<Gorsel> gorselArrayList;
    int seciliSiraNo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        gorselArrayList = new ArrayList<>();

        Gorsel balon = new Gorsel("Renkli Balon", 1, R.drawable.balon);
        Gorsel cicek = new Gorsel("Kırmızı Çiçek", 2, R.drawable.cicek);
        Gorsel kelebek = new Gorsel("Turuncu Kelebek", 3, R.drawable.kelebek);
        Gorsel kus = new Gorsel("Siyah Kuş", 4, R.drawable.kus);


        gorselArrayList.add(balon);
        gorselArrayList.add(cicek);
        gorselArrayList.add(kelebek);
        gorselArrayList.add(kus);


        binding.imageViewGorsel.setImageResource(gorselArrayList.get(0).foto);
        binding.textViewBilgi.setText("Bilgi : "+gorselArrayList.get(0).bilgi);
        seciliSiraNo = 0;
    }


    public void geriGelme(View view) {
        if (seciliSiraNo > 0) {
            seciliSiraNo--;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textViewBilgi.setText("Bilgi : "+gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }

    public void ileriGitme(View view) {
        if (seciliSiraNo < gorselArrayList.size() - 1) {
            seciliSiraNo++;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textViewBilgi.setText("Bilgi : "+gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }

}
