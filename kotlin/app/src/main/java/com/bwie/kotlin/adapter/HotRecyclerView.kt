package com.bwie.kotlin.adapter

import android.net.Uri
import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import bean.HotData
import com.bwie.kotlin.R
import com.bwie.kotlin.ui.fragment.fragment.RankFragment
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.view.SimpleDraweeView

/**
 * Created by Administrator on 2017/11/30.
 */
class HotRecyclerView(activity: FragmentActivity, itemList: List<HotData.ItemListBean>, rankFragment: RankFragment) : RecyclerView.Adapter<HotRecyclerView.MyViewHolder>() {
        var rankFragment: RankFragment = rankFragment
       var activity: FragmentActivity = activity
    var itemList: List<HotData.ItemListBean> = itemList
    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        val listBean = itemList.get(position)
        val title = listBean.data?.title
        holder?.frce_tv?.text = title
        holder?.frce_iv?.controller =    Fresco.newDraweeControllerBuilder()
                .setUri(Uri.parse(listBean.data?.cover?.detail))
                .setTapToRetryEnabled(true)
                .setOldController(holder?.frce_iv?.getController())
                .build()

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        var  view = View.inflate(activity, R.layout.hotrecycler_item,null)
        var myViewHolder = MyViewHolder(view)

        view.setOnClickListener{
            rankFragment.onclick(itemList.get(myViewHolder.adapterPosition),myViewHolder.adapterPosition);
        }
        return myViewHolder
    }

    class MyViewHolder(item : View) : RecyclerView.ViewHolder(item) {
        var frce_iv : SimpleDraweeView = item.findViewById(R.id.frce_iv)
        var frce_tv : TextView = item.findViewById(R.id.frce_tv)
    }
    interface OnItemClickListener {
        fun onclick(data : HotData.ItemListBean, position: Int)
    }

}