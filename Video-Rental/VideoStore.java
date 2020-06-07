package com.VideoRental;

import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Video> myVideoStore;
    private String myAddress;

    public VideoStore(String myAddress){
        this.myAddress=myAddress;
        this.myVideoStore=new ArrayList<Video>();
    }
    Video findVideo(String name){
        for (Video vid : myVideoStore) {
            if (vid.getVideoName().equals(name)) {
                return vid;
            }
        }
        return null;
    }

    void addVideo(String name,int rating){
        Video vid=Video.createVideo(name,rating);
        myVideoStore.add(vid);

    }
    void doCheckout(String name){
        Video vid=findVideo(name);
        vid.doCheckOut(true);
    }

    void doReturn(String name){
        Video vid=findVideo(name);
        vid.doCheckOut(false);

    }
    void receiveRating(String name, int rating){
        Video vid=findVideo(name);
        vid.getRating();
    }
    void listInventory(){
        int i=1;
        for(Video tempVideo:myVideoStore){
            System.out.format("%-15s%-15s%-15s%-15s",i,tempVideo.getVideoName(),tempVideo.getCheckoutString(),tempVideo.getRating());
            System.out.println();
            i++;
        }

    }



}
