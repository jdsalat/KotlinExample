package com.thejavedsalat.kotlinhelloworld.activities

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.widget.Toolbar
import com.thejavedsalat.kotlinhelloworld.R
import com.thejavedsalat.kotlinhelloworld.adapters.ViewPagerAdapter

class MainActivity : BaseActivity() {

    var viewPager: ViewPager? = null;
    var tabLayout: TabLayout? = null
    var viewPagerAdapter: ViewPagerAdapter? = null
    var toolbar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setSupportActionBar(toolbar)
        toolbar = findViewById(R.id.toolbar) as Toolbar
        viewPager = findViewById(R.id.viewpager) as ViewPager
        tabLayout = findViewById(R.id.tabs) as TabLayout
        toolbar!!.title = "Contacts"
        setupViewPager()
    }

    fun setupViewPager() {
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPager!!.adapter = viewPagerAdapter
        tabLayout!!.setupWithViewPager(viewPager)
    }
}
