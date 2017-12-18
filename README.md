Twitter Gradle Plugin
=====================

<img align="left" width="0" height="150px" hspace="5"/>
<img src="https://gradle.org/images/gradle-256x256.png" align="left" width="117px" height="150px"/>
<img align="left" width="0" height="150px" hspace="5"/>

*Gradle plugin*

[![Build Status](https://travis-ci.org/ferranpons/twitter-gradle-plugin.svg?branch=master)](https://travis-ci.org/ferranpons/twitter-gradle-plugin)

Generates a gradle task for sending Twitter updates.

<br/>
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


### Features

* Send tweets


### How To use it

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

twitterPlugin {
  consumerKey = "consumer key"
  consumerSecret = "consumer secret"
  accessToken = "access token"
  accessTokenSecret = "access token secret"
  message = "tweet message"
}
```



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