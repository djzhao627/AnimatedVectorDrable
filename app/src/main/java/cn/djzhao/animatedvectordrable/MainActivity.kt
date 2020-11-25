package cn.djzhao.animatedvectordrable

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var avdc: AnimatedVectorDrawableCompat
    lateinit var avd: AnimatedVectorDrawable


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val drawable = done.drawable
            when (drawable) {
                is AnimatedVectorDrawableCompat -> drawable.start()
                is AnimatedVectorDrawable -> drawable.start()
            }
        }
    }
}