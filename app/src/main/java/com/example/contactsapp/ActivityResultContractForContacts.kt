package com.example.contactsapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContract

class ActivityResultContractForContacts: ActivityResultContract<Unit, Bundle>() {
    override fun createIntent(context: Context, input: Unit): Intent =
        Intent(context, MainActivity::class.java)


    override fun parseResult(resultCode: Int, intent: Intent?): Bundle {
        TODO("Not yet implemented")
    }
}