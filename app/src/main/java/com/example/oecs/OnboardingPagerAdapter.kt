package com.example.oecs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class OnboardingPagerAdapter(fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        val fragmentList: MutableList<Fragment> = ArrayList()
        when (position){
            0 -> return OnboardingFragment1()
            1 -> return OnboardingFragment2()
        }
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return 2
    }
}