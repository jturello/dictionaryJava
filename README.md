# Dictionary

#### Users can add words and their definitions to creat a dictionary, 02.23.2016

#### By James Turello

## Description

Users can add words to a word list and then for each word they can add any number of definitions. All words display in a word list and when the user clicks on a link for any word all definitions for that word are displayed.

## Setup/Installation Requirements

* clone the repository
* in a terminal window cd into the project's root directory
* apply any necessary updates to the build.gradle file to match your directory structure
* run the command 'gradle run' from the project's root directory from the terminal window to start the server
* enter url 'localhost:4567' in your browser
* follow displayed links to add words and their corresponding definitions.

## Known Bugs

Little to no input validation is done by the app. If a user clicks a submit button without entering a value in the input field an empty string will be entered and added to a bulleted list of words or definitions.

## Technologies Used

spark-core 2.1, velocity 1.7, junit 1.7, fluentlenium-core 0.10.3, bootstrap 3.2.0,
java SE 8

### License

This project can be cloned and used under the MIT license agreement.

Copyright (c) 2016 - James Turello
