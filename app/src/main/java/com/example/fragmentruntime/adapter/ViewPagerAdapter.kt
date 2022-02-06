package com.example.fragmentruntime.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    private val fragments = ArrayList<Fragment>()
    private val fragmentTitle = ArrayList<String>()

    public fun add(fragment: Fragment, title : String){
        fragments.add(fragment)
        fragmentTitle.add(title)
    }

    override fun getCount() = fragments.size

    override fun getItem(position: Int) = fragments.get(position)
}