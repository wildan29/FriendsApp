package com.example.friendsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.friendsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
    var list = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.apply {
         card2.setOnClickListener {
             supportFragmentManager?.beginTransaction()
                            ?.replace(
                                R.id.mainact,
                                CreateFragment(),
                                "CREATE_TAG"
                            )  ?.addToBackStack(null)
                            ?.commit()
         }

            card3.setOnClickListener {
                supportFragmentManager?.beginTransaction()
                    ?.replace(
                        R.id.mainact,
                        ReadFragment(),
                        "READ_TAG"
                    )  ?.addToBackStack(null)
                    ?.commit()
            }

            card4.setOnClickListener {
                supportFragmentManager?.beginTransaction()
                    ?.replace(
                        R.id.mainact,
                        UpdateFragment(),
                        "READ_TAG"
                    )  ?.addToBackStack(null)
                    ?.commit()
            }

            card5.setOnClickListener {
                supportFragmentManager?.beginTransaction()
                    ?.replace(
                        R.id.mainact,
                        DeleteFragment(),
                        "READ_TAG"
                    )  ?.addToBackStack(null)
                    ?.commit()
            }
        }

        setContentView(binding.root)
    }
}