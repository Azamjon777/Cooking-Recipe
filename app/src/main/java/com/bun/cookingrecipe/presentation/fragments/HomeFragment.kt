package com.bun.cookingrecipe.presentation.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.bun.cookingrecipe.databinding.FragmentHomeBinding
import com.bun.cookingrecipe.presentation.DetailActivity
import com.bun.cookingrecipe.presentation.MainActivity
import com.bun.cookingrecipe.presentation.adapter.FoodCategoryAdapter
import com.bun.cookingrecipe.presentation.model.FoodCategoryModel
import com.bun.cookingrecipe.presentation.model.FoodModel
import com.bun.cookingrecipe.presentation.viewmodel.DataViewModel
import com.bun.cookingrecipe.presentation.viewmodel.DataViewModelFactory
import kotlin.random.Random

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var foodCategoryAdapter: FoodCategoryAdapter
    private lateinit var dataViewModel: DataViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = DataViewModelFactory(requireContext())
        dataViewModel = ViewModelProvider(this, factory)[DataViewModel::class.java]
        val recyclerView: RecyclerView = binding.recyclerView
        foodCategoryAdapter = FoodCategoryAdapter()
        recyclerView.adapter = foodCategoryAdapter
        binding.tvDetails.setOnClickListener {
            val mainActivity = requireActivity() as MainActivity
            mainActivity.replaceFragment(CategoriesFragment())
        }
        val foodCategories: List<FoodCategoryModel> = dataViewModel.foodList
        foodCategoryAdapter.submitList(foodCategories)
        updateRandomFoodCategory()
    }

    private fun updateRandomFoodCategory() {
        val allFoodItems = dataViewModel.foodList.flatMap { it.listOfCategories }
        val randomFoodItem1 = getRandomFoodItem(allFoodItems)
        val randomFoodItem2 = getRandomFoodItem(allFoodItems)

        binding.randomFoodImg.setImageResource(randomFoodItem1.img)
        binding.categoryName.text = randomFoodItem1.title
        binding.nextImg.setOnClickListener {
            val intent = Intent(requireActivity(), DetailActivity::class.java)
            intent.putExtra("foodItem", randomFoodItem1)
            startActivity(intent)
        }

        binding.itemImg.setImageResource(randomFoodItem2.img)
        binding.itemTitle.text = randomFoodItem2.title
        binding.itemKcal.text = randomFoodItem2.kcal
        if (randomFoodItem2.ingredients.isNotEmpty()) {
            val ingredientList = randomFoodItem2.ingredients.joinToString(", ")
            binding.ingredient1.text = ingredientList
        } else {
            binding.ingredient1.text = ""
        }
        binding.startCookingBtn.setOnClickListener {
            val intent = Intent(requireActivity(), DetailActivity::class.java)
            intent.putExtra("foodItem", randomFoodItem2)
            startActivity(intent)
        }
    }

    private fun getRandomFoodItem(foodItems: List<FoodModel>): FoodModel {
        val randomIndex = Random.nextInt(foodItems.size)
        return foodItems[randomIndex]
    }
}