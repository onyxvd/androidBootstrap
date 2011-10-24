package eu.masconsult.hello;

import android.app.Activity;
import android.os.Bundle;

/**
 * User: Venelin Valkov <venelin@masconsult.eu>
 * Date: 24-10-2011
 */
public class HelloActivity extends Activity {
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.login_layout);
  }
}