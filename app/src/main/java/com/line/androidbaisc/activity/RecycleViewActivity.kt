package com.line.androidbaisc.activity

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.*
import com.line.androidbaisc.R
import com.line.androidbaisc.adapter.RecycleViewAdapter
import com.line.androidbaisc.databinding.ActivityRecycleViewBinding

/**
 * Created by Min
 * Date 2022/8/24  16:07
 */
class RecycleViewActivity : AppCompatActivity() {
    private val LIST_LINEAR_LAYOUT = 1
    private val LIST_GRID_LAYOUT = 2
    private val LIST_STAGGERED_GRID_LAYOUT = 3

    private lateinit var binding : ActivityRecycleViewBinding
    private lateinit var recycleViewAdapter : RecycleViewAdapter

    private lateinit var linearLayoutManager : LinearLayoutManager
    private lateinit var gridLayoutManager : GridLayoutManager
    private lateinit var staggeredGridLayoutManager : StaggeredGridLayoutManager

    private var list = ArrayList<String>()
    private var recycleViewType = LIST_LINEAR_LAYOUT

    private lateinit var rv_list : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRecycleViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getView()
    }

    fun getView() {
        val tv_change = findViewById<TextView>(R.id.tv_change)
        val tv_add = findViewById<TextView>(R.id.tv_add)
        val tv_delete = findViewById<TextView>(R.id.tv_delete)

        tv_change.setOnClickListener {
            if(recycleViewType == LIST_LINEAR_LAYOUT){
                recycleViewType = LIST_GRID_LAYOUT
                rv_list.layoutManager = gridLayoutManager
            } else if (recycleViewType == LIST_GRID_LAYOUT) {
                recycleViewType = LIST_STAGGERED_GRID_LAYOUT
                rv_list.layoutManager = staggeredGridLayoutManager
            } else {
                recycleViewType = LIST_LINEAR_LAYOUT
                rv_list.layoutManager = linearLayoutManager
            }
        }
        tv_add.setOnClickListener {
            list.add(0, "DDDDDD")
            rv_list.adapter?.notifyItemInserted(0)
            rv_list.scrollToPosition(0)
        }
        tv_delete.setOnClickListener {
            list.removeAt(0)
            rv_list.adapter?.notifyItemRemoved(0)
        }

        initData()

        rv_list = findViewById<RecyclerView>(R.id.rv_list)
        //初始化list排序样式
        linearLayoutManager = LinearLayoutManager(this)
        gridLayoutManager = GridLayoutManager(this, 3)
        staggeredGridLayoutManager = StaggeredGridLayoutManager(3, LinearLayout.VERTICAL)
        //设置list排序样式
        rv_list.layoutManager = linearLayoutManager

        recycleViewAdapter = RecycleViewAdapter()
        //设置adapter
        recycleViewAdapter.setData(list)
        rv_list.adapter = recycleViewAdapter

        val defaultItemAnimator = DefaultItemAnimator()
        defaultItemAnimator.addDuration = 1000
        defaultItemAnimator.removeDuration = 1000
        rv_list.itemAnimator = defaultItemAnimator

        val dividerItemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        dividerItemDecoration.setDrawable(getDrawable(R.drawable.divider_decoration_bg)!!)
//        val myDividerItemDecoration = MyDividerItemDecoration()
        rv_list.addItemDecoration(dividerItemDecoration)
    }

    fun initData(){
        for(i in 1..10){
            if (i % 2 == 0){
                list.add("共有" + i + "...................个，哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈")
            } else if(i % 3 == 0) {
                list.add("共有" + i + "....个，AAAAAAAAAAAAAAAAAA")
            } else {
                list.add("第" + i + "个")
            }
        }
    }


}