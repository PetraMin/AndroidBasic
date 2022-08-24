package com.line.androidbaisc.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.line.androidbaisc.R

/**
 * Created by Min
 * Date 2022/8/24  16:28
 */
class RecycleViewAdapter : RecyclerView.Adapter<RecycleViewAdapter.RecycleViewHolder>() {
    private lateinit var context : Context
    private var list = ArrayList<String>()

    fun setData(list : ArrayList<String>){
        this.list = list
        notifyDataSetChanged()
    }
    inner class RecycleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tv_text = itemView.findViewById<TextView>(R.id.tv_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewHolder {
        context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.item_recycle_view, parent, false)
        return RecycleViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecycleViewHolder, position: Int) {
        holder.tv_text.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}