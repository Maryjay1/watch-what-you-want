package io.maryjay1.wwyw;


public class TVProgramme {
    private final String id;
    private final String title;
    private final String description;
    private final String channel;
    private final String startTime;
    private final String endTime;


    public TVProgramme(String id, String title, String description, String channel, String startTime, String endTime) {
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


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


    public String getChannel() {
        return channel;
    }

    public String getStartTime() {
        return startTime;
    }


    public String getEndTime() {
        return endTime;
    }


}
