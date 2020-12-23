package io.apiapp.springbootstarter.tvprogramme;


public class TVProgramme {
    private String id;
    private String title;
    private String description;
    private String channel;
    private String startTime;
    private String endTime;

    public TVProgramme() {

    }

    public TVProgramme(String id, String title, String description, String channel, String startTime, String endTime) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.channel = channel;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
