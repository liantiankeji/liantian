package com.bwie.kotlin.find.Adapter
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bwie.kotlin.R
import com.bwie.kotlin.find.Bean.Bean2
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard
/**
 * Created by 王帅彪 on 2017/12/1.
 */
interface OnItemClickListener2 {
    fun onItemClick(view: View, postion: Int)
}
class MyAdapter2 (var context:Context,var list:List<Bean2.Item>): RecyclerView.Adapter<MyAdapter2.viewhoder>() {
    private var lin: OnItemClickListener2?=null
    override fun getItemCount(): Int {
        return list.size
    }
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyAdapter2.viewhoder {
       var view: View =LayoutInflater.from(context).inflate(R.layout.item2,parent,false)
        return viewhoder(view)
    }
    override fun onBindViewHolder(holder: MyAdapter2.viewhoder?, position: Int) {
        holder!!.tv.text=list.get(position).data.title
        val setUp = holder.player.setUp(list.get(position).data.playUrl, JCVideoPlayer.SCREEN_LAYOUT_LIST, "")
        if (setUp) {
            Glide.with(context).load(list.get(position).data.tags.get(0).headerImage).into(holder.player.thumbImageView)
        }
        if (lin != null) {
            holder!!.itemView.setOnClickListener { if (lin != null){
                lin!!.onItemClick(holder!!.player, position)
            }
            }
        }
    }
    class viewhoder (itemview:View):RecyclerView.ViewHolder(itemview){
        var tv:TextView=itemview.findViewById<TextView>(R.id.teeeeee)
        var player:JCVideoPlayerStandard = itemview.findViewById<JCVideoPlayerStandard>(R.id.video)
    }
    fun setOnItemClickLinean2(onItemClickListener: OnItemClickListener2) {
        this.lin = onItemClickListener
    }
}


