package com.thejavedsalat.kotlinhelloworld.activities

import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.widget.TextView
import com.thejavedsalat.kotlinhelloworld.R

/**
 * Created by Javed.Salat on 10/15/2017.
 */
class DetailActivity : BaseActivity() {

    var toolbar: Toolbar? = null
    var tvName: TextView? = null
    var tvPhNo: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail);
        toolbar = findViewById(R.id.toolbar) as Toolbar
        tvName = findViewById(R.id.tv_name) as TextView
        tvPhNo = findViewById(R.id.tv_phNo) as TextView
        this.setSupportActionBar(toolbar);
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        toolbar!!.title = intent.extras.getString("name")
        this.tvName!!.text = intent.extras.getString("name")
        this.tvPhNo!!.text = intent.extras.getString("phone")
    }
}