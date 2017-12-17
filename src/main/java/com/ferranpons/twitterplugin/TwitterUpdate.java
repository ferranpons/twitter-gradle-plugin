package com.ferranpons.twitterplugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterUpdate extends DefaultTask {

    private String consumerKey;
    private String consumerSecret;
    private String accessToken;
    private String accessTokenSecret;
    private String message;

    @TaskAction
    public void sendTweet() throws TwitterException {
        Twitter twitter = getTwitterInstance();
        twitter.updateStatus(getMessage());
        System.out.printf("%s", getMessage());
    }

    private Twitter getTwitterInstance() {
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        configurationBuilder.setDebugEnabled(true)
                .setOAuthConsumerKey(getConsumerKey())
                .setOAuthConsumerSecret(getConsumerSecret())
                .setOAuthAccessToken(getAccessToken())
                .setOAuthAccessTokenSecret(getAccessTokenSecret());
        TwitterFactory twitterFactory = new TwitterFactory(configurationBuilder.build());
        return twitterFactory.getInstance();
    }

    private String getConsumerKey() {
        return consumerKey;
    }

    void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    private String getConsumerSecret() {
        return consumerSecret;
    }

    void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    private String getAccessToken() {
        return accessToken;
    }

    void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    private String getAccessTokenSecret() {
        return accessTokenSecret;
    }

    void setAccessTokenSecret(String accessTokenSecret) {
        this.accessTokenSecret = accessTokenSecret;
    }

    private String getMessage() {
        return message;
    }

    void setMessage(String message) {
        this.message = message;
    }
}
