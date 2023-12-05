package com.example.friendsapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.friendsapp.databinding.FragmentCreateBinding
import com.example.friendsapp.databinding.FragmentReadBinding

class ReadFragment : Fragment() {
    private var _binding: FragmentReadBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentReadBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.list.text = getRefreshToken()
        Log.d("nilai" , "${getRefreshToken()}")
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun getRefreshToken(): String? {
        val sharedPreferences =
            activity?.getSharedPreferences("A", Context.MODE_PRIVATE)
        return sharedPreferences?.getString("x", "kosong")
    }

}