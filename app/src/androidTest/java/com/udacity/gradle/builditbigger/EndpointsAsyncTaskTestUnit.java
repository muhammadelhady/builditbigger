
package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTestUnit {

    public EndpointsAsyncTaskTestUnit(){
        super();
    }

    @Test
        public void iTest() throws Exception {
            EndpointsAsyncTask aTest =  new EndpointsAsyncTask();
            aTest.execute();
            String joke = aTest.get(5, TimeUnit.SECONDS);

            Assert.assertEquals("Joke",joke);
        }
}

