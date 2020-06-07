package com.VideoRental;

public class Video {
    private String videoName;
    private boolean checkOut;
    private int rating;

    Video(String name,int rating){
        this.videoName=name;
        this.checkOut=false;
        this.rating=rating;
    }
    public static Video createVideo(String name,int rating){
        return new Video(name,rating);
    }

    public String getVideoName() {
        return videoName;
    }

    public boolean getCheckOutStatus() {
        return checkOut;
    }
    public String getCheckoutString(){
        String str= getCheckOutStatus() ?  "Checked-out": "Available";
        return str;
    }
    public int getRating() {
        return rating;
    }

    public void doCheckOut(boolean checkOut) {
        this.checkOut = true;
    }

    public void returnCheckOut(boolean checkOut) {
        this.checkOut = false;
    }

    public void recieveRating(int rating) {
        this.rating = rating;
    }
}
