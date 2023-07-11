package com.example.example3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val itemList = ArrayList<Item>()
        //var item1 : Item = ("Capture 1" , R.drawable.ic_launcher_foreground)
        itemList.add(Item("Art is not a mirror, but a hammer",R.drawable.a,"Franchesko Iec" ))
        itemList.add(Item("Give me two hours of activity a day, and I will devote the remaining twenty-two hours to sleep",R.drawable.b,"Salvador Dali"))
        itemList.add(Item("Art is not what you see, but what you make others see",R.drawable.c,"Antuan Jan Gro"))
        itemList.add(Item("Your heart is the strongest glue, holding the pieces of our lives together with love and care",R.drawable.d,"Poile Klee"))
        itemList.add(Item("I can't live with myself if I don't live on the edge",R.drawable.e,"Angelika Kaufma"))
        itemList.add(Item("An artist is a container of emotions that come from everywhere: from the sky, from the earth, from a piece of paper, from a passing form, from a web",R.drawable.f,"Max Ernest"))
        itemList.add(Item("Legs why do I need you when I have wings to fly",R.drawable.g,"Frida Kalo"))
        itemList.add(Item("I have always been driven by an inner force that makes me create, express myself through art. It is in this process that I find solace, freedom, and true connection with my true self",R.drawable.h,"Leonora Karrington"))
        itemList.add(Item("Art is a triumph over chaos",R.drawable.i,"Jorjo de Keriko"))
        itemList.add(Item("Art evokes a mystery without which there would be no world",R.drawable.j,"Rene Magritt"))
        itemList.add(Item("Color is a force that directly affects the soul",R.drawable.k,"Vasiliy Kandinskiy"))
        itemList.add(Item("Suprematism is a new discovery of pure art, which in the course of time has been obscured by the accumulation of things",R.drawable.l,"Kazemir Malevich"))
        itemList.add(Item("Our task is to make the photo transparent. Seeing is the main thing. Seeing is everything",R.drawable.m,"Aleksandr Rodchenko"))
        itemList.add(Item("Art is a demon that drags you along",R.drawable.n,"Fransis Pikabia"))
        itemList.add(Item("An artist who knows the nature of his heart can create a picture whose truth will live forever",R.drawable.o,"Thomas Koul"))
        itemList.add(Item("God did not write in his tablet, to humiliate ourselves humiliating myself, you humiliate the deity... after all, you yourself are a particle of eternity pray for your own humanity",R.drawable.p,"Uiliam Bleik"))
        itemList.add(Item("Loyalty is a matter of honor - even loyalty to what you no longer believe in",R.drawable.r,"Teodor Gheriko"))
        itemList.add(Item("Nature is everything for the artist, in its depths is our instruction",R.drawable.s,"Ivan Aivazovskiy"))


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter(applicationContext,itemList)
    }
}