package io.github.trytonvanmeer.kotlinanimatedandy.activities

import android.graphics.drawable.Animatable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.github.trytonvanmeer.kotlinanimatedandy.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawableWaving = getDrawable(R.drawable.ic_animated_andy_waving)

        buttonWave.setOnClickListener {
            imageAndy.setImageDrawable(drawableWaving)
            (imageAndy.drawable as Animatable).start()
        }
    }
}
