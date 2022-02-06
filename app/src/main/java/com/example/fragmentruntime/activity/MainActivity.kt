package com.example.fragmentruntime.activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentruntime.R
import com.example.fragmentruntime.fragments.FirstFragment
import com.example.fragmentruntime.fragments.SecondFragment
import com.example.fragmentruntime.model.User

class MainActivity : AppCompatActivity(), FirstFragment.FirstListener, SecondFragment.SecondListener {

    private var firstFragment : FirstFragment? = null
    private var secondFragment : SecondFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
   }

    override fun onFirstSend(user : User) {
        secondFragment!!.updateSecondText(user)
    }

    override fun onSecondSend(user : User) {
        firstFragment!!.updateFirstText(user)
    }

    private fun initViews(){
        firstFragment = FirstFragment()
        secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.frameFirst, firstFragment!!)
            .replace(R.id.frameSecond, secondFragment!!)
            .commit()
    }
}