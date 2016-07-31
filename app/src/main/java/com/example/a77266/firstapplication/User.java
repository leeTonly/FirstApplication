package com.example.a77266.firstapplication;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by 77266 on 2016-7-30.
 */
public class User implements Serializable{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel parcel, int i) {
//        parcel.writeString(getName());
//        parcel.writeInt(getAge());
//    }
//
//    public static final Creator<User> CREATOR = new Creator<User>() {
//        @Override
//        public User createFromParcel(Parcel parcel) {
//            return new User(parcel.readString(), parcel.readInt());
//        }
//
//        @Override
//        public User[] newArray(int i) {
//            return new User[i];
//        }
//    };
}
