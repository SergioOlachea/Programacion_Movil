package com.example.app.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import com.example.app.Components.contact

@Composable
fun MainScreen(navController: NavController) {

    val contacts = listOf( Pair("Sergio", "612-177-1933"), Pair("Carolina", "621-123-1234"))

    val contactList = remember { mutableStateListOf<Pair<String, String>>() }

    LazyColumn {
        items(contacts) { contact ->
            contact(name = contact.first, contact.second)

            contactList.add(Pair(name, phone))
        }
    }
}