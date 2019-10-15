package com.example.pokeapiclientkt.model


import com.google.gson.annotations.SerializedName

data class Base(
    @SerializedName("results") val list: ArrayList<Pokemon>,
    @SerializedName("count")   val count: Int
)