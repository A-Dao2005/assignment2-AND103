package com.example.assigment_api_ph52415;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.assigment_api_ph52415.adapter.product_Adapter;
import com.example.assigment_api_ph52415.model.Product;
import com.example.assigment_api_ph52415.R;
import com.example.assigment_api_ph52415.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ArrayList<Product> list = new ArrayList<>();
    private product_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list.add(new Product("1", "Car", "Mercedes", "Sang trọng và Quý phái", 4.9, 350000000, R.drawable.xe1));
        list.add(new Product("2", "Car", "Toyota", "Giá thành hợp lý", 4.3, 670000000, R.drawable.xe2));
        list.add(new Product("3", "Car", "Audi", "Sang trọng và Quý phái", 4.8, 368000000, R.drawable.xe3));
        list.add(new Product("4", "Car", "Porsche", "Sang trọng và Quý phái", 5.0, 670000000, R.drawable.xe4));
        list.add(new Product("5", "Car", "Maybach", "Sang trọng và Quý phái", 4.7, 870000000, R.drawable.xe5));
        list.add(new Product("6", "Car", "Vinfast", "Thân thiện với môi trường", 5.0, 980000000, R.drawable.xe5));
        adapter = new product_Adapter(list, this);
        binding.rcvProduct.setLayoutManager(new GridLayoutManager(this, 2));
        binding.rcvProduct.setAdapter(adapter);

    }
}