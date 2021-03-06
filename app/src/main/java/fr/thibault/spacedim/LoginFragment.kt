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
import fr.thibault.spacedim.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(
            inflater, R.layout.fragment_login, container, false)

        binding.playButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_loginFragment_to_emptyWaitingRoomFragment)
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("LoginFragment:LifeCycle", "onAttach called")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("LoginFragment:LifeCycle", "onCreate called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("LoginFragment:LifeCycle", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LoginFragment:LifeCycle", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("LoginFragment:LifeCycle", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("LoginFragment:LifeCycle", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("LoginFragment:LifeCycle", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("LoginFragmentLifeCycle", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("LoginFragmentLifeCycle", "onDetach called")
    }
}

