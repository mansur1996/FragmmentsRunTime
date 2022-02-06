//package com.example.fragmentruntime.activity
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.viewpager.widget.ViewPager
//import com.example.fragmentruntime.R
//import com.example.fragmentruntime.adapter.ViewPagerAdapter
//import com.example.fragmentruntime.fragments.FirstFragment
//import com.example.fragmentruntime.fragments.SecondFragment
//import com.google.android.material.tabs.TabLayout
//
//class ViewPagerActivity : AppCompatActivity() {
//
//    private var viewPagerAdapter : ViewPagerAdapter? = null
//    private var viewPager : ViewPager? = null
//    private var tabLayout : TabLayout? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_view_pager)
//
//        initViews()
//    }
//
//    private fun initViews(){
//        viewPager = findViewById(R.id.viewPager)
//        //setting up the adapter
//        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
//        //add the fragments
//        viewPagerAdapter!!.add(FirstFragment(), "Page 1")
//        viewPagerAdapter!!.add(SecondFragment(), "Page 2")
//        //Set the adapter
//        viewPager.adapter = viewPagerAdapter
//        //The Page(fragment) title will be displayed in the tabLayout hence we need to
//        //set the page viewer
//        //we use the setUpWithViewPager()
//        tabLayout = findViewById(R.id.tab_layout)
//        tabLayout.setupWithViewPager(viewPager)
//    }
//}