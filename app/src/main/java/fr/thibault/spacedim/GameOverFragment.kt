package fr.thibault.spacedim

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import fr.thibault.spacedim.databinding.FragmentGameOverBinding


class GameOverFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentGameOverBinding>(
            inflater, R.layout.fragment_game_over, container, false)

        binding.gameOverRetryButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_gameOverFragment_to_loginFragment)
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("OverFragment:LifeCycle", "onAttach called")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("OverFragment:LifeCycle", "onCreate called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("OverFragment:LifeCycle", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("OverFragment:LifeCycle", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("OverFragment:LifeCycle", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("OverFragment:LifeCycle", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("OverFragment:LifeCycle", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("OverFragment:LifeCycle", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("OverFragment:LifeCycle", "onDetach called")
    }

}