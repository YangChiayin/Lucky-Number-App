# Lucky Number App

## Overview
Lucky Number App is an Android application designed to strengthen knowledge in using Intents and building high-quality Android applications. The app consists of two activities, where users enter their name, generate a lucky number, and share it with others.

## Features
- Welcome screen with an edit box to input a name
- "Wish Me Luck" button to generate a random number
- Data transfer between activities using Intents
- A second activity displaying the user's lucky number
- A share button allowing users to share their lucky number
- Ability to copy and paste the lucky number
- Works with API level 33

## Screens
### 1. Main Activity
- Displays welcome text: **"Welcome to Lucky Number"**
- Edit text box with a hint: **"Please Enter your Name"**
- Button: **"Wish Me Luck"**

### 2. Second Activity
- Displays **"{username}'s Lucky Number"**
- Shows the randomly generated lucky number
- Different background image
- Share button: **"Share my Lucky Number"**

## How It Works
1. User enters their name and clicks **"Wish Me Luck"**.
2. A random number is generated and stored with the username in an Intent.
3. The second activity retrieves and displays the lucky number.
4. Users can share their lucky number using the **"Share my Lucky Number"** button.
5. A sharing dialog appears with the text **"{username} lucky number is {number}"**.
6. Users can copy and paste this text.

## Technologies Used
- **Java/Kotlin**
- **Android Studio**
- **Intents (Explicit & Implicit)**
- **Random Number Generator**
