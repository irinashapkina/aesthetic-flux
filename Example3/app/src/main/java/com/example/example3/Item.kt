package com.example.example3

class Item {
    var quote: String?= null
    var image: Int = 0
    var name:String?= null

    constructor(_quote: String,_image: Int,_name: String){
        name =_name
        image=_image
        quote=_quote
    }
}