package com.example.splashscreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.android.car.ui.toolbar.TabLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout.GRAVITY_FILL


class LoginActivity : AppCompatActivity() {


    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null
    var google: FloatingActionButton? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tabLayout=findViewById(R.id.tab_layout);
        viewPager=findViewById(R.id.view_pager);
        google=findViewById(R.id.fab_google);






        tabLayout!!.addTab(tabLayout!!.newTab().setText("Sign Up"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Login"));


        val adapter = LoginAdapter(supportFragmentManager, this,tabLayout!!.getLeft());

        viewPager!!.adapter = adapter

        viewPager?.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }
            override fun onPageSelected(position: Int) {

            }

        })


}

private fun Any.setText(s: String): Any {
    TODO("Not yet implemented")
}

private fun TabLayout.newTab(): Any {
    TODO("Not yet implemented")
}

private fun TabLayout.addTab(text: Any) {
    TODO("Not yet implemented")
}

private fun TabLayout.setTabGravity(gravityFill: Any) {
    TODO("Not yet implemented")
}
}