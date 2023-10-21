package com.ebsindustrial.eletriccarapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.ebsindustrial.eletriccarapp.R
import com.ebsindustrial.eletriccarapp.adapter.CarAdapter
import com.ebsindustrial.eletriccarapp.adapter.TabsAdapter
import com.ebsindustrial.eletriccarapp.data.CarFactory
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recuperar()
        setupTabs()
    }

//    fun detalhes(){
//        startActivity(Intent(this, CalcularAutonomiaActivity::class.java))
//    }

    fun recuperar(){
        tabLayout = findViewById(R.id.tab_layout)
        viewPager = findViewById(R.id.view_pager)
    }

    fun setupTabs(){
        val tabsAdapter = TabsAdapter(this)
        viewPager.adapter = tabsAdapter

        tabLayout.addOnTabSelectedListener(object  :TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let { viewPager.currentItem = it.position }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.getTabAt(position)?.select()
            }
        })
    }


}