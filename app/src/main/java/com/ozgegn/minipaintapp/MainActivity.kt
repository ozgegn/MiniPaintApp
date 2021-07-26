package com.ozgegn.minipaintapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val canvasView = CanvasView(this)
        canvasView.run {
            systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
            contentDescription = getString(R.string.canvasContentDescription)
        }
        setContentView(canvasView)

    }
}