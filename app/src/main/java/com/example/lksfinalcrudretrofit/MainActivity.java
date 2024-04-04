package com.example.lksfinalcrudretrofit;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lksfinalcrudretrofit.adapter.ProductAdapter;
import com.example.lksfinalcrudretrofit.data.Product;
import com.example.lksfinalcrudretrofit.viewmodel.ProductViewModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewMain;
    BottomNavigationView bottomNavigationView;
    ProductViewModel productViewModel;
    ProductAdapter productAdapter;
    ArrayList<Product> productArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

//        EdgeToEdge.enable(this);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        // INIT
        init();

        // GET PRODUCTS AND SHOW
        getProducts();
    }

    public void init() {
        recyclerViewMain = findViewById(R.id.recycler_view_main);
        bottomNavigationView = findViewById(R.id.bottom_navview_main);
        productViewModel = new ViewModelProvider(this).get(ProductViewModel.class);

        recyclerViewMain.setHasFixedSize(true);
        recyclerViewMain.setLayoutManager(new LinearLayoutManager(this));
        productAdapter = new ProductAdapter(productArrayList, MainActivity.this);
        recyclerViewMain.setAdapter(productAdapter);
    }

    public void getProducts() {
        productViewModel.getProducts().observe(this, new Observer<ArrayList<Product>>() {
            @Override
            public void onChanged(ArrayList<Product> products) {
                if(products != null) {
                    productArrayList.addAll(products);
                    productAdapter.notifyDataSetChanged();
                }
            }
        });
    }
}