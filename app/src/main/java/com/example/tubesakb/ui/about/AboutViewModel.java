package com.example.tubesakb.ui.about;
//Tanggal pengerjaan = 05-08-2022
//NIM = 10119052, 10119062, 10119073, 10119078, 10119079
//Nama = Rizki Dwi Nugraha, Naufal Rafi Pratama, Aghnia Dewi Mahiranie, Adam Firdaus Darmawan, Rafi Khalifanan Azanan
//Kelas = IF-2

import androidx.lifecycle.ViewModel;


public class AboutViewModel extends ViewModel {
    public String title, desc;

    public AboutViewModel(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }
}
