package com.thejavedsalat.kotlinhelloworld.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.thejavedsalat.kotlinhelloworld.fragments.ContactFragments


class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {
        var fragment: Fragment? = null
        if (position == 0) {
            fragment = ContactFragments.getInstance()
        } else if (position == 1) {
            fragment = ContactFragments.getInstance()
        } else if (position == 2) {
            fragment = ContactFragments.getInstance()
        }
        return fragment
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        if (position == 0) {
            title = "Speed dial"
        } else if (position == 1) {
            title = "Recents"
        } else if (position == 2) {
            title = "Contacts"
        }
        return title
    }
}