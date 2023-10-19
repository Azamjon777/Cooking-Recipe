package com.bun.cookingrecipe.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bun.cookingrecipe.databinding.FoodItemBinding
import com.bun.cookingrecipe.presentation.model.FoodModel

class FoodAdapter : ListAdapter<FoodModel, FoodAdapter.FoodViewHolder>(FoodDiffCallback()) {

    private var listener: OnItemClickListener? = null

    interface OnItemClickListener {
        fun onItemClick(foodItem: FoodModel)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    inner class FoodViewHolder(private val binding: FoodItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(foodItem: FoodModel) {
            binding.titleTextView.text = foodItem.title
            binding.cookingTime.text = foodItem.cookingTime
            binding.itemImg.setImageResource(foodItem.img)
            binding.tvServings.text = foodItem.servings.toString()
            binding.tvKcal.text = foodItem.kcal

            binding.root.setOnClickListener {
                listener?.onItemClick(foodItem)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = FoodItemBinding.inflate(inflater, parent, false)
        return FoodViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val foodItem = getItem(position)
        holder.bind(foodItem)
    }
}
