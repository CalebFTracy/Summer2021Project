package com.project1.CalebTracy.domain;

public class YoutubeDetails {

    public String subscribers;
    public String channelName;

    public YoutubeDetails() {
        this.subscribers = null;
        this.channelName = null;
    }

    public void setSubscribers(String subs) {
        this.subscribers = subs;
    }

    public void setChannelName(String channel) {
        this.channelName = channel;
    }

    public String getSubscribers() {
        return this.subscribers;
    }

}
