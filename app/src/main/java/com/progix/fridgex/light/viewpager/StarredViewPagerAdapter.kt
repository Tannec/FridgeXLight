package com.progix.fridgex.light.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.progix.fridgex.light.fragment.StarProductsFragment
import com.progix.fridgex.light.fragment.StarRecipesFragment


class StarredViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                return StarRecipesFragment()
            }
            1 -> {
                return StarProductsFragment()
            }
        }
        return StarRecipesFragment()
    }

    override fun getItemCount(): Int {
        return 2
    }
}