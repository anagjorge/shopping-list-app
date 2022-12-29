package com.projetos.shoppinglist.ui.shoppingList

import com.projetos.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}