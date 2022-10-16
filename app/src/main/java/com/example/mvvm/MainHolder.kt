package com.example.mvvm

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class   MainHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun bindItem(data: MainData, listener: MainItemListener) {

        val imageProfileGithub = "https://avatars.githubusercontent.com/u/24654871?s=400&u=a988212f6f21a08c8b56775afd1d85c5104b3c8c&v=4"

        view.findViewById<TextView>(R.id.frogo_rv_list_type_11_tv_title).text = data.name
        view.findViewById<TextView>(R.id.frogo_rv_list_type_11_tv_subtitle).text = data.age.toString()
        Glide.with(view.context).load(imageProfileGithub).into(view.findViewById(R.id.frogo_rv_list_type_11_iv_poster))
        itemView.setOnClickListener { listener.onClickListener(data) }
    }

}