package com.line.androidbaisc

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.line.androidbaisc.activity.MenuActivity
import com.line.androidbaisc.activity.RecycleViewActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Min
 * Date 2022/8/24  15:26
 */
class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewClick()
    }

    fun viewClick(){
        tv_one.setOnClickListener(this)
        tv_two.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val id = v?.id
        when(id){
            R.id.tv_one -> {
                val intent = Intent(this, RecycleViewActivity::class.java)
                startActivity(intent)
            }
            R.id.tv_two -> {
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
            }
        }
    }
}