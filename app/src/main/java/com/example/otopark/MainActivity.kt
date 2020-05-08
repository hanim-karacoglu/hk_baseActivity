package com.example.otopark

import android.os.Bundle

class MainActivity :BaseActivity() {

  override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
      initlizeViews()
    }
    private fun initlizeViews() {
       // setScreenTitle(R.string.home_labmanuals)
    }
}
