package com.ebsindustrial.eletriccarapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ebsindustrial.eletriccarapp.ui.CarFragment
import com.ebsindustrial.eletriccarapp.ui.FavoriteFragments

class TabsAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> CarFragment()
            1 -> FavoriteFragments()
            else -> CarFragment()
        }
    }

    override fun getItemCount(): Int {
        return 2
    }

}