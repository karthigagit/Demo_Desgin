package com.example.demo_desgin.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demo_desgin.Actvity.MainActivity
import com.example.demo_desgin.Models.ParentModelNew
import com.example.demo_desgin.ProfileFragment
import com.example.demo_desgin.R
import java.util.*

class ParentAdapter(var exampleList: ArrayList<ParentModelNew>, var mContext: MainActivity,): RecyclerView.Adapter<ParentAdapter.ParentViewHolder>() {
    //var parentModelArrayList: ArrayList<ParentModel>? = null
    var cxt: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.actvity_parent, parent, false)
        return ParentViewHolder(view)
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
        //parentModelArrayList=exampleList
        //    val currentItem = parentModelArrayList!![position]
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(cxt, LinearLayoutManager.VERTICAL, false)
        holder.childRecyclerView.setLayoutManager(layoutManager)
        holder.childRecyclerView.setHasFixedSize(true)
        holder.account_Text.setText(exampleList[position].string)
        holder.account_Image!!.setImageResource(exampleList[position].profileImage)

        /*  holder.switchCompat.setOnCheckedChangeListener(
                new SwitchCompat.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, final boolean isChecked) {
                    }
                });*/





        val arrayList = ArrayList<String?>()
        if (exampleList[position]!!.string.equals("Account\n")) {
            arrayList.add("Personal Info")
            arrayList.add("Manage Recipients")
            arrayList.add("Manage Auto Payments")
            arrayList.add("Saved Cards")
            arrayList.add("Favourites Payee")
        }
        if (exampleList[position]!!.string.equals("Security\n")) {
            arrayList.add("Use Fingerprint")
            arrayList.add("Change PIN Code")
        }
        if (exampleList[position]!!.string.equals("Support\n")) {
            arrayList.add("FAQ")
            arrayList.add("Live Chat Support")
            arrayList.add("Contact Us")
        }
        if (exampleList!![position]!!.string.equals("Privacy\n")) {
            arrayList.add("Terms and Conditions")
            arrayList.add("Privacy Policy")
            arrayList.add("Consent Management")
        }
        val childAdapter = ChildAdapter(arrayList , holder.childRecyclerView.getContext())
        holder.childRecyclerView.setAdapter(childAdapter)
    }

    override fun getItemCount(): Int {
        return exampleList!!.size
    }

    class ParentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var account_Text: TextView
        var account_Image: ImageView
        var childRecyclerView: RecyclerView
        init {
            account_Image = itemView.findViewById(R.id.profile_Image)
            account_Text = itemView.findViewById(R.id.tv_text_Title)
            childRecyclerView = itemView.findViewById(R.id.child_recyclerview)
        }
    }
}

