package com.example.firstkotlinproj

import android.app.Application
import android.content.Context
import androidx.core.content.ContextCompat

data class Note(val title:String="note",val content:String="my content",val color:Int) {
}