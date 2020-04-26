package mibnu.team.mysubmission.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mibnu.team.mysubmission.R
import mibnu.team.mysubmission.adapter.PlayerAdapter
import mibnu.team.mysubmission.data.DataPemain
import mibnu.team.mysubmission.model.User

class MainActivity : AppCompatActivity() {
    private  lateinit var rvPlayer: RecyclerView
    private lateinit var btnAbout:Button
    private var list: ArrayList<User> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvPlayer = findViewById(R.id.rv_player)
        rvPlayer.setHasFixedSize(true)
        btnAbout =findViewById(R.id.about)

        list.addAll(DataPemain.listData)
        showRecyclerList()
        btnAbout.setOnClickListener { startActivity(Intent(this,AboutActivity::class.java)) }
    }

    private fun showRecyclerList() {
        rvPlayer.layoutManager = LinearLayoutManager(this)
        val listPlayerAdapter = PlayerAdapter(list)
        rvPlayer.adapter = listPlayerAdapter
    }



}
