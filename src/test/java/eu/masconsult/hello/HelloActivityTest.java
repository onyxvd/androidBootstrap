package eu.masconsult.hello;

import android.widget.TextView;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

/**
 * User: Venelin Valkov <venelin@masconsult.eu>
 * Date: 24-10-2011
 */
@RunWith(RobolectricTestRunner.class)
public class HelloActivityTest {

  private HelloActivity activity;

  @Before
  public void setup() {
    activity = new HelloActivity();
    activity.onCreate(null);
  }

  @Test
  public void shouldHaveHelloWorldLabel() {
    TextView helloView = (TextView) activity.findViewById(R.id.hello);
    assertEquals("Hello world!", helloView.getText().toString());
  }
}
