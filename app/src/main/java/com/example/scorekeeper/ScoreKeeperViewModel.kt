package com.example.scorekeeper

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreKeeperViewModel: ViewModel() {

    private val TAG = "ScoreViewModel"

    private var _teamAScore = MutableLiveData<Int>(0)
    val teamAScore: LiveData<Int> = _teamAScore

    private var _teamBScore = MutableLiveData<Int>(0)
    val teamBScore: LiveData<Int> = _teamBScore


    fun setTeamAScore(number: Int){
        _teamAScore.value = _teamAScore.value?.plus(number)
        Log.d(TAG, _teamAScore.value.toString())
    }

    fun setTeamBScore(number: Int){
        _teamBScore.value = _teamBScore.value?.plus(number)
    }

    fun teamAScoreDecrease(number: Int){
        if (_teamAScore.value != 0) {
            _teamAScore.value = _teamAScore.value?.minus(number)
            Log.d(TAG, _teamAScore.value.toString())
        }
    }

    fun teamBScoreDecrease(number: Int){
        if (_teamBScore.value != 0) {
            _teamBScore.value = _teamBScore.value?.minus(number)
        }
    }

    fun resetScores(){
        _teamAScore.value = 0
        _teamBScore.value = 0
    }
}