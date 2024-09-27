package com.example.hw7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.hw7.databinding.ItemOneBinding

class CarouselAdapter(private val items: List<ContinentModel>, private val onClick: OnClick) :
    RecyclerView.Adapter<CarouselAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemOneBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { onClick.onClick(item) }
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(private val binding: ItemOneBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ContinentModel) {
            binding.img.load(item.img)
        }
    }
}