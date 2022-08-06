package com.example.tubesakb.ui.about;
//Tanggal pengerjaan = 05-08-2022
//NIM = 10119052, 10119062, 10119073, 10119078, 10119079
//Nama = Rizki Dwi Nugraha, Naufal Rafi Pratama, Aghnia Dewi Mahiranie, Adam Firdaus Darmawan, Rafi Khalifanan Azanan
//Kelas = IF-2

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubesakb.R;

import java.util.List;

public class ViewPagerAboutAdapter extends RecyclerView.Adapter<ViewPagerAboutAdapter.ViewHolder> {
    List<AboutViewModel> aboutList;

    public ViewPagerAboutAdapter(List<AboutViewModel> aboutList) {
        this.aboutList = aboutList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.viewpager_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AboutViewModel aboutItem = aboutList.get(position);
        holder.title.setText(aboutItem.title);
        holder.desc.setText(aboutItem.desc);
    }

    @Override
    public int getItemCount() {
        if(aboutList != null) return aboutList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title, desc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_about);
            desc = itemView.findViewById(R.id.desc_about);
        }
    }

}
