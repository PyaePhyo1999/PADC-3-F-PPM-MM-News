package com.pyaephyomaung.padcmyanmar.news.acitvities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.view.ViewPager;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.Toolbar;


import com.pyaephyomaung.padcmyanmar.news.R;
import com.pyaephyomaung.padcmyanmar.news.adapters.ImagesInNewsDetailsAdapter;
import com.pyaephyomaung.padcmyanmar.news.viewitems.ImageInNewsDetailsViewItem;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by V3-575G on 09-12-2017.
 */

public class NewsDetailsActivity extends AppCompatActivity {

    @BindView(R.id.tb_toolbar) Toolbar toolbar;
    @BindView(R.id.vp_news_details_images) ViewPager vpNewsDeatailsImages;
    private ImagesInNewsDetailsAdapter mImageInNewsDetailsAdapter;
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        ButterKnife.bind(this,this);
      /* setSupportActionBar(toolbar);
         ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);*/
         mImageInNewsDetailsAdapter = new ImagesInNewsDetailsAdapter();
         vpNewsDeatailsImages.setAdapter(mImageInNewsDetailsAdapter);



    }
}
