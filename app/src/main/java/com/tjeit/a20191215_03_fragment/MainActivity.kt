package com.tjeit.a20191215_03_fragment

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValue()
        setupEvent()
    }
    override fun setValue() {
    }
    override fun setupEvent() {
        firstFragBtn.setOnClickListener {
            firstLayout.visibility = View.VISIBLE
            secondLayout.visibility = View.GONE
        }

        secondFragBtn.setOnClickListener {
            firstLayout.visibility = View.GONE
            secondLayout.visibility = View.VISIBLE
        }

    }

}
