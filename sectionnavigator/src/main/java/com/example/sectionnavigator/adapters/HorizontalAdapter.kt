package com.example.sectionnavigator.adapters;

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sectionnavigator.R
import com.example.sectionnavigator.extensions.inflate
import kotlinx.android.synthetic.main.horizontal_item.view.*

class HorizontalAdapter(var data: MutableList<String>) :
    RecyclerView.Adapter<HorizontalAdapter.RFilterViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        p1: Int
    ) = RFilterViewHolder(parent.inflate(R.layout.horizontal_item))

    override fun getItemCount(): Int = data.size


    override fun onBindViewHolder(holder: RFilterViewHolder, position: Int) {
         with(holder.itemView.horizontalItem) {
             setTitle(data[position])
             /*setOnClickListener {
                 if (position != selectedIndex) {
                     updateSelectedView(position)
                     listener.onItemClicked(position)
                 }

             }*/
             /*if (data[position].isSelected) {
                 setTitleColor(ContextCompat.getColor(this.context, R.color.intercom_black))
                 setBackGroundColor(ContextCompat.getColor(this.context, R.color.ngwah_grey_light))
             } else {
                 setTitleColor(ContextCompat.getColor(this.context, R.color.white))
                 setBackGroundColor(
                     ContextCompat.getColor(
                         this.context,
                         android.R.color.transparent
                     )
                 )
             }*/


         }

    }

    class RFilterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


}
