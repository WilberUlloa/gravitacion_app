package com.base.gravitacin_app

import android.media.Image
import java.io.Serializable

class ListElement (title:String, description:String, icon:Int) : Serializable {
    var title:String=""
    var description:String=""
    var icon: Int?=0;

    init {
        this.title=title
        this.description=description
        this.icon=icon
    }
}




