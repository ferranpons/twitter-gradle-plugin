package com.ferranpons.twitterplugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class TwitterPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        TwitterPluginExtension twitterPluginExtension =
                project.getExtensions().create("twitterPlugin", TwitterPluginExtension.class);

        project.getTasks().create("createTweet", TwitterUpdate.class, (task) -> {
            task.setConsumerKey(twitterPluginExtension.consumerKey);
            task.setConsumerSecret(twitterPluginExtension.consumerSecret);
            task.setAccessToken(twitterPluginExtension.accessToken);
            task.setAccessTokenSecret(twitterPluginExtension.accessTokenSecret);
            task.setMessage(twitterPluginExtension.message);
        });
    }
}
