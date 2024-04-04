package com.example.lksfinalcrudretrofit.retrofit;

import com.example.lksfinalcrudretrofit.data.App;
import com.example.lksfinalcrudretrofit.data.Product;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface APIProduct {

    @GET(App.URL_GET_ALL_PRODUCT)
    Call<ArrayList<Product>> getProducts();

    @POST(App.URL_POST_PRODUCT)
    Call<Product> postProduct();

    @PUT("products/{product_id}")
    Call<Product> putProduct(int product_id);

    @DELETE("products/{product_id}")
    Call<Boolean> deleteProduct(int product_id);
}
