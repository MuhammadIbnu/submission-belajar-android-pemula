package mibnu.team.mysubmission.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import mibnu.team.mysubmission.R
import mibnu.team.mysubmission.model.User
import mibnu.team.mysubmission.view.DetailActivity
import java.util.ArrayList

class PlayerAdapter (val listPlayer: ArrayList<User>): RecyclerView.Adapter<PlayerAdapter.ListViewHolder>(){
    inner class ListViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_nama)
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvposisi : TextView  =itemView.findViewById(R.id.tv_posisi)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.itemplayers, parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {

        return  listPlayer.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {

    val (name,posisi,photo,tglLahir,negara,decs )=listPlayer[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)
        holder.tvName.text =name
        holder.tvposisi.text=posisi
        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailActivity::class.java)
            moveDetail.putExtra(DetailActivity.EXTRA_NAME, name)
            moveDetail.putExtra(DetailActivity.EXTRA_PHOTO, photo)
            moveDetail.putExtra(DetailActivity.EXTRA_POSISI, posisi)
            moveDetail.putExtra(DetailActivity.EXTRA_TGL_LHR,tglLahir )
            moveDetail.putExtra(DetailActivity.EXTRA_NATIONAL,negara )
            moveDetail.putExtra(DetailActivity.EXTRA_DECS,decs)
            mContext.startActivity(moveDetail)

        }
    }


}
