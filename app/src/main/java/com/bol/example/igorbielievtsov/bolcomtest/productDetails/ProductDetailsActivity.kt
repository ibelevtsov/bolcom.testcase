package com.bol.example.igorbielievtsov.bolcomtest.productDetails

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bol.example.igorbielievtsov.bolcomtest.BaseActivity

import com.bol.example.igorbielievtsov.bolcomtest.R
import kotlinx.android.synthetic.main.title_bar.*

class ProductDetailsActivity : BaseActivity(), ProductDetailsContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)

        setupTitleBar(titleBar)
        setTitle("Product details")
    }
}
