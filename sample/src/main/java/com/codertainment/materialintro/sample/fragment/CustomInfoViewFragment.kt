package com.codertainment.materialintro.sample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.codertainment.materialintro.MaterialIntroConfiguration
import com.codertainment.materialintro.sample.R
import com.codertainment.materialintro.sequence.materialIntroSequence
import com.codertainment.materialintro.shape.ShapeType
import kotlinx.android.synthetic.main.fragment_custom_info_view.*

class CustomInfoViewFragment : Fragment() {

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_custom_info_view, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    materialIntroSequence(500) {
      // remove listener

      materialIntroSequenceListener = null
      add(MaterialIntroConfiguration().apply {
        isDotViewEnabled = false
        infoCustomViewRes = R.layout.info_custom_view
        showOnlyOnce = false
        targetView = custom_view_res_button
      })
      add(MaterialIntroConfiguration().apply {
        isDotViewEnabled = false
        isDotAnimationEnabled = false
        infoCustomView = ImageView(requireActivity()).apply { setImageResource(R.drawable.diamond) }
        targetView = custom_view_button
        showOnlyOnce = false
        shapeType = ShapeType.RECTANGLE
      })
    }
  }
}
