package com.fatihhernn.onboardingviewpager.entity

import androidx.annotation.DrawableRes

data class OnBoardingData(
    val title:String,
    val description:String,
    @DrawableRes val image : Int
)
