package com.example.criminalintent

import android.app.Application
import java.util.*

class CriminalIntentApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}