# Project Name
> A2

## Table of contents
* [General Information](#general-information)
* [Technologies](#technologies)
* [Features](#features)
* [Screenshots](#screenshots)
* [Code Examples](#code-examples)
* [Setup](#setup)
* [Status](#status)
* [Contact](#contact)

## General Information
Project **A2** is a simple mobile application for checking and delete picture created with Java and Android Studio.
The project was created for the needs of the classes.

## Technologies
Project is created with:
- Android Studio version: 4.1.3
- Java version: 16

## Features
- The user can create an account and log in
- After logging in, the user can add new pictures 

**To Do:**
- After logging in, the pictures may be checked
- The picture can be delete by click delete


## Screenshots
Example screenshots showing the operation of the mobile application:

The appearance of the application:<br>
![2](https://user-images.githubusercontent.com/84870985/119719752-7644dc80-be69-11eb-8036-d8145b221b96.png)



## Code Examples
The code represents the logic of the "Remove" button:
```
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                for (int i = 0; i < lista.size(); i++) {
                    if(lista.get(i).isToDelete() == true){
                        lista.remove(i);
                    }
                }
                adapter.notifyDataSetChanged();
            }
        });

```

## Setup
To run this application on your home computer, you need to install the android studio application. 
You must download Android Studio [here](https://developer.android.com/studio) and [Java](https://www.oracle.com/pl/java/technologies/javase-jdk11-downloads.html) environment.
Download the project and run it.


## Status
Project is: *in progress*.

## Contact
Created by [Krzysztof Makówka](https://github.com/KrzyMK).
<br>E-mail: anor.spam@gmail.com -feel free to contact me!
