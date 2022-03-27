package com.example.newsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.databinding.ItemCardBinding

class ViewPagerAdapter : RecyclerView.Adapter<PagerVH>() {
    private val colors = intArrayOf(
        android.R.color.black,
        android.R.color.holo_red_light,
        android.R.color.holo_blue_dark,
        android.R.color.holo_purple
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH {
        val binding = ItemCardBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PagerVH(binding)
    }

    override fun getItemCount(): Int = colors.size

    override fun onBindViewHolder(holder: PagerVH, position: Int){
        holder.bind()
    }
}
class PagerVH(private val binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root){

    fun bind() = with(binding){
        button2.text = position.toString()
    }

}