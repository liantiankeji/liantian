package com.bwie.kotlin.find.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.bwie.kotlin.R
import com.bwie.kotlin.find.Bean.Bean
import com.squareup.picasso.Picasso
interface OnItemClickListener {
    fun onItemClick(view: View, postion: Int)
}
/**
 * Created by 王帅彪 on 2017/11/30.
 */
class MyAdapter(var context:Context,var list:List<Bean.Datas>): RecyclerView.Adapter<MyAdapter.viewhoder>() {
    private var lin: OnItemClickListener?=null

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): viewhoder {
         var  view:View= LayoutInflater.from(context).inflate(R.layout.item,parent,false)
        return viewhoder(view)
    }
    override fun onBindViewHolder(holder:viewhoder?, position: Int) {
        holder!!.tv.text=list.get(position).name
        Picasso.with(context).load(list.get(position).bgPicture).into(holder.image)
        if (lin != null) {
            holder!!.realtabcontent.setOnClickListener{
                if (lin != null){
                    lin!!.onItemClick(holder!!.realtabcontent, position)
            }
            }
        }
    }
    override fun getItemCount(): Int {
        return list.size
    }
    class viewhoder (itemview:View):RecyclerView.ViewHolder(itemview){
        var tv:TextView=itemview.findViewById<TextView>(R.id.textView2)
        var image:ImageView=itemview.findViewById<ImageView>(R.id.image_item)
        var realtabcontent:RelativeLayout=itemview.findViewById<RelativeLayout>(R.id.realtabcontent)

    }
    fun setOnItemClickLinean(onItemClickListener: OnItemClickListener) {
        this.lin = onItemClickListener
    }
}