package com.bol.example.igorbielievtsov.bolcomtest.productDetails

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.bol.example.igorbielievtsov.bolcomtest.R

class ProductDetailsActivity : AppCompatActivity(), ProductDetailsContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)
    }
}
