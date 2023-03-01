package com.example.epfl_meets_unil;

import android.content.Intent;
import android.view.View;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.matcher.IntentMatchers;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.regex.Matcher;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> testRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testIntent(){
        Intents.init();
        ViewInteraction textBox = Espresso.onView(ViewMatchers.withId(R.id.mainName));
        ViewInteraction screen = Espresso.onView(ViewMatchers.withId(R.layout.activity_main));
        ViewInteraction button = Espresso.onView(ViewMatchers.withId(R.id.mainGoButton));
        String testString = "Hubba hubba";
        textBox.perform(ViewActions.clearText());
        textBox.perform(ViewActions.typeText(testString));
        textBox.perform(ViewActions.closeSoftKeyboard());
        button.perform(ViewActions.click());
        Intents.intended(IntentMatchers.hasExtra("name", testString));

        Intents.release();
    }
}
