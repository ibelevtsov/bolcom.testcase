package com.bol.example.igorbielievtsov.bolcomtest

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar;
import android.os.Bundle

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private lateinit var titleBar: Toolbar

    public fun setupTitleBar(titleBar: Toolbar) {
        this.titleBar = titleBar;
        setSupportActionBar(this.titleBar);
    }

    public fun setTitle(title: String?) {
        supportActionBar?.setTitle(title);
    }
}
