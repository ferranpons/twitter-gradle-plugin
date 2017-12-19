Twitter Gradle Plugin
=====================

<img align="left" width="0" height="150px" hspace="5"/>
<img src="https://dt-cdn.net/assets/images/gfx/icons/tech/gradle-4d8637362c.svg" align="left" width="117px" height="150px"/>
<img align="left" width="0" height="150px" hspace="5"/>

*Gradle plugin*

[![Build Status](https://travis-ci.org/ferranpons/twitter-gradle-plugin.svg?branch=master)](https://travis-ci.org/ferranpons/twitter-gradle-plugin)

Generates a gradle task for sending Twitter updates.

<br/><br/>
<p align="center">
<b><a href="#features">Features</a></b>
|
<b><a href="#how-to-use-it">How to use it</a></b>
|
<b><a href="#who-made-this">Who Made This</a></b>
|
<b><a href="#contribute">Contribute</a></b>
|
<b><a href="#bugs-and-feedback">Bugs and Feedback</a></b>
|
<b><a href="#license">License</a></b>
</p>
<br/>


Features
--------

* Gradle task ("createTweet") that send tweets with your user.



How To use it
-------------

#### Step 1

* You must add your mobile phone to your Twitter profile before creating an application.
* Go to: *Settings* -> *[Add Phone](https://twitter.com/settings/add_phone)* -> *Add number* -> *Confirm* -> *Save*
* Do not forget to turn off all text notifications.

#### Step 2

* Set up a new app
* Go to: *[Twitter Apps](https://apps.twitter.com/)* -> *Create New App* -> *Leave Callback URL empty* -> *Create your Twitter application*
* You should see "Your application has been created. Please take a moment to review and adjust your application's settings".

#### Step 3

* By default, app's access level is `read-only`. To send out tweets, it requires write permission.
* Go to: *Permissions tab* -> *What type of access does your application need?* -> *Choose Read and Write* -> *Update settings*
* You should see "The permission settings have been successfully updated. It may take a moment for the changes to reflect."

#### Step 4

* Time to get the keys and access tokens for OAuth.
* Go to: `Keys and Access Tokens tab`. You'll see this under "Your Access Token" : You haven't authorized this application for your own account yet. By creating your access token here, you will have everything you need to make API calls right away. The access token generated will be assigned your application's current permission level.
* Click `Create my access token`
* You should see "Your application access token has been successfully generated. It may take a moment for changes you've made to reflect. Refresh if your changes are not yet indicated. This access token can be used to make API requests on your own account's behalf. Do not share your access token secret with anyone."
* Verify that you see access token/secret - and the permission is set to "read and write".
* From this page, note down the `Access Token`, `Access Token Secret`, `Consumer Key (API Key)`, `Consumer Secret (API Secret)`. Consumer Key/Secret help twitter identify the app and Access Token/Secret help twitter identify the user (that is you).

#### Step 5

Add to your `build.gradle` file this:

```
buildscript {
  repositories {
    jcenter()
    maven {
      url  "https://dl.bintray.com/ferranpons/maven"
    }
  }
  dependencies {
    classpath 'com.ferranpons:twitter-gradle-plugin:1.0.2'
  }
}

apply plugin: 'twitter-gradle-plugin'


// All the data required to send a tweet, you have to fill it
twitterPlugin {
  consumerKey = "consumer key"
  consumerSecret = "consumer secret"
  accessToken = "access token"
  accessTokenSecret = "access token secret"
  message = "tweet message"
}
```

#### Step 6

You're done. Now you only need to execute the "createTweet" task. ;)



Who made this
--------------


| <a href="https://github.com/ferranpons"><img src="https://avatars2.githubusercontent.com/u/1225463?v=3&s=460" alt="Ferran Pons" align="left" height="100" width="100" /></a>
|---
| [Ferran Pons](https://github.com/ferranpons)


Contribute
----------

1. Create an issue to discuss about your idea
2. [Fork it] (https://github.com/ferranpons/twitter-gradle-plugin/fork)
3. Create your feature branch (`git checkout -b my-new-feature`)
4. Commit your changes (`git commit -am 'Add some feature'`)
5. Push to the branch (`git push origin my-new-feature`)
6. Create a new Pull Request
7. Profit! :white_check_mark:


Bugs and Feedback
-----------------

For bugs, questions and discussions please use the [Github Issues](https://github.com/ferranpons/twitter-gradle-plugin/issues).


License
-------

Copyright 2017 Ferran Pons.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.