package io.github.backjeff.custombutton

import android.content.Context
import android.opengl.Visibility
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
    }

    private fun setupView() {
        val list = listOf("", "Banco Leon", "Banco Popular")

        val adapter: ArrayAdapter<String> = CustomSpinnerAdapter(
                this@MainActivity,
                R.layout.item,
                list
        )

        spinner.adapter = adapter

        spinner.visibility = View.VISIBLE

        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Log.i("customview", "onNothingSelected")
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Log.i("customview", "onItemSelected position: $position")
            }

        }

        button.setOnClickListener {
            spinner.visibility = View.VISIBLE
//            spinner.performClick()
        }
    }

}
