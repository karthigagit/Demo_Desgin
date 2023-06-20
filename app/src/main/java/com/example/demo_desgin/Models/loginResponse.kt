package com.example.demo_desgin.Models

class loginResponse {
      var username:String=""
      var password:String=""
    lateinit var cuntrices:Country
}

data class Country(
        var cuntry_name:String,
        var country_code:String
)