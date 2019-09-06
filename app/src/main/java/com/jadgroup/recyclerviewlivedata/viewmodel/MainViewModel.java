package com.jadgroup.recyclerviewlivedata.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.jadgroup.recyclerviewlivedata.model.User;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {

    MutableLiveData<ArrayList<User>> userLiveData;
    ArrayList<User> userArrayList;

    public MainViewModel() {
        userLiveData = new MutableLiveData<>();

        // call your Rest API in init method
        init();
    }

    public MutableLiveData<ArrayList<User>> getUserMutableLiveData() {
        return userLiveData;
    }

    public void init(){
        populateList();
        userLiveData.setValue(userArrayList);
    }

    public void populateList(){

        User user = new User();
        user.setTitle("Darknight");
        user.setDescription("Best rating movie");

        userArrayList = new ArrayList<>();
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
    }
}
