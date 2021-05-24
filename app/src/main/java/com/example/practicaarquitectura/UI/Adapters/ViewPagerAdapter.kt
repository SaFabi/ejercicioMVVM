package com.example.practicaarquitectura.UI.Adapters


import android.content.Context;
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.practicaarquitectura.UI.Fragments.FragmentHome
import com.example.practicaarquitectura.UI.Fragments.FragmentIngresar

class ViewPagerAdapter(private val myContext: Context, fm: FragmentManager, var totalTabs: Int) : FragmentPagerAdapter(fm) {

    // this is for fragment tabs
    override fun getItem(position: Int): Fragment{
        when (position) {
            0 -> {
                return FragmentHome()
            }
            1 -> {
                return FragmentIngresar()
            }

            else -> return FragmentHome()
        }
    }

    // this counts total number of tabs
    override fun getCount(): Int {
        return totalTabs
    }
}