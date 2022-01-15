package com.ahmedoalamin.kotlinnews.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ahmedoalamin.kotlinnews.R
import com.ahmedoalamin.model.ApiResponse
import com.ahmedoalamin.model.DataX
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_newsresponse_preview.view.*
import java.lang.Exception

class MainAdapter(private val news: ArrayList<DataX>) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(user: DataX) {
            itemView.apply {
                tvTitle.text = user.title
                tvDescription.text = user.selftext
                tvSource.text = user.subreddit
                tvPublishedAt.text = user.author
        

          try {

              Glide.with(ivArticleImage.context)
                  .load(user.secure_media.oembed.thumbnail_url)
                  .error(R.drawable.empty)
                  .placeholder(R.drawable.empty)
                  .into(ivArticleImage)
          }catch (e: Exception) {

          }


            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_newsresponse_preview, parent, false))

    override fun getItemCount(): Int = news.size
    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(news[position])

    }

    fun addNews(news: ApiResponse) {

       var list :List<DataX>

        list= listOf( news.data.children[0].data,news.data.children[1].data,news.data.children[2].data,news.data.children[3].data
            ,news.data.children[4].data,news.data.children[5].data,news.data.children[6].data,news.data.children[7].data
            ,news.data.children[8].data,news.data.children[9].data,news.data.children[10].data,news.data.children[11].data
            ,news.data.children[12].data,news.data.children[13].data,news.data.children[14].data)
        this.news.apply {
            clear()
            addAll(list)
        }

    }


}