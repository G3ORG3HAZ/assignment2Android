package com.example.assignment2;

import com.google.gson.annotations.SerializedName;

public class Country {
    @SerializedName("name")
    private String name;
    @SerializedName("flagImageResourceId")
    private int flagImageResourceId;
    @SerializedName("option1")
    private String option1;
    @SerializedName("option2")
    private String option2;
    @SerializedName("option3")
    private String option3;
    @SerializedName("option4")
    private String option4;


    public Country(String name, int flagImageResourceId, String option1, String option2, String option3, String option4) {
        this.name = name;
        this.flagImageResourceId = flagImageResourceId;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getName() {
        return name;
    }

    public int getFlagImageResourceId() {
        return flagImageResourceId;
    }
}

