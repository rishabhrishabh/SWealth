package com.example.hemantbansal.swealth;

/**
 * Created by Hemant Bansal on 11/20/2016.
 */

public class DonorDetails {
    String hairColor;
    String skinTone;
    int height;
    int weight;
    String physique;
    int donorNo;

    public DonorDetails(int donorNo, String physique, int height,int weight, String hairColor,String skinTone  ) {
        this.donorNo = donorNo;
        this.hairColor = hairColor;
        this.height = height;
        this.physique = physique;
        this.skinTone = skinTone;
        this.weight = weight;
    }

    public int getDonorNo() {
        return donorNo;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getHeight() {
        return height;
    }

    public String getPhysique() {
        return physique;
    }

    public String getSkinTone() {
        return skinTone;
    }

    public int getWeight() {
        return weight;
    }

}
