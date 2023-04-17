package com.example.recyclerview_kotlin

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var context:Context,var list: MutableList<Model>):RecyclerView.Adapter<MyView>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {

        var inflater=LayoutInflater.from(context)
        var view=inflater.inflate(R.layout.design,parent,false)
        return MyView(view)
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        holder.image.setImageResource(list.get(position).image)
        holder.text1.setText(list.get(position).name)
        holder.text2.setText(list.get(position).price)
    }

    override fun getItemCount(): Int {
        return list.size
    }


}
class MyView(itemView: View):RecyclerView.ViewHolder(itemView)
{
    var image:ImageView
    var text1:TextView
    var text2:TextView

    init {
        image=itemView.findViewById(R.id.img1)
        text1=itemView.findViewById(R.id.txt1)
        text2=itemView.findViewById(R.id.txt2)
    }
}