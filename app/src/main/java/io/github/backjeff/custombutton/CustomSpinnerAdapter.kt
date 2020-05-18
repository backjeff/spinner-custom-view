package io.github.backjeff.custombutton

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CustomSpinnerAdapter(
    context: Context,
    resource: Int,
    objects: List<String>
): ArrayAdapter<String>(context, resource, objects) {

    /*override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View =
        when(position) {
            0 -> TextView(context).also {
                it.visibility = View.GONE
            }
            else -> super.getDropDownView(position, convertView, parent)
        }*/

}