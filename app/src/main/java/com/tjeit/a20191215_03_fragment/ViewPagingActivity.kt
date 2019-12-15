package com.tjeit.a20191215_03_fragment

import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.tjeit.a20191215_03_fragment.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_view_paging.*

class ViewPagingActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_paging)
        setValue()
        setupEvent()
    }
    override fun setValue() {
        mainViewPager.adapter = MainViewPagerAdapter(supportFragmentManager)
        mainTabLayout.setupWithViewPager(mainViewPager)
    }
    override fun setupEvent() {
    }
}
