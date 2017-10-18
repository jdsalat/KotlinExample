package com.thejavedsalat.kotlinhelloworld.activities

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * Created by Javed.Salat on 3/17/2016.
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    /**
     * This method will be responsible in replacing a fragment in a particular View Group.
     *
     * @param containerViewId
     * @param fragment
     */

    fun replaceFragment(containerViewId: Int, fragment: Fragment) {
        val fragmentTransaction = this.supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(containerViewId, fragment)
        // fragmentTransaction.addToBackStack(null);//add the transaction to the back stack so the user can navigate back
        fragmentTransaction.commit()
    }

    /**
     * This method will be responsible in adding a fragment to a particular View Group.
     *
     * @param containerViewId
     * @param fragment
     */
    fun appendFragment(containerViewId: Int, fragment: Fragment) {
        val fragmentTransaction = this.supportFragmentManager.beginTransaction()
        fragmentTransaction.add(containerViewId, fragment)
        fragmentTransaction.addToBackStack(null)//add the transaction to the back stack so the user can navigate back
        fragmentTransaction.commit()
    }


    fun replaceFragmentWithTag(containerViewId: Int, fragment: Fragment, fragmentTagName: String) {
        val fragmentTransaction = this.supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(containerViewId, fragment, fragmentTagName)
        fragmentTransaction.commit()
    }
}

