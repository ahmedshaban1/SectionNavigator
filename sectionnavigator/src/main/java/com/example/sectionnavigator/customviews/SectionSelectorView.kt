package com.example.sectionnavigator.customviews

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sectionnavigator.R
import com.example.sectionnavigator.models.NormalHorizontalStyle
import com.example.sectionnavigator.adapters.HorizontalAdapter
import kotlinx.android.synthetic.main.section_selector_view.view.*

class SectionSelectorView : LinearLayout {
    lateinit var horizontalAdapter: HorizontalAdapter

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
        View.inflate(context, R.layout.section_selector_view, this)
        initHorizontalList()
    }


    private fun initHorizontalList() {
        horizontalRv.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        horizontalAdapter = HorizontalAdapter(mutableListOf())
        horizontalRv.adapter = horizontalAdapter
    }

    fun setHeaderMenu(horizontalStyle: NormalHorizontalStyle) {
        with(horizontalAdapter.data) {
            clear()
            addAll(horizontalStyle.items)
            horizontalAdapter.notifyDataSetChanged()
        }

    }


}
