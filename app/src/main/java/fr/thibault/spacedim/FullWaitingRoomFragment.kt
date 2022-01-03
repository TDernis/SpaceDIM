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
import fr.thibault.spacedim.databinding.FragmentFullWaitingRoomBinding


class FullWaitingRoomFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentFullWaitingRoomBinding>(
            inflater, R.layout.fragment_full_waiting_room, container, false)

        binding.joinGameButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_fullWaitingRoomFragment_to_gameFragment)
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("FullWaiting:LifeCycle", "onAttach called")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("FullWaiting:LifeCycle", "onCreate called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("FullWaiting:LifeCycle", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("FullWaiting:LifeCycle", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("FullWaiting:LifeCycle", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("FullWaiting:LifeCycle", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("FullWaiting:LifeCycle", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("FullWaiting:LifeCycle", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("FullWaiting:LifeCycle", "onDetach called")
    }

}