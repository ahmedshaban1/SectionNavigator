package com.example.sectionnavigator.customviews

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.sectionnavigator.R
import kotlinx.android.synthetic.main.horizontal_view_item.view.*

class HorizontalViewItem : ConstraintLayout {
    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(context, attrs)
    }

    private fun init(context: Context, attrs: AttributeSet?) {
        View.inflate(context, R.layout.horizontal_view_item, this)

    }


    fun setTitle(text: String) {
        titleTv.text = text
    }

    fun setTitleColor(color: Int) {
        titleTv.setTextColor(color)
    }

    fun setBackGroundColor(color: Int) {
       // container.setCardBackgroundColor(color)
    }



}