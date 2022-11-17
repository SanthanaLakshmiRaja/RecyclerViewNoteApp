package com.example.recyclerviewnoteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewnoteapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

 lateinit var binding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var todolist  = mutableListOf(
          Note("Make your bed",false),
            Note("Do yoga",false),
            Note("Meditate",false),
            Note( "Go for a walk",false))



        val adapter=NoteAdapter(todolist)
        binding.recycler.adapter=adapter
        binding. recycler.layoutManager=LinearLayoutManager(this)
        binding. button.setOnClickListener{
                var todos=binding.titletxt.toString()
                var note=Note(todos,false)
                todolist.add(note)
            //adapter.notifyDataSetChanged()
                adapter.notifyItemInserted(todolist.size-1)

        }

    }
}