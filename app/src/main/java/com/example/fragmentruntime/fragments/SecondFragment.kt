package com.example.fragmentruntime.fragments
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.fragmentruntime.R
import com.example.fragmentruntime.model.User
import java.lang.RuntimeException
class SecondFragment : Fragment() {
    private  var listener: SecondListener? = null
    private var tvSecond : TextView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        initViews(view)
        return view
    }
    private fun initViews(view : View){
        tvSecond = view.findViewById(R.id.tv_second)
        val btnSecond = view.findViewById<Button>(R.id.btn_second)

        val user = User(2, "User 2")

        btnSecond.setOnClickListener{ listener!!.onSecondSend(user)}
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = if(context is SecondListener){
            context
        } else{
            throw RuntimeException("$context must implement SecondListener")
        }
    }
    override fun onDetach() {
        super.onDetach()
        listener = null
    }
    fun updateSecondText(user : User){
        tvSecond!!.text = user.toString()
    }
    interface SecondListener{
        fun onSecondSend(user : User)
    }
}