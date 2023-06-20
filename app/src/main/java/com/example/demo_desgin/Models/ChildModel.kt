package com.example.demo_desgin.Models

class ChildModel(s: String) {
    private var profile_Text: String? = null

    fun ChildModel(profile_Text: String?) {
        this.profile_Text = profile_Text
    }
    fun getProfile_Text(): String? {
        return profile_Text
    }
}