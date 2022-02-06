package com.example.fragmentruntime.model

class User(private var id : Int, private var fullName : String){
    override fun toString(): String {
        return "$id. $fullName"
    }
}