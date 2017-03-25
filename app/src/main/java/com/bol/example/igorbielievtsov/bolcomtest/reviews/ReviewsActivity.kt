package com.bol.example.igorbielievtsov.bolcomtest.reviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.bol.example.igorbielievtsov.bolcomtest.R

class ReviewsActivity : AppCompatActivity(), ReviewsContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reviews)
    }
}
