package com.example.lksfinalcrudretrofit.retrofit;

import com.example.lksfinalcrudretrofit.data.App;
import com.example.lksfinalcrudretrofit.data.Product;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * Interface ini sebagai end-point ke arah server.
 */
public interface APIProduct {

    /**
     * Mengambil semua data
     * @return
     */
    @GET(App.URL_GET_ALL_PRODUCT)
    Call<ArrayList<Product>> getProducts();

    /**
     * Mengambil Product secaras spesifik dengan roduct_id
     * @return
     */
    @GET("products/{product_id}")
    Call<Product> postProduct(int product_id);

    /**
     * Menambahkan Product baru
     * @return
     */
    @POST(App.URL_POST_PRODUCT)
    Call<Product> postProduct();

    /**
     * Mengedit Product
     * @param product_id
     * @return
     */
    @PUT("products/{product_id}")
    Call<Product> putProduct(int product_id);

    /**
     * Menghapus Product
     * @param product_id
     * @return
     */
    @DELETE("products/{product_id}")
    Call<Boolean> deleteProduct(int product_id);
}
