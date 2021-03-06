package com.esperassignment.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exclusions")
data class MExclusion(
    @PrimaryKey(autoGenerate = true)
    val pid: Long,
    @ColumnInfo(name = "feature_id") val feature_id: String,
    @ColumnInfo(name = "options_id") val options_id: String
)
    