package com.annisafitria.cavie

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.annisafitria.cavie.databinding.ActivityMainBinding
import com.annisafitria.cavie.fragment.BerandaFragment
import com.annisafitria.cavie.fragment.FavoriteFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    val fragmentberanda: Fragment = BerandaFragment()
    val fragmentfavorite: Fragment = FavoriteFragment()
    val fm: FragmentManager = supportFragmentManager
    var active : Fragment = fragmentberanda

    private lateinit var bottomNavigationId: BottomNavigationView
    private lateinit var menu: Menu
    private lateinit var menuItem: MenuItem


    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttonNavigation()
    }

    private fun buttonNavigation() {
        fm.beginTransaction().add(R.id.container, fragmentberanda).show(fragmentberanda).commit()
        fm.beginTransaction().add(R.id.container, fragmentfavorite).hide(fragmentfavorite).commit()


        bottomNavigationId = binding.navView
        menu = bottomNavigationId.menu

        menuItem = menu.getItem(0)
        menuItem.isChecked = true

        bottomNavigationId.setOnNavigationItemSelectedListener {item ->
            when(item.itemId) {
                R.id.navigation_beranda -> {
                    callFragment(0, fragmentberanda)
                }

                R.id.navigation_favorite -> {
                    callFragment(1, fragmentfavorite)
                }
            }
            false
        }
    }

    private fun callFragment(index: Int, fragment: Fragment) {
        menuItem  = menu.getItem(index)
        menuItem.isChecked = true
        fm.beginTransaction().hide(active).show(fragment).commit()
        active = fragment
    }
}