package com.fatihhernn.onboardingviewpager.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.fatihhernn.onboardingviewpager.R
import com.fatihhernn.onboardingviewpager.databinding.ActivityMainBinding
import com.fatihhernn.onboardingviewpager.databinding.ActivityOnBoardingFinishBinding
import com.fatihhernn.onboardingviewpager.utils.Animato

private lateinit var binding: ActivityOnBoardingFinishBinding

class OnBoardingFinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_finish)


        binding= ActivityOnBoardingFinishBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun clickGetStarted(view: View) {
        binding.button.setOnClickListener {
            val intent =Intent(applicationContext, HomeActivity::class.java)
            startActivity(intent)
            Animato.animateDiagonal(this)
        }
    }
}