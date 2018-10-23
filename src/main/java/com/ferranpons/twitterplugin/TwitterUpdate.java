package com.ferranpons.twitterplugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.provider.Property;
import org.gradle.api.provider.Provider;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterUpdate extends DefaultTask {

    private final Property<String> consumerKey;
    private final Property<String> consumerSecret;
    private final Property<String> accessToken;
    private final Property<String> accessTokenSecret;
    private final Property<String> message;

    public TwitterUpdate() {
        this.consumerKey = getProject().getObjects().property(String.class);
        this.consumerSecret = getProject().getObjects().property(String.class);
        this.accessToken = getProject().getObjects().property(String.class);
        this.accessTokenSecret = getProject().getObjects().property(String.class);
        this.message = getProject().getObjects().property(String.class);
    }

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

    @Input
    private String getConsumerKey() {
        return consumerKey.get();
    }

    void setConsumerKey(Provider<String> consumerKey) {
        this.consumerKey.set(consumerKey);
    }

    @Input
    private String getConsumerSecret() {
        return consumerSecret.get();
    }

    void setConsumerSecret(Provider<String> consumerSecret) {
        this.consumerSecret.set(consumerSecret);
    }

    @Input
    private String getAccessToken() {
        return accessToken.get();
    }

    void setAccessToken(Provider<String> accessToken) {
        this.accessToken.set(accessToken);
    }

    @Input
    private String getAccessTokenSecret() {
        return accessTokenSecret.get();
    }

    void setAccessTokenSecret(Provider<String> accessTokenSecret) {
        this.accessTokenSecret.set(accessTokenSecret);
    }

    @Input
    private String getMessage() {
        return message.get();
    }

    void setMessage(Provider<String> message) {
        this.message.set(message);
    }
}
