package com.example.scheduleapp.domain.services

import com.example.scheduleapp.util.Resource

interface SharedPreferencesService {
    fun savePreferences(key:String,value:String):Resource<String>
    fun getPreferences(key:String):Resource<String?>
}