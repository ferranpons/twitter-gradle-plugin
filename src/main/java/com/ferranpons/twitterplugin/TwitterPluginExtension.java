package com.ferranpons.twitterplugin;

import org.gradle.api.Project;
import org.gradle.api.provider.PropertyState;
import org.gradle.api.provider.Provider;

public class TwitterPluginExtension {

    private final PropertyState<String> consumerKey;
    private final PropertyState<String> consumerSecret;
    private final PropertyState<String> accessToken;
    private final PropertyState<String> accessTokenSecret;
    private final PropertyState<String> message;

    public TwitterPluginExtension(Project project) {
        this.consumerKey = project.property(String.class);
        this.consumerSecret = project.property(String.class);
        this.accessToken = project.property(String.class);
        this.accessTokenSecret = project.property(String.class);
        this.message = project.property(String.class);
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
