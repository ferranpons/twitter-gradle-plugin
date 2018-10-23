package com.ferranpons.twitterplugin;

import org.gradle.api.Project;
import org.gradle.api.provider.Property;
import org.gradle.api.provider.Provider;

public class TwitterPluginExtension {

    private final Property<String> consumerKey;
    private final Property<String> consumerSecret;
    private final Property<String> accessToken;
    private final Property<String> accessTokenSecret;
    private final Property<String> message;

    public TwitterPluginExtension(Project project) {
        this.consumerKey = project.getObjects().property(String.class);
        this.consumerSecret = project.getObjects().property(String.class);
        this.accessToken = project.getObjects().property(String.class);
        this.accessTokenSecret = project.getObjects().property(String.class);
        this.message = project.getObjects().property(String.class);
    }

    public String getConsumerKey() {
        return consumerKey.get();
    }

    public void setConsumerKey(String key) {
        this.consumerKey.set(key);
    }

    public Provider<String> getConsumerKeyProvider() {
        return consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret.get();
    }

    public void setConsumerSecret(String secret) {
        this.consumerSecret.set(secret);
    }

    public Provider<String> getConsumerSecretProvider() {
        return consumerSecret;
    }

    public String getAccessToken() {
        return accessToken.get();
    }

    public void setAccessToken(String token) {
        this.accessToken.set(token);
    }

    public Provider<String> getAccessTokenProvider() {
        return accessToken;
    }

    public String getAccessTokenSecret() {
        return accessTokenSecret.get();
    }

    public void setAccessTokenSecret(String tokenSecret) {
        this.accessTokenSecret.set(tokenSecret);
    }

    public Provider<String> getAccessTokenSecretProvider() {
        return accessTokenSecret;
    }

    public String getMessage() {
        return message.get();
    }

    public void setMessage(String text) {
        this.message.set(text);
    }

    public Provider<String> getMessageProvider() {
        return message;
    }
}
