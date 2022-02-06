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
class FirstFragment : Fragment() {
    private var listener : FirstListener? = null
    private var tvFirst : TextView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        initViews(view)
        return view
    }
    private fun initViews(view : View){
        tvFirst = view.findViewById(R.id.tv_first)
        val btnFirst = view.findViewById<Button>(R.id.btn_first)

        val user = User(1, "User 1")

        btnFirst.setOnClickListener{ listener!!.onFirstSend(user)}
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = if(context is FirstListener){
            context
        }else{
            throw RuntimeException("$context must implement FirstListener")
        }
    }
    override fun onDetach() {
        super.onDetach()
        listener = null
    }
    fun updateFirstText(user: User){
        tvFirst!!.text = user.toString()
    }
    interface FirstListener{
        fun onFirstSend(user : User)
    }
}