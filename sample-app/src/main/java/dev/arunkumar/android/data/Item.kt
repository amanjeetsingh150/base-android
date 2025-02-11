package dev.arunkumar.android.data

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Item(
  @PrimaryKey
  var id: Int = 0,
  var name: String = ""
) : RealmObject()