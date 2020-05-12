package com.github.panarik.uitestapp_qaautomated;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


@RunWith(AndroidJUnit4.class)

public class NotesScreenTest {

    @Rule
    public ActivityTestRule<NotesActivity> mNotesActivityActivityTestRule =
            new ActivityTestRule<NotesActivity>(NotesActivity.class);

    @Test
    public void clickAddNoteButton_opensAddNoteUi() throws Exception{
        onView(withId(R.id.addNoteButton))
                .perform(click());
                onView(withId(R.id.noteView))
                .check(matches(isDisplayed()));
    }
}
