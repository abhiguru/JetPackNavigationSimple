package `in`.tutorial.jetpacknavigationsimple

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController


/**
 * A simple [Fragment] subclass.
 * Use the [EnterDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EnterDetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_enter_details, container, false)
        val btnVerifyDetails = rootView.findViewById<Button>(R.id.btn_verify_details)
        val etName = rootView.findViewById<EditText>(R.id.et_name)
        val etMobile = rootView.findViewById<EditText>(R.id.et_mobile)

        btnVerifyDetails.setOnClickListener{
            val firstName = etName.text.toString()
            val mobile = etMobile.text.toString()
            when{
                firstName.isEmpty()->{
                    Toast.makeText(activity, "Enter name", Toast.LENGTH_SHORT).show()
                }
                mobile.isEmpty()->{
                    Toast.makeText(activity, "Enter mobile name", Toast.LENGTH_SHORT).show()
                }
                else->{
                    findNavController().navigate(
                        EnterDetailsFragmentDirections
                            .actionEnterDetailsFragmentToVerifyDetailsFragment(
                            firstName,
                            mobile.toLong()
                        )
                    )
                }
            }

        }
        return rootView
    }

}