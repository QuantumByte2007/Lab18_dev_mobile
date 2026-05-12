package com.ensa.viewmodellivedatademoenrichi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CountViewModel extends ViewModel {

    private final MutableLiveData<Integer> mutData = new MutableLiveData<>();

    public CountViewModel(){
        mutData.setValue(0);
    }

    public void inc(){
        Integer count = mutData.getValue();
        if(count != null) {
            mutData.setValue(count + 1);
        }
    }

    public void dec(){
        Integer count = mutData.getValue();
        if(count != null) {
            mutData.setValue(count - 1);
        }
    }

    public void reset(){
        mutData.setValue(0);
    }


    public LiveData<Integer> getMutData() {
        return mutData;
    }
}
