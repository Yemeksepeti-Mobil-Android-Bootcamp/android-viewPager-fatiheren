package com.fatihhernn.onboardingviewpager.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.fatihhernn.onboardingviewpager.entity.OnBoardingData
import com.fatihhernn.onboardingviewpager.fragments.DeliveryFragment
import com.fatihhernn.onboardingviewpager.fragments.EmptyFragment
import com.fatihhernn.onboardingviewpager.fragments.OrderFragment
import com.fatihhernn.onboardingviewpager.fragments.PrepareFragment



class ViewPagerAdapter(activity:AppCompatActivity,private val items:ArrayList<OnBoardingData>):FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = items.size

    override fun createFragment(position: Int): Fragment {
        val data =items[position]
        return when (position) {
            0 -> OrderFragment(OnBoardingData(data.title,data.description,data.image))
            1 -> PrepareFragment(OnBoardingData(data.title,data.description,data.image))
            2 -> DeliveryFragment(OnBoardingData(data.title,data.description,data.image))
            else ->EmptyFragment()
        }
    }
}