package com.bun.cookingrecipe.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.ViewModelProvider
import com.bun.cookingrecipe.databinding.FragmentCategoriesBinding
import com.bun.cookingrecipe.presentation.fragments.categories.BreakfastFragment
import com.bun.cookingrecipe.presentation.fragments.categories.DinnerFragment
import com.bun.cookingrecipe.presentation.fragments.categories.FishDishesFragment
import com.bun.cookingrecipe.presentation.fragments.categories.LunchFragment
import com.bun.cookingrecipe.presentation.fragments.categories.VegetablesFragment
import com.bun.cookingrecipe.presentation.viewmodel.DataViewModel
import com.bun.cookingrecipe.presentation.viewmodel.DataViewModelFactory

class CategoriesFragment : Fragment() {
    private lateinit var binding: FragmentCategoriesBinding
    private lateinit var viewModel: DataViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCategoriesBinding.inflate(inflater, container, false)
        val viewModelFactory = DataViewModelFactory(requireContext())
        viewModel = ViewModelProvider(this, viewModelFactory)[DataViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout
        val pagerAdapter = MyPagerAdapter(childFragmentManager)
        viewPager.adapter = pagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }

    private inner class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getCount(): Int {
            return 5
        }

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> BreakfastFragment()
                1 -> DinnerFragment()
                2 -> FishDishesFragment()
                3 -> LunchFragment()
                4 -> VegetablesFragment()
                else -> throw IllegalArgumentException("Invalid position: $position")
            }
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return when (position) {
                0 -> "Breakfast"
                1 -> "Dinner"
                2 -> "Fish Dishes"
                3 -> "Lunch"
                4 -> "Vegetables"
                else -> null
            }
        }
    }
}