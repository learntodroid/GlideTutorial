package com.learntodroid.glidetutorial;

public class Game {
    private String title;
    private String genre;
    private String releaseDate;
    private String platform;
    private String boxArtImageUri;
    private String description;

    public Game(String title, String genre, String releaseDate, String platform, String boxArtImageUri) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.platform = platform;
        this.boxArtImageUri = boxArtImageUri;
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

    public String getBoxArtImageUri() {
        return boxArtImageUri;
    }

    public String getPlatform() {
        return platform;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
