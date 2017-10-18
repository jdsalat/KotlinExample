package com.thejavedsalat.kotlinhelloworld.fragments

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.georeminder.src.adapters.ContactAdapter
import com.thejavedsalat.kotlinhelloworld.R
import com.thejavedsalat.kotlinhelloworld.activities.DetailActivity
import com.thejavedsalat.kotlinhelloworld.beans.ContactBean
import com.thejavedsalat.kotlinhelloworld.dao.ContactDao

/**
 * Created by Javed.Salat on 10/15/2017.
 */
class ContactFragments : Fragment(), ContactAdapter.OnCLickItemButtonListener {
    var contacts: List<ContactBean> = ArrayList()
    override fun onItemButtonClick(position: Int) {
        val intent = Intent(activity, DetailActivity::class.java)
        intent.putExtra("name", contacts.get(position).contactName)
        intent.putExtra("phone", contacts.get(position).contactNumber)
        startActivity(intent)
    }

    companion object {
        val TAG = ContactFragments::class.java!!.simpleName;
        fun getInstance(): ContactFragments {
            return ContactFragments()
        }


    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView: View = inflater!!.inflate(R.layout.fragment_recycler_view_layout, container, false);
        contacts = ContactDao.getInstance().getContactList();
        val contactAdaapter = ContactAdapter(context, contacts, this)

        val recyclerView: RecyclerView = rootView.findViewById(R.id.recyclerView)

        val llm = LinearLayoutManager(context)
        llm.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = llm
        recyclerView.adapter = contactAdaapter
        recyclerView.itemAnimator = DefaultItemAnimator()

        return rootView;
    }
}