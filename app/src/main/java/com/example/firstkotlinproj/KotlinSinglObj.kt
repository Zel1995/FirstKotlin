package com.example.firstkotlinproj

object KotlinSinglObj {
    val strData: String = "my singltone data"
    fun myCopy(note: Note): String {
        val myCopyNote = note.copy("copyTitle", "CopyContent", 3)
        return myCopyNote.title + myCopyNote.content
    }
}
