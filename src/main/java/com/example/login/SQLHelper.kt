package com.example.login

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SQLHelper(context: Context) : SQLiteOpenHelper(
    context, BD_NOME, null, BD_VERSAO) {

    override fun onCreate(sqliteDatabase: SQLiteDatabase?) {
        sqliteDatabase!!.execSQL(
            "create table $TBL_ANIV (" +
                    "$TBL_ANIV_ID integer primary key autoincrement," +
                    "$TBL_ANIV_NOME text not null," +
                    "$TBL_ANIV_DIA integer not null," +
                    "$TBL_ANIV_MES text not null," +
                    "$TBL_ANIV_Fone integer not null)"
        )
    }

    override fun onUpgrade(sqliteDatabase: SQLiteDatabase?,
                           oldVersion: Int,
                           newVersion: Int) {
        TODO("Not yet implemented")
    }

}