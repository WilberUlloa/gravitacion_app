package com.base.gravitacin_app

import android.content.Context
import android.telephony.CellIdentityWcdma
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class Adapter (var context: Context, items:ArrayList<ListElement>): BaseAdapter() {
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
        var objView:CentralView?=null
        var viewConteiner:View?=p1
        if (viewConteiner==null){
            viewConteiner = LayoutInflater.from(context).inflate(R.layout.list_element,null)
            objView = CentralView(viewConteiner)
            viewConteiner.tag = objView
        }else
            objView = viewConteiner.tag as? CentralView
        val item = getItem(p0) as ListElement
        objView?.title?.text=item.title
        objView?.description?.text=item.description
        objView?.icon?.setImageResource(item.icon!!)
        return viewConteiner!!
    }

    private class CentralView(vw:View){
        var title:TextView?=null
        var description:TextView?=null
        var icon:ImageView?=null
        init {
            title=vw.findViewById(R.id.title_template)
            description=vw.findViewById(R.id.tag_state_description)
            icon=vw.findViewById(R.id.icon)
        }
    }
}