package com.example.praktikum9

import androidx.lifecycle.LiveData
import androidx.room.*

@Entity(tableName = "word_table")
data class Word (@PrimaryKey @ColumnInfo(name = "word") val word: String)


