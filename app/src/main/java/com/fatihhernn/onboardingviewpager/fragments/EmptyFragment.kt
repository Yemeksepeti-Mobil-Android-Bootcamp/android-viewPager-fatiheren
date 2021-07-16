package com.fatihhernn.onboardingviewpager.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fatihhernn.onboardingviewpager.R
import com.fatihhernn.onboardingviewpager.base.BaseFragment

class EmptyFragment:BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_empty,container,false)
    }
}