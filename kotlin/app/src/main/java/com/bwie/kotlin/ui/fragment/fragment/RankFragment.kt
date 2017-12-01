package com.bwie.kotlin.ui.fragment.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import bean.HotData
import com.bwie.kotlin.R
import com.bwie.kotlin.activity.HotPlayActivity
import com.bwie.kotlin.adapter.HotRecyclerView
import com.bwie.kotlin.mvp.contract.HotView
import com.bwie.kotlin.mvp.model.bean.HotModel
import com.bwie.kotlin.mvp.presenter.HotPresenter
import kotlinx.android.synthetic.main.hot_item.*

/**
 * Created by Administrator on 2017/11/30.
 */
class RankFragment : Fragment(),HotView, HotRecyclerView.OnItemClickListener{
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater?.inflate(R.layout.hot_item, container, false)
    }
    companion object {
        fun getINstance(string: String): Fragment {
            var frag = RankFragment()
            var bundle = Bundle()
            bundle.putString("strategy", string)
            frag.arguments = bundle
            return frag
        }
    }

    override fun setData(itemList: List<HotData.ItemListBean>) {
        // Log.i("xxx", "---" + itemList.size)
        if (itemList == null) {
            return
        }
        var linearLayout = LinearLayoutManager(activity)
        hot_recycler.layoutManager = linearLayout
        var apater =  HotRecyclerView(activity, itemList, this)
        hot_recycler.adapter = apater
    }

    override fun onclick(data: HotData.ItemListBean, position: Int) {
        Log.i("xxx", data.data?.title + "")

        val intent: Intent = Intent(this.context, HotPlayActivity::class.java)
        var bundle  = Bundle()
        bundle.putSerializable("data",data)
        intent.putExtra("bundle",bundle)
        startActivity(intent)
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var hotpresenter = HotPresenter(this, HotModel())
        if (arguments != null) {
            hotpresenter.getData(arguments.getString("strategy"))
        }
    }

}