package com.line.androidbaisc.weight

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View
import androidx.annotation.Nullable
import android.util.AttributeSet


/**
 * Created by Min
 * Date 2022/8/25  11:43
 */
class StudyView : View {
    private lateinit var mPaint : Paint
    private lateinit var mContext : Context

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, @Nullable attributes : AttributeSet) : super(context, attributes){
        init(context)
    }

    private fun init(context : Context){
        mContext = context
        mPaint = Paint()
        mPaint.isAntiAlias = true
        mPaint.strokeWidth = 5f
        mPaint.style = Paint.Style.STROKE
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }
}