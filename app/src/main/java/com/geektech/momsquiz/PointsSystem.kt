package com.geektech.momsquiz

import androidx.lifecycle.ViewModel

class PointsSystem: ViewModel() {
    var points: Int = 0

    fun rightAnswer(){
        points++
    }
    fun clearPoints(){

    }
}