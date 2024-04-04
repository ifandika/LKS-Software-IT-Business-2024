package com.example.lksfinalcrudretrofit.data;

/**
 * Class ini untuk item product yany dklik
 */
public interface OnItemClickListener {

    /**
     * Fungsi ini untuk produk yang diklik dengan mengambil product yang akan dilihat
     * @param product
     */
    void onItemClick(Product product);
}
