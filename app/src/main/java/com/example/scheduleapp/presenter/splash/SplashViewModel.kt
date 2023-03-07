package com.example.scheduleapp.presenter.splash

import android.app.Application
import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.scheduleapp.domain.services.SharedPreferencesService
import com.example.scheduleapp.util.Resource
import dagger.hilt.android.internal.Contexts.getApplication
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val sharedPreferencesService: SharedPreferencesService
) : ViewModel() {
    var state by mutableStateOf(SplashState())
    private set
    init {
        onStart()
    }
    
    private fun onStart(){
        redirectIsLogged()
    }
    
    
    private fun redirectIsLogged() {
        state = state.copy(isLogged = true, isLoading = true)
            state = when (val value = sharedPreferencesService.getPreferences(key = "token")) {
                is Resource.Error -> state.copy(isLogged = false)
                is Resource.Success -> state.copy(isLogged = !value.data.isNullOrEmpty())
            }
    }
    
}