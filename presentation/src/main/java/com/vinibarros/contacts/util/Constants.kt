package com.vinibarros.contacts.util

import androidx.navigation.navOptions
import com.vinibarros.contacts.R

const val DATABASE_NAME = "contacts_list_db"

val OPTIONS = navOptions {
    anim {
        enter = R.anim.fade_in
        exit = R.anim.fade_out
        popEnter = R.anim.slide_in_left
        popExit = R.anim.slide_out_right
    }
}