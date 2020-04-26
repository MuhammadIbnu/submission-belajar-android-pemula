package mibnu.team.mysubmission.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import mibnu.team.mysubmission.R

class Splashscreen : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@Splashscreen,MainActivity::class.java)
            startActivity(intent)
            finish()
        },5000)
    }
}
