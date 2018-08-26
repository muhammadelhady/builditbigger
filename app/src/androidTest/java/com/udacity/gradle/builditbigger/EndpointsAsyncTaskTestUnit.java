
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
            EndpointsAsyncTaskTest aTest =  new EndpointsAsyncTaskTest();
            aTest.execute(InstrumentationRegistry.getInstrumentation().getTargetContext());
            String joke = aTest.get(5, TimeUnit.SECONDS);
            boolean actual=false;
            if(joke.equals("Joke"))
            {
                actual=true;
            }
            Assert.assertEquals(true,actual);
        }
}

