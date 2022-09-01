package com.example.myfiirebaseratingapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class RateAdapter (val mCtxt:Context , val layoutResId: Int ,val Ratelist:List<Rate>)
    :ArrayAdapter<Rate>(mCtxt,layoutResId,Ratelist)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater= LayoutInflater.from(mCtxt);
        val view:View= layoutInflater.inflate(layoutResId,null );

        val txt_View= view.findViewById<TextView>(R.id.txt_view);

        val rate=Ratelist[position];
        txt_View.text=rate.name;
        return view;
    }
}