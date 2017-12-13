package com.pyaephyomaung.padcmyanmar.news.adapters;

import android.content.ClipData;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pyaephyomaung.padcmyanmar.news.R;

import com.pyaephyomaung.padcmyanmar.news.viewitems.ImageInNewsDetailsViewItem;

/**
 * Created by V3-575G on 12-12-2017.
 */

public class ImagesInNewsDetailsAdapter extends PagerAdapter {
    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        if(object instanceof View)
            return true;
        else
        return false;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Context context = container.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        ImageInNewsDetailsViewItem view = (ImageInNewsDetailsViewItem) layoutInflater.inflate(R.layout.item_news_details_images,container,false);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
