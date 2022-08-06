package com.example.tubesakb.ui.about;

import androidx.lifecycle.ViewModel;


public class AboutViewModel extends ViewModel {
    public String title, desc;

    public AboutViewModel(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }
}
