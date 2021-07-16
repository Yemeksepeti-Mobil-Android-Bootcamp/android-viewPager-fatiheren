package com.fatihhernn.onboardingviewpager.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fatihhernn.onboardingviewpager.entity.OnBoardingData
import com.fatihhernn.onboardingviewpager.base.BaseFragment
import com.fatihhernn.onboardingviewpager.databinding.FragmentOrderBinding

class OrderFragment(private val data: OnBoardingData) :BaseFragment(){
    private lateinit var binding: FragmentOrderBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentOrderBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imageView.setImageResource(data.image)
        binding.txtDescription.text = data.description
        binding.txtTitle.text = data.title
    }

}