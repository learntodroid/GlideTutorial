package com.learntodroid.glidetutorial;

public class Game {
    private String title;
    private String genre;
    private String releaseDate;
    private String platform;
    private String boxArtImageUrl;

    public Game(String title, String genre, String releaseDate, String platform, String boxArtImageUrl) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.platform = platform;
        this.boxArtImageUrl = boxArtImageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getBoxArtImageUrl() {
        return boxArtImageUrl;
    }

    public String getPlatform() {
        return platform;
    }
}
