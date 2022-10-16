package com.example.mvvm

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(private val listener: MainItemListener) : RecyclerView.Adapter<MainHolder>(){

    private val listData = mutableListOf<MainData>()

    fun setContent(data: List<MainData>) {
        listData.clear()
        listData.addAll(data)
    }

    fun notifyInserted(data: MainData, position: Int) {
        listData.add(position, data)
        notifyItemInserted(position)
    }

    fun clearData() {
        listData.clear()
        notifyItemRangeRemoved(0, listData.size - 1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bindItem(listData[position], listener)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

}