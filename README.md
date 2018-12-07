# MultipleActivitiesSharingData
This Kotlin app has a Sign-In activity, a Profile activity, and an Edit activity.  You first see your profile info (which defaults to "Not Set") at first.  You then sign in and are taken to the Profile.  The "Not Set" from the previous activity is sent to the profile via an intent.  Then, you have an opportunity to edit the profile to add your name, age, city, and state.  Upon saving, you return to the profile, where the information that you entered is visible via an intent (from the Edit page).  From there, you can back out to the Sign-In screen again, and your information is shown there as well, also via an intent...this time from the Profile page.