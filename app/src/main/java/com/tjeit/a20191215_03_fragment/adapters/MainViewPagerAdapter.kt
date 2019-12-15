package com.tjeit.a20191215_03_fragment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tjeit.a20191215_03_fragment.fragments.FirstFragment
import com.tjeit.a20191215_03_fragment.fragments.SecondFragment

class MainViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
       return when (position) {
           0 -> {FirstFragment()}
           else -> {SecondFragment()}
       }
//       JAVA 문법에 가까움
//        if (position == 0) {
//            return FirstFragment()
//        } else {
//            return SecondFragment()
//        }
    }

    override fun getCount(): Int {
        return 2
    }
}