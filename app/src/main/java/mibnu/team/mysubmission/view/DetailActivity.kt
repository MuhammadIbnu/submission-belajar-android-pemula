package mibnu.team.mysubmission.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import mibnu.team.mysubmission.R



class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvname: TextView = findViewById(R.id.nama)
        val imgPhoto: ImageView= findViewById(R.id.img_poster)
        val tvtglLahir: TextView= findViewById(R.id.tglLahir)
        val tvposisi:TextView = findViewById(R.id.posisi)
        val tvnational:TextView= findViewById(R.id.national)
        val tvDecs: TextView= findViewById(R.id.deskripsi)

        val name = intent.getStringExtra(EXTRA_NAME)
        val posisi = intent.getStringExtra(EXTRA_POSISI)
        val image=intent.getStringExtra(EXTRA_PHOTO)
        val tgllhr=intent.getStringExtra(EXTRA_TGL_LHR)
        val national = intent.getStringExtra(EXTRA_NATIONAL)
        val decs = intent.getStringExtra(EXTRA_DECS)

        tvname.text=name
        tvposisi.text = posisi
        Glide.with(this)
            .load(image)
            .apply(RequestOptions())
            .into(imgPhoto)
        tvtglLahir.text = tgllhr
        tvnational.text = national
        tvDecs.text = decs

    }

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_TGL_LHR ="extra_tgl_lhr"
        const val EXTRA_POSISI ="extra_posisi"
        const val EXTRA_NATIONAL="extra_national"
        const val EXTRA_DECS = "extra_decs"
    }
}
