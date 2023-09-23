package com.imsoft.softwarecatalogapp


var softList = mutableListOf<SoftTech>()

val SOFT_ID_EXTRA = "softExtra"

class SoftTech (
    var cover: Int,
    var author: String,
    var title: String,
    var description: String,
    val id: Int? = softList.size
)