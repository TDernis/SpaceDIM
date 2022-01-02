package fr.thibault.spacedim

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import fr.thibault.spacedim.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(
            inflater, R.layout.fragment_login, container, false)

        /*binding.playButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_loginFragment_to_emptyWaitingRoomFragment)
        }*/

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("LoginFragment", "onAttach called")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("LoginFragment", "onCreate called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("LoginFragment", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LoginFragment", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("LoginFragment", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("LoginFragment", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("LoginFragment", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("LoginFragment", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("LoginFragment", "onDetach called")
    }
}

