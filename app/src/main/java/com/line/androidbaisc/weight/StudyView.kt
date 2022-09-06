package com.line.androidbaisc.weight

import android.content.Context
import android.graphics.*
import android.view.View
import androidx.annotation.Nullable
import android.util.AttributeSet
import com.line.androidbaisc.R


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
//        canvas?.drawArc(0f, 0f, 200f, 200f, 0f,90f, true, mPaint)
//        val rectF = RectF(0f, 0f, 200f, 200f)
//        canvas?.drawArc(rectF, 180f, 90f, true, mPaint)
//
//        canvas?.drawArc(300f, 0f, 500f, 200f, 0f, 90f, false, mPaint);
//        val rectF1 = RectF(300f, 0f, 500f, 200f)
//        canvas?.drawArc(rectF1, 180f, 90f, false, mPaint)
//
//        /** drawBitmap */
//        val bitmap = BitmapFactory.decodeResource(mContext.resources, R.mipmap.ic_launcher)
//        // 绘制图片
//        canvas?.drawBitmap(bitmap, 0f, 300f, null)
//        // 将图片拉伸平铺在 RectF 矩形内
//        canvas?.drawBitmap(bitmap, null, RectF(200f, 300f, 500f, 500f), null)
//        // 截取图片的四分之一拉伸平铺在 RectF 矩形内
//        canvas?.drawBitmap(bitmap, Rect(0, 0, bitmap.width/2, bitmap.height/2), RectF(500f, 300f, 800f, 500f), null)
//
//        val matrix = Matrix()
//        // 将 bitmap 平移到此位置
//        matrix.postTranslate(800f, 300f)
////        matrix.postScale(1.5f, 1.5f)
////        matrix.postSkew(-1f, 1f)
//        canvas?.drawBitmap(bitmap, matrix, mPaint)
//        // 为防止 oom，及时回收 bitmap
//        bitmap.recycle()
//
//        canvas?.drawPoint(100f, 700f, mPaint)
//        val points = floatArrayOf(130f, 700f, 160f, 700f, 190f, 700f)
//        canvas?.drawPoints(points, mPaint)

        // 使用 Path 绘制一个楼梯
        val path = Path()
        path.moveTo(0f, 1000f)
        path.lineTo(100f, 1000f)
        path.lineTo(100f, 1100f)
        path.lineTo(200f, 1100f)
        path.lineTo(200f, 1200f)
        path.lineTo(300f, 1200f)
        path.lineTo(300f, 1300f)
        path.lineTo(400f, 1300f)
        path.lineTo(400f, 1400f)
        path.lineTo(0f, 1400f)
        path.lineTo(0f, 1000f);
        path.close();
        canvas?.drawPath(path, mPaint);
    }
}