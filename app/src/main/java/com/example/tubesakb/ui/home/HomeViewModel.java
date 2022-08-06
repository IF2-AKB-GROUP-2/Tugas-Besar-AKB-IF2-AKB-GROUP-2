package com.example.tubesakb.ui.home;
//Tanggal pengerjaan = 05-08-2022
//NIM = 10119052, 10119062, 10119073, 10119078, 10119079
//Nama = Rizki Dwi Nugraha, Naufal Rafi Pratama, Aghnia Dewi Mahiranie, Adam Firdaus Darmawan, Rafi Khalifanan Azanan
//Kelas = IF-2

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}