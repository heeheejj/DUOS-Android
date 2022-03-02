package com.example.duos.ui.main.dailyMatching

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.duos.R
import com.example.duos.databinding.FragmentDailyMatchingBinding
import com.example.duos.ui.BaseFragment
import com.example.duos.ui.main.friendList.FriendListViewpagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import android.view.ViewGroup
import android.view.ViewGroup.MarginLayoutParams


class DailyMatchingFragment :
    BaseFragment<FragmentDailyMatchingBinding>(FragmentDailyMatchingBinding::inflate) {

    override fun initAfterBinding() {

        val dailyMatchingViewpagerAdapter = DailyMatchingViewpagerAdapter(this)
        binding.dailyMatchingContentViewpagerVp.adapter = dailyMatchingViewpagerAdapter

        val child = binding.dailyMatchingContentViewpagerVp.getChildAt(0)
        (child as RecyclerView)?.overScrollMode = View.OVER_SCROLL_NEVER

        TabLayoutMediator(
            binding.dailyMatchingContentTabTb,
            binding.dailyMatchingContentViewpagerVp
        ) { tab, position ->
            tab.text = arrayListOf(
                getString(R.string.daily_matching_tab_01),
                getString(R.string.daily_matching_tab_02),
                getString(R.string.daily_matching_tab_03)
            )[position]
        }.attach()
    }
}