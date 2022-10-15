package com.example.ngo_compose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var botomNav : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_main)
       loadFragment(Ngo_Home());
        botomNav = findViewById(R.id.bottomnavbar) as BottomNavigationView
        botomNav.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.poss->{
                    loadFragment(Ngo_Home())
                    true
                }
                R.id.donation->{
                    loadFragment(donation())
                    true }
                R.id.gallery->{
                    loadFragment(gallery())
                    true }
                else->false
            }

        }
       // replcae(Ngo_Home())

    }
    private fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    private fun replcae(homeFragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container,homeFragment)
        fragmentTransaction.commit()
    }
}