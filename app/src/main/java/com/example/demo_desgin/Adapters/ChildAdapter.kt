package com.example.demo_desgin.Adapters

import android.content.Context
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.demo_desgin.Models.ChildModel
import com.example.demo_desgin.R
import com.google.android.material.internal.ContextUtils.getActivity
import kotlinx.android.synthetic.main.actvity_child.view.*
import java.util.*

class ChildAdapter(var arrayList: ArrayList<String?>, var mContext: Context) : RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.actvity_child, parent, false)
        return ChildViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
       // holder.profile_Text.text=arrayList[position]!!

        holder.itemView.tv_personal_text.text=arrayList[position]
        if (arrayList[position].equals("Use Fingerprint")){
            holder.itemView.toggle_btn.visibility=View.VISIBLE
            holder.itemView.im_arrow_image.visibility=View.GONE

        }
        else{
            holder.itemView.toggle_btn.visibility=View.GONE
            holder.itemView.im_arrow_image.visibility=View.VISIBLE

        }
    }

    override fun getItemCount(): Int {
        return this.arrayList!!.size
    }

    class ChildViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        var profile_Image: ImageView
//        var profile_Text: TextView

//        init {
//            profile_Image = itemView.findViewById(R.id.im_verfy_arrow_image)
//            profile_Text = itemView.findViewById(R.id.tv_personal_text)
//        }
    }
}


