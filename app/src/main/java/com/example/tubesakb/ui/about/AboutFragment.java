package com.example.tubesakb.ui.about;
//Tanggal pengerjaan = 05-08-2022
//NIM = 10119052, 10119062, 10119073, 10119078, 10119079
//Nama = Rizki Dwi Nugraha, Naufal Rafi Pratama, Aghnia Dewi Mahiranie, Adam Firdaus Darmawan, Rafi Khalifanan Azanan
//Kelas = IF-2

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.tubesakb.R;
import com.example.tubesakb.databinding.FragmentAboutBinding;
import com.example.tubesakb.databinding.FragmentHomeBinding;
import com.example.tubesakb.ui.home.HomeViewModel;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment {
    ViewPager2 viewPager2;
    List<AboutViewModel> aboutList;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        viewPager2 = view.findViewById(R.id.viewpager);
        aboutList = new ArrayList<>();

        String[] judul = {"About", "Version"};
        String[] desc = {"Aplikasi ini dibuat untuk memenuhi Tugas Besar AKB", "V 0.1 \n" +
                "Copyright  © 2022 - 2077 RNAAR Inc.\n" +
                "All right reserved\n"};

        for (int i=0; i < judul.length; i++){
            AboutViewModel item = new AboutViewModel(judul[i], desc[i]);
            aboutList.add(item);
        }

        ViewPagerAboutAdapter adapter = new ViewPagerAboutAdapter(aboutList);
        viewPager2.setAdapter(adapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);

        return view;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}
