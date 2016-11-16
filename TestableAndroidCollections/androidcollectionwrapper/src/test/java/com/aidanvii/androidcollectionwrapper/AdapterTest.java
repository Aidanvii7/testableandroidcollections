package com.aidanvii.androidcollectionwrapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by aidan.mcwilliams@vimn.com on 15/11/16.
 */
@RunWith(JUnit4.class)
public class AdapterTest {


    @Test
    public void GIVEN_something_WHEN_something_THEN_something() {
        final UsageExample example = new UsageExample(new JavaSparseArrayWrapperFactory<String>().create());
        //TODO test!
    }

    @Test
    public void GIVEN_somethingElse_WHEN_something_THEN_something() {
        final UsageExample adapter = new UsageExample(new JavaSparseArrayWrapperFactory<String>());
        //TODO test!
    }

}