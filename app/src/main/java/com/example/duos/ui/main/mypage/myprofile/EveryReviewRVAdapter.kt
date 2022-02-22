package com.example.duos.ui.main.mypage.myprofile

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.duos.data.entities.everyReviews.EveryReviewsItem
import com.example.duos.databinding.MyPlayingReviewItemBinding
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

// 어댑터의 parameter : 데이터리스트. 이 어댑터의 ViewHolder 상속받기
class EveryReviewRVAdapter(private val everyReveiwsItem: ArrayList<EveryReviewsItem>) :
    RecyclerView.Adapter<EveryReviewRVAdapter.ViewHolder>() {

    interface EveryReviewItemClickListener {
        fun onItemClick(everyReveiwsItem: EveryReviewsItem)
    }

    //  리스너 객체를 전달받는 함수와 리스터 객체를 저장할 변수
    private lateinit var mItemClickListener: EveryReviewItemClickListener

    // 외부에서 리스너 객체를 전달 받을 함수
    fun clickPlayerReviewListener(itemClickListener: EveryReviewItemClickListener) {
        mItemClickListener = itemClickListener
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // ViewHolder 생성. (아이템 뷰 객체를 binding해서 뷰 홀더에 던져줌)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EveryReviewRVAdapter.ViewHolder {
        val binding: MyPlayingReviewItemBinding =
            MyPlayingReviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    // ViewHolder에 데이터를 binding (리사이클러뷰의 아이템(데이터)이 바뀔 때마다 실행됨)
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: EveryReviewRVAdapter.ViewHolder, position: Int) {
        holder.bind(everyReveiwsItem[position])
        holder.binding.profileImgCv.setOnClickListener { mItemClickListener.onItemClick(everyReveiwsItem[position]) }
        holder.binding.playerReviewNicknameTv.setOnClickListener { mItemClickListener.onItemClick(everyReveiwsItem[position]) }
        holder.binding.playerGradeRb.setOnClickListener { mItemClickListener.onItemClick(everyReveiwsItem[position]) }
        holder.binding.playerGradeTv.setOnClickListener { mItemClickListener.onItemClick(everyReveiwsItem[position]) }
    }

    // 데이터 리스트의 크기
    override fun getItemCount(): Int = everyReveiwsItem.size

    // 내부클래스 ViewHolder. bind 메서드 정의(리사이클러뷰의 아이템에 데이터리스트의 데이터 연결)
    inner class ViewHolder(val binding: MyPlayingReviewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @RequiresApi(Build.VERSION_CODES.O)
        fun bind(everyReviewsItem: EveryReviewsItem) {

            binding.playerReviewNicknameTv.text = everyReviewsItem.writerNickname    /*writerNickname*/
            Glide.with(binding.profileImgIv.context)                                    /*writerProfilePhotoUrl*/
                .load(everyReviewsItem.writerProfilePhotoUrl)
                .into(binding.profileImgIv)
            binding.playerGradeTv.text = toRatingStr(everyReviewsItem.rating!!)        /*rating*/
            binding.playerGradeRb.rating = everyReviewsItem.rating!!
            binding.reviewDateTv.text = everyReviewsItem.createdAt                      /*createdAt*/
            binding.reviewDateTv.text = toDateStr(everyReviewsItem.createdAt.toString())
            binding.reviewContentTv.text = everyReviewsItem.reviewContent            /*reviewContent*/

        }
    }
    fun toRatingStr(ratingFloat : Float): String{
        val ratingStr = String.format("%.0f", ratingFloat*10).toDouble()/10
        return ratingStr.toString()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun toDateStr(date : String):String{
        val dateFromApi = LocalDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME)
        val dateDifference = ChronoUnit.DAYS.between(dateFromApi, LocalDateTime.now())
        var dateStr : String = ""
        if(dateDifference <= 0){    /* 오늘이면*/
            if(dateFromApi.hour <= 12){
                dateStr = "오늘 오전 ${dateFromApi.hour}시"
            }else{
                dateStr = "오늘 오후 ${dateFromApi.hour}시"
            }

        } else if(dateDifference <= 1){
            if(dateFromApi.hour <= 12){
                dateStr = "어제 오전 ${dateFromApi.hour}시"
            }else{
                dateStr = "어제 오후 ${dateFromApi.hour}시"
            }
        } else{
            dateStr = dateFromApi.toLocalDate().toString()
            //DateTimeFormatter.ofPattern ( "yyyy-MM-dd HH:mm:ss.SSSX" )
        }

        return dateStr
    }
}
