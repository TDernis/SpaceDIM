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
import fr.thibault.spacedim.databinding.FragmentGameWonBinding


class GameWonFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGameWonBinding>(
            inflater, R.layout.fragment_game_won, container, false)

        binding.gameWonRetryButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_gameWonFragment_to_loginFragment)
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("WonFragment:LifeCycle", "onAttach called")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("WonFragment:LifeCycle", "onCreate called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("WonFragment:LifeCycle", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("WonFragment:LifeCycle", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("WonFragment:LifeCycle", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("WonFragment:LifeCycle", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("WonFragment:LifeCycle", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("WonFragment:LifeCycle", "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("WonFragment:LifeCycle", "onDetach called")
    }

}