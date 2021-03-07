package com.example.android_yandex_academy_entrance_examination

import android.graphics.Insets.add
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<StocksListsFragment>(R.id.fragment_container_view)
            }
        }
    }
}