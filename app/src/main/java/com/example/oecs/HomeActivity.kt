package com.example.oecs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toolbar: Toolbar
    private lateinit var textView: TextView
    private lateinit var listenNowFragment: ListenNowFragment
    private lateinit var eventsFragment: EventsFragment
    private lateinit var weatherFragment: WeatherFragment
    private lateinit var socialConnectFragment: SocialConnectFragment
    private lateinit var newsFlashFragment: NewsFlashFragment
    private lateinit var podcastsFragment: PodcastsFragment
    private lateinit var liveTvFragment: LiveTvFragment
    private lateinit var triviaFragment: TriviaFragment
    private lateinit var aboutUsFragment: AboutUsFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(findViewById(R.id.toolBar))
        textView = findViewById(R.id.tool_bar_title)


        drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
                this,
                drawerLayout,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        )
        toggle.isDrawerIndicatorEnabled = true
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // navigation drawer listener
        navView.setNavigationItemSelectedListener(this)

        // default fragment is opened when the nav drawer is launched
        listenNowFragment = ListenNowFragment()
        textView.setText(R.string.listen_now)
        supportFragmentManager.beginTransaction()
                .replace(R.id.frame_layout, listenNowFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()

    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle Navigation view item clicks here.
        when (item.itemId){
            R.id.nav_item_listen_now -> {
                val listenNowFragment = ListenNowFragment()
                textView.setText(R.string.listen_now)
                supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, listenNowFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
            }
            R.id.nav_item_about_us -> {
                val aboutUsFragment = AboutUsFragment()
                textView.setText(R.string.about_us)
                supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, aboutUsFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
            }
            R.id.nav_item_events -> {
                val eventsFragment = EventsFragment()
                textView.setText(R.string.events)
                supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, eventsFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
            }
            R.id.nav_item_live_tv -> {
                val liveTvFragment = LiveTvFragment()
                textView.setText(R.string.watch_now)
                supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, liveTvFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
            }
            R.id.nav_item_podcasts -> {
                val podcastsFragment = PodcastsFragment()
                textView.setText(R.string.podcast)
                supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, podcastsFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
            }
            R.id.nav_item_weather -> {
                val weatherFragment = WeatherFragment()
                textView.setText(R.string.weather)
                supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, weatherFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
            }
            R.id.nav_item_trivia -> {
                val triviaFragment = TriviaFragment()
                textView.setText(R.string.trivia)
                supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, triviaFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
            }
            R.id.nav_item_social_connect ->{
                val socialConnectFragment = SocialConnectFragment()
                textView.setText(R.string.social_connect)
                supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, socialConnectFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
            }
            R.id.nav_item_news_flash -> {
                val newsFlashFragment = NewsFlashFragment()
                textView.setText(R.string.news_flash)
                supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, newsFlashFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}