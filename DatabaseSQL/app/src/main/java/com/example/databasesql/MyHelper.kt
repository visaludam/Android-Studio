package com.example.databasesql

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

val COL1 = "city"
val COL2 = "sname"
val DB_NAME = "mydb"
val TABLE_NAME = "staff"

class MyHelper (context: Context): SQLiteOpenHelper(context, DB_NAME, null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {

        var create_table = "create table $TABLE_NAME ($COL1 varchar(250), $COL2 varchar(250))"

        p0?.execSQL(create_table)

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun insertdata(dto: Staff): Long {

        var cv = ContentValues()


        cv.put(COL1, dto.city)
        cv.put(COL2, dto.sname)

        var db = this.writableDatabase
        var res = db.insert(TABLE_NAME, null, cv)

        return res

    }

    fun readRecord(): ArrayList<Staff>{
        lateinit var list: ArrayList<String>
        var temp = Staff("_", "_")
        var db = this.readableDatabase
        var cursor = db.rawQuery("select * from Staff")
        if(cursor.moveToFirst()||cur!=null)
    }
}
//cursor