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
import fr.thibault.spacedim.databinding.FragmentEmptyWaitingRoomBinding


class EmptyWaitingRoomFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentEmptyWaitingRoomBinding>(
            inflater, R.layout.fragment_empty_waiting_room, container, false)

        binding.joinGameButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_emptyWaitingRoomFragment_to_fullWaitingRoomFragment)
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("EmptyWaiting:LifeCycle", "onAttach called")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("EmptyWaiting:LifeCycle", "onCreate called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("EmptyWaiting:LifeCycle", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("EmptyWaiting:LifeCycle", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("EmptyWaiting:LifeCycle", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("EmptyWaiting:LifeCycle", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("EmptyWaiting:LifeCycle", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("EmptyWaiting:LifeCycle", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("EmptyWaiting:LifeCycle", "onDetach called")
    }

}