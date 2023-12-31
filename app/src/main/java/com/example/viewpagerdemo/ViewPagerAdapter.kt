package com.example.viewpagerdemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class ViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

        private val COUNT = 4


    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            3-> FourthFragment()
            else -> FirstFragment()
        }
    }

    override fun getCount(): Int {
        return COUNT
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Fragment " + (position + 1)
    }

    }