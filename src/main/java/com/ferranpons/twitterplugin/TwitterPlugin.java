package com.ferranpons.twitterplugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class TwitterPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        TwitterPluginExtension twitterPluginExtension =
                project.getExtensions().create("twitterPlugin", TwitterPluginExtension.class, project);

        TwitterUpdate twitterUpdateTask = project.getTasks().create("createTweet", TwitterUpdate.class);

        twitterUpdateTask.setConsumerKey(twitterPluginExtension.getConsumerKeyProvider());
        twitterUpdateTask.setConsumerSecret(twitterPluginExtension.getConsumerSecretProvider());
        twitterUpdateTask.setAccessToken(twitterPluginExtension.getAccessTokenProvider());
        twitterUpdateTask.setAccessTokenSecret(twitterPluginExtension.getAccessTokenSecretProvider());
        twitterUpdateTask.setMessage(twitterPluginExtension.getMessageProvider());
    }
}
