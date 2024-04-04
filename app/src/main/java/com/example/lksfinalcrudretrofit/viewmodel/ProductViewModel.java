package com.example.lksfinalcrudretrofit.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.lksfinalcrudretrofit.data.Product;
import com.example.lksfinalcrudretrofit.repository.ProductRepository;

import java.util.ArrayList;

/**
 * Kelas ini digunakan untuk menghandle data Product ke UI (User Interface)
 */
public class ProductViewModel extends AndroidViewModel {
    private ProductRepository productRepository;
    private LiveData<ArrayList<Product>> arrayListLiveDataProduct;

    public ProductViewModel(@NonNull Application application) {
        super(application);

        productRepository = new ProductRepository();
        arrayListLiveDataProduct = productRepository.getProducts();
    }

    /**
     * Ambil semua data Products
     * @return
     */
    public LiveData<ArrayList<Product>> getProducts() {
        return arrayListLiveDataProduct;
    }
}
