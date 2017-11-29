package com.bwie.kotlin.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import bean.MyBean
import cn.jzvd.JZVideoPlayerStandard
import com.bwie.kotlin.R
import com.squareup.picasso.Picasso
/**
 * 类的名称：HomeFragment第一个Fragment适配器
 * 类的作用：展示第一个Fragment
 * 类的作者：陈令鸽
 */
class HomeAdapter(var context: Context, var video: MyBean.MyBean) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    val TYPE_A: Int = 0
    val TYPE_B: Int = 1

    override fun getItemCount(): Int {
        return video.issueList[0].itemList.size
    }

    override fun getItemViewType(position: Int): Int {

        val title = video.issueList[0].itemList[position].data.title
        if (title != null && !"".equals(title)) {
            return TYPE_B
        } else {
            return TYPE_A
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == TYPE_A) {
            val v2 = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false)
            var myViewHolder2 = MyViewHolder2(v2)
            return myViewHolder2
        } else {
            val v = LayoutInflater.from(context).inflate(R.layout.recycler_video, parent, false)
            var myViewHolder = MyViewHolder(v)
            return myViewHolder
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        val type = getItemViewType(position)
        if (type == 0) {
            holder as MyViewHolder2
        } else {
            holder as MyViewHolder

            holder.title.text = video.issueList[0].itemList[position].data.title
            holder.videoplay.setUp(video.issueList[0].itemList[position].data.playUrl, JZVideoPlayerStandard.SCREEN_LAYOUT_NORMAL, video.issueList[0].itemList[position].data.title)
            Log.i("xx", video.issueList[0].itemList[position].data.actionUrl + "*******************")
            Log.i("xx", video.issueList[0].itemList[position].data.actionUrl + "*******************")
            holder.videoplay.thumbImageView.scaleType = ImageView.ScaleType.FIT_XY
            Picasso.with(context).load(video.issueList[0].itemList[position].data.image).into(holder.videoplay.thumbImageView)
        }

    }

    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var title: TextView = itemView!!.findViewById<JZVideoPlayerStandard>(R.id.vide_title) as TextView
        var videoplay: JZVideoPlayerStandard = itemView!!.findViewById<JZVideoPlayerStandard>(R.id.vide_video)

    }

    class MyViewHolder2(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var img: ImageView = itemView!!.findViewById<JZVideoPlayerStandard>(R.id.vide_im) as ImageView

    }
}