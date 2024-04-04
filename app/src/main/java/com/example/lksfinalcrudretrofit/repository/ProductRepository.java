package com.example.lksfinalcrudretrofit.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.lksfinalcrudretrofit.data.Product;
import com.example.lksfinalcrudretrofit.retrofit.APIProduct;
import com.example.lksfinalcrudretrofit.retrofit.RetrofitInstance;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Class ini sebagai kelas operasi anta ViewModel dan Retrofit.
 */
public class ProductRepository {
    private APIProduct apiProduct;

    public ProductRepository() {
        apiProduct = RetrofitInstance.getRetrofitInstance().create(APIProduct.class);
    }

    /**
     * Mengambil semua data Products dari server
     * @return
     */
    public LiveData<ArrayList<Product>> getProducts() {
        final MutableLiveData<ArrayList<Product>> arrayListMutableLiveDataProduct = new MutableLiveData<>();
        final Call<ArrayList<Product>> arrayListCall = apiProduct.getProducts();
        arrayListCall.enqueue(new Callback<ArrayList<Product>>() {

            /**
             * If reguest success
             * @param call
             * @param response
             */
            @Override
            public void onResponse(Call<ArrayList<Product>> call, Response<ArrayList<Product>> response) {
                final ArrayList<Product> arrayListProduct = response.body();
                if(arrayListProduct != null) {
                    arrayListMutableLiveDataProduct.setValue(arrayListProduct);
                }
            }

            /**
             * If request failed
             * @param call
             * @param throwable
             */
            @Override
            public void onFailure(Call<ArrayList<Product>> call, Throwable throwable) {
                arrayListMutableLiveDataProduct.setValue(null);
            }
        });
        return arrayListMutableLiveDataProduct;
    }
}
