package `in`.tutorial.jetpacknavigationsimple

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.navArgs

/**
 * A simple [Fragment] subclass.
 * Use the [VerifyDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VerifyDetailsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_verify_details, container, false)

        val tvName = rootView.findViewById<TextView>(R.id.tv_name)
        val tvMobileNumber = rootView.findViewById<TextView>(R.id.tv_mobile_number)

        // Inflate the layout for this fragment
        val args : VerifyDetailsFragmentArgs by navArgs()
        val name = args.name
        val mobile = args.mobile
        tvName?.text = name
        tvMobileNumber?.text = mobile.toString()
        return rootView
    }

}