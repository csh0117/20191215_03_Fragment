package com.tjeit.a20191215_03_fragment

import android.os.Bundle

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
    }

}
