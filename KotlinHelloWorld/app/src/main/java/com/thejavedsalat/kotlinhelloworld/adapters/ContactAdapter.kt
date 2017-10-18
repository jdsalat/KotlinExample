package com.georeminder.src.adapters


import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.thejavedsalat.kotlinhelloworld.R
import com.thejavedsalat.kotlinhelloworld.beans.ContactBean
import com.thejavedsalat.kotlinhelloworld.fragments.ContactFragments



/**
 * Created by Javed.Salat on 9/13/2016.
 */
class ContactAdapter(internal var mContext: Context, private val profileBeanList: List<ContactBean>, contactFragment: ContactFragments) : RecyclerView.Adapter<ContactAdapter.MyViewHolder>() {

    init {
        onCLickItemButtonListener = contactFragment
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val contactInfo = profileBeanList[position]
        holder.name!!.text=contactInfo.contactName
        holder.phNo!!.text=contactInfo.contactNumber

    }


    override fun getItemCount(): Int {
        return profileBeanList.size
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener{
        var name: TextView? = null
        var phNo: TextView? = null

        init {
            name = view.findViewById(R.id.name)
            phNo = view.findViewById(R.id.number);
            view.setOnClickListener(this)
        }

        override fun onClick(view: View) {
            clickButton(layoutPosition)
        }


    }

    interface OnCLickItemButtonListener {
        fun onItemButtonClick(position: Int)
    }

    companion object {
        val iD = 0
        var fragment: ContactFragments? = null
        internal lateinit var onCLickItemButtonListener: OnCLickItemButtonListener

        protected fun clickButton(position: Int) {
            onCLickItemButtonListener.onItemButtonClick(position)

        }
    }
}
