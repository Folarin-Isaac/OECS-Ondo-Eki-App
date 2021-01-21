package com.example.oecs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class OnboardingScreen : AppCompatActivity() {
    private lateinit var viewPager:ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen)
        viewPager = findViewById(R.id.view_pager)

        viewPager.adapter = OnboardingPagerAdapter(supportFragmentManager)
    }
}