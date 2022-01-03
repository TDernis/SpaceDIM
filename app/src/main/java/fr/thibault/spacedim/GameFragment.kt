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
import fr.thibault.spacedim.databinding.FragmentGameBinding


class GameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentGameBinding>(
            inflater, R.layout.fragment_game, container, false)

        binding.winButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_gameFragment_to_gameWonFragment)
        }

        binding.loseButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_gameFragment_to_gameOverFragment)
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("GameFragment:LifeCycle", "onAttach called")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("GameFragment:LifeCycle", "onCreate called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("GameFragment:LifeCycle", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("GameFragment:LifeCycle", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("GameFragment:LifeCycle", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("GameFragment:LifeCycle", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("GameFragment:LifeCycle", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("GameFragment:LifeCycle", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("GameFragment:LifeCycle", "onDetach called")
    }

}