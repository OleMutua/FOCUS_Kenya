package org.focuskenya.focuskenya;

import com.google.firebase.database.IgnoreExtraProperties;


@IgnoreExtraProperties
public class Prayers {
    private String artistId;
    private String artistName;
    //private String artistGenre;

    public Prayers(){
        //this constructor is required
    }

    public Prayers(String artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
        //this.artistGenre = artistGenre;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }
}