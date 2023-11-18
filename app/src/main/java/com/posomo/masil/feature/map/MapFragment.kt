package com.posomo.masil.feature.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.posomo.masil.databinding.FragmentMapBinding

class MapFragment : Fragment() {

	private var _binding: FragmentMapBinding? = null
	private val binding get() = _binding!!
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		_binding = FragmentMapBinding.inflate(inflater, container, false)
		return binding.root
	}

	companion object {
		@JvmStatic
		fun newInstance() = MapFragment()
	}
}