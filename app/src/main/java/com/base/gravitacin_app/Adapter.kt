package com.base.gravitacin_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.list_element.view.*

class Adapter (var vContext: Context, items: ArrayList<ListElement>) : BaseAdapter(){
    var items:ArrayList<ListElement>?=null
    init {
        this.items=items
    }

    override fun getCount(): Int {
        return items?.count()!!
    }

    override fun getItem(p0: Int): Any {
        return items?.get(p0)!!
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var listGeneral:viewGeneral?=null
        var view:View? = p1

        if (view==null){
            view = LayoutInflater.from(vContext).inflate(R.layout.list_element, null)
            listGeneral = viewGeneral(view)
            view.tag = listGeneral
        }
        else
            listGeneral = view.tag as? viewGeneral

        var item = getItem(p0) as ListElement
        listGeneral?.title?.text = item.title
        listGeneral?.description?.text = item.description
        listGeneral?.icon?.setImageResource(item.icon!!)
        return view!!
    }
    private class viewGeneral(varView:View){
        var title:TextView? = null
        var description:TextView? = null
        var icon:ImageView? = null

        init {
            title = varView.findViewById(R.id.title_template)
            description = varView.findViewById(R.id.tag_state_description)
            icon = varView.findViewById(R.id.icon)
        }
    }
}