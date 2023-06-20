package com.example.demo_desgin.Models

class ParentModel(var profileImage: Int, s: String) {
    private var account_Image = 0
    private var account_Text: String? = null
   /* fun ParentModel(account_Image: Int, account_Text: String?) {
        this.account_Image = account_Image
        this.account_Text = account_Text
    }
    fun getAccount_Image(): Int {
        return account_Image
    }
    fun getAccount_Text(): String? {
        return account_Text
    }*/
}

data class ParentModelNew(var profileImage: Int, var string: String)