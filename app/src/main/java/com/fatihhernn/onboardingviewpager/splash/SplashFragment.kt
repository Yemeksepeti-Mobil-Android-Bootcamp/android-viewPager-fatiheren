package com.fatihhernn.onboardingviewpager.splash

import android.animation.Animator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.airbnb.lottie.LottieAnimationView
import com.fatihhernn.onboardingviewpager.R

class SplashFragment:Fragment() {

    lateinit var lottieView:LottieAnimationView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splash,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lottieView=view.findViewById(R.id.animation_view)
        lottieView.addAnimatorListener(object: Animator.AnimatorListener{
            override fun onAnimationStart(animation: Animator?) {
                Toast.makeText(context, "Animation Running", Toast.LENGTH_SHORT).show()
            }

            override fun onAnimationEnd(animation: Animator?) {
                Toast.makeText(context, "Animation End", Toast.LENGTH_SHORT).show()
            }

            override fun onAnimationCancel(animation: Animator?) {
                Toast.makeText(context, "Animation Cancel", Toast.LENGTH_SHORT).show()

            }

            override fun onAnimationRepeat(animation: Animator?) {
                Toast.makeText(context, "Animation Repeat", Toast.LENGTH_SHORT).show()
            }

        })
    }
}