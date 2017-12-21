package com.app.testdrivendevelopmentexample;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by iSaleem on 12/20/17.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void checkUserNameAndPassword(){
        activityTestRule.launchActivity(new Intent());
        //onView(withId(R.id.etUsername)).check(matches(isDisplayed()));
        onView(withId(R.id.btnLogin)).check(matches(isDisplayed())).perform(click());
        onView(withText("Please Check Username or Password")).check(matches(isDisplayed()));
    }
}
