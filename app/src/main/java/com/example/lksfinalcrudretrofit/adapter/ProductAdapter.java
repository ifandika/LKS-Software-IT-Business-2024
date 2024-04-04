package com.example.lksfinalcrudretrofit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lksfinalcrudretrofit.R;
import com.example.lksfinalcrudretrofit.data.Product;

import java.util.ArrayList;

/**
 * Class ini digunakan untuk menetapkan/memasukan data ke RecyclerView dengan menyimpan data di ArrayList.
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    /**
     * Untuk menyimpan data Product
     */
    private final ArrayList<Product> productArrayList;

    /**
     * Untuk menyimpan nilai context
     */
    private final Context context;

    public ProductAdapter(ArrayList<Product> productArrayList, Context context) {
        this.productArrayList = productArrayList;
        this.context = context;
    }

    /**
     * Fungsi ini untuk menetapkan layout dari Product yang akan ditampikan di recyclerview
     * @param parent The ViewGroup into which the new View will be added after it is bound to
     *               an adapter position.
     * @param viewType The view type of the new View.
     *
     * @return
     */
    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(
            LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false)
        );
    }

    /**
     * Ambil data product pada arraylist lalu panggil atribut pada ProductViewHolder untuk menetapkan data dari data Product
     * yang diambil.
     * @param holder The ViewHolder which should be updated to represent the contents of the
     *        item at the given position in the data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        final Product product = productArrayList.get(position);
    }

    /**
     * Return jumlah data arrayList.
     * @return
     */
    @Override
    public int getItemCount() {
        return productArrayList.size();
    }

    /**
     * Class ini digunakan utuk menghubungkan elemen pada layout item_product.xml
     */
    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewTitle, textViewPrice;
        private ImageView imageViewCover;
        private RatingBar ratingBarProduct;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
