package com.example.recyclerviewnoteapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewnoteapp.databinding.ItemViewBinding


class NoteAdapter(var todo: List<Note>) : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>()
{

    lateinit var binding:ItemViewBinding

    inner class NoteViewHolder(val binding:ItemViewBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        binding=ItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return NoteViewHolder(binding)
    }
    override fun getItemCount(): Int {

        return  todo.size
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {

holder.itemView.apply{
binding.title.text = todo[position].todos

    binding.done.isChecked= todo[position].isChecked

}
}

        }










