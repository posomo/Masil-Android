package com.posomo.masil.feature.bookmark

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.posomo.masil.common.util.setStatusBarVisible
import com.posomo.masil.databinding.FragmentBookmarkBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BookmarkFragment : Fragment() {

	private var _binding: FragmentBookmarkBinding? = null
	private val binding get() = _binding!!
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		_binding = FragmentBookmarkBinding.inflate(inflater, container, false)
		requireActivity().setStatusBarVisible()
		return binding.root
	}

	companion object {
		@JvmStatic
		fun newInstance() = BookmarkFragment()
	}
}