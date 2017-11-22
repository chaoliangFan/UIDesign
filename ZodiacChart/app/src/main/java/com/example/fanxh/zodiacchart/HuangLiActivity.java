package com.example.fanxh.zodiacchart;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;

public class HuangLiActivity extends AppCompatActivity {
    private final static String TODAYDESCRIBE = "今日运势得分89分";
    private final static String TAOHUAYUN = "本周(3月5日-3月11日)异性缘很不错，但是注意不要玩暧昧，在另一半面前要注意自己情绪不要把坏情绪发泄到对方身上。";
    private TextView mTodayDescribe;
    private TextView mTaoHuaYun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huang_li);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        mTodayDescribe = (TextView) findViewById(R.id.today_describe);
        mTaoHuaYun = (TextView) findViewById(R.id.tao_hua_yun);

        SpannableString styledText = new SpannableString(TODAYDESCRIBE);
        styledText.setSpan(new TextAppearanceSpan(this, R.style.style0), 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        styledText.setSpan(new TextAppearanceSpan(this, R.style.style1), 6, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mTodayDescribe.setText(styledText, TextView.BufferType.SPANNABLE);

        SpannableString styledTaoHua = new SpannableString(TAOHUAYUN);
        styledTaoHua.setSpan(new TextAppearanceSpan(this, R.style.style2), 0, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mTaoHuaYun.setText(styledTaoHua, TextView.BufferType.SPANNABLE);


    }

}