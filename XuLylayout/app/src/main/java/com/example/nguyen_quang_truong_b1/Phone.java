package com.example.nguyen_quang_truong_b1;

public class Phone {
    private int image;
    public String name;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone(int image, String name) {
        this.image = image;
        this.name = name;
    }
}
