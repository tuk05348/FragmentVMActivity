package edu.temple.diceroll

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    private val selectedSide = MutableLiveData<Int>()

    fun setSelectedSide(side: Int){
        selectedSide.value = side
    }

    fun getSelectedSide() : LiveData<Int> {
        return selectedSide
    }
}