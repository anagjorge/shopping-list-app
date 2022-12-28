package com.projetos.shoppinglist.ui.shoppingList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.projetos.shoppinglist.R
import com.projetos.shoppinglist.data.db.ShoppingDatabase
import com.projetos.shoppinglist.data.repositories.ShoppingRepository

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        val database = ShoppingDatabase(this)
        val repository = ShoppingRepository(database)
        val factory = ShoppingViewModelFactory(repository)

        val viewModel = ViewModelProvider(this, factory)[ShoppingViewModel::class.java]
    }
}