package com.rezoo.myapp39

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CoustomAdapter(private val mlist:List<ItemViewModel>): RecyclerView.Adapter<CoustomAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemViewModel=mlist[position]
        holder.imageview.setImageResource(itemViewModel.Image)
        holder.textViewname.text=itemViewModel.textname
        holder.textViewfamily.text=itemViewModel.textfamily
    }

    override fun getItemCount(): Int {
        return mlist.size
    }

    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
        val imageview: ImageView =itemView.findViewById(R.id.imgview)
        val textViewname: TextView =itemView.findViewById(R.id.txtviewname )
        val textViewfamily:TextView=itemView.findViewById(R.id.txtviewfamily)
    }

}