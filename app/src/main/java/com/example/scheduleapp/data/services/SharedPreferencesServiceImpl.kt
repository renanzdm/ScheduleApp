package com.example.scheduleapp.data.services

import android.app.Application
import android.content.SharedPreferences
import com.example.scheduleapp.domain.services.SharedPreferencesService
import com.example.scheduleapp.util.Resource
import javax.inject.Inject

class SharedPreferencesServiceImpl @Inject constructor(
    private val preferences : SharedPreferences
):SharedPreferencesService {
    override fun savePreferences(key: String,value:String): Resource<String> {
        return try {
            val edit =   preferences.edit()
            edit.putString(key,value)
            edit.apply()
            Resource.Success("Salvo com Sucesso")
        }catch ( e:Exception){
            Resource.Error(e.message ?: "")
        }
        
    }
    override fun getPreferences(key: String):Resource<String?> {
        return try {
            Resource.Success(preferences.getString(key,""))
        }catch ( e:Exception){
            Resource.Error(e.message ?: "")
        }
    }
}