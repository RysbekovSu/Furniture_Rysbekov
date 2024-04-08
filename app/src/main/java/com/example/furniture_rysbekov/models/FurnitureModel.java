package com.example.furniture_rysbekov.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;

import com.example.furniture_rysbekov.databinding.ItemCategoryBinding;

import java.util.ArrayList;
import java.util.List;

public class FurnitureModel  implements Parcelable {

    long id;
    String category;
    String title;
    String price;
    String description;
    String discount;
    int imgInt;
    byte[] image;

    public FurnitureModel(String category, String title, String price, String description, int imgInt) {
        this.category = category;
        this.title = title;
        this.price = price;
        this.description = description;
        this.imgInt = imgInt;
        this.image = image;
    }

    public FurnitureModel(String category, String title, String price, String description, String discount, int imgInt, byte[] image) {
        this.category = category;
        this.title = title;
        this.price = price;
        this.description = description;
        this.discount = discount;
        this.imgInt = imgInt;
        this.image = image;
    }

    public FurnitureModel(long id, String category, String title, String price, String description, String discount, int imgInt, byte[] image) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.price = price;
        this.description = description;
        this.discount = discount;
        this.imgInt = imgInt;
        this.image = image;
    }

    public static final Creator<FurnitureModel> CREATOR = new Creator<FurnitureModel>(){
        @Override
        public FurnitureModel createFromParcel(Parcel in){
            return new FurnitureModel(in);
        }
        @Override
        public FurnitureModel[] newArray(int size){
            return new FurnitureModel[size];
        }

    };

    public FurnitureModel(Parcel in) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getImgInt() {
        return imgInt;
    }

    public void setImgInt(int imgInt) {
        this.imgInt = imgInt;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(category);
        dest.writeString(title);
        dest.writeString(price);
        dest.writeString(description);
        dest.writeString(discount);
        dest.writeInt(imgInt);
    }
}
