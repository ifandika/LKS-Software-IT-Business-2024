package com.example.lksfinalcrudretrofit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lksfinalcrudretrofit.R;
import com.example.lksfinalcrudretrofit.data.Product;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private ArrayList<Product> productArrayList;
    private Context context;

    public ProductAdapter(ArrayList<Product> productArrayList, Context context) {
        this.productArrayList = productArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(
            LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ProductViewHolder extends RecyclerView.ViewHolder {

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
