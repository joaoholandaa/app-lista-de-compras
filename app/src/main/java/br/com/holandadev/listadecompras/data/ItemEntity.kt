package br.com.holandadev.listadecompras.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import br.com.holandadev.listadecompras.ItemModel

@Entity
class ItemEntity {
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String
}

fun ItemModel.toModel(onRemove: (ItemModel) -> Unit): ItemModel {
    return ItemModel(
        name = this.name,
        onRemove = onRemove
    )
}