package com.bun.cookingrecipe.presentation.fragments.categories

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bun.cookingrecipe.databinding.FragmentLunchBinding
import com.bun.cookingrecipe.presentation.DetailActivity
import com.bun.cookingrecipe.presentation.adapter.FoodAdapter
import com.bun.cookingrecipe.presentation.model.FoodModel
import com.bun.cookingrecipe.presentation.viewmodel.DataViewModel
import com.bun.cookingrecipe.presentation.viewmodel.DataViewModelFactory

class LunchFragment : Fragment() {
    private lateinit var binding: FragmentLunchBinding
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var dataViewModel: DataViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLunchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val factory = DataViewModelFactory(requireContext())
        dataViewModel = ViewModelProvider(this, factory)[DataViewModel::class.java]

        foodAdapter = FoodAdapter()
        recyclerView.adapter = foodAdapter

        val foodList: List<FoodModel> = dataViewModel.foodList[3].listOfCategories
        foodAdapter.submitList(foodList)

        foodAdapter.setOnItemClickListener(object : FoodAdapter.OnItemClickListener {
            override fun onItemClick(foodItem: FoodModel) {
                val intent = Intent(requireActivity(), DetailActivity::class.java)
                intent.putExtra("foodItem", foodItem)
                startActivity(intent)
            }
        })
    }
}