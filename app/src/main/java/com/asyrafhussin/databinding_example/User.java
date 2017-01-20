package com.asyrafhussin.databinding_example;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by AsyrafHussin on 21/01/2017.
 */

public class User extends BaseObservable {

    private String name = "";
    private String email = "";

    @Bindable
    public String getName(){
        return name;
    }

    @Bindable
    public String getEmail(){
        return this.email;
    }


    public void setName(String name){
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setEmail(String emai){
        this.email = emai;
        notifyPropertyChanged(BR.email);
    }
}
