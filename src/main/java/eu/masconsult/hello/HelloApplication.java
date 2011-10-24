package eu.masconsult.hello;

import com.google.inject.Module;
import eu.masconsult.hello.injection.InjectionModule;
import roboguice.application.RoboApplication;

import java.util.List;

/**
 * User: Venelin Valkov <venelin@masconsult.eu>
 * Date: 24-10-2011
 */
public class HelloApplication extends RoboApplication {
  @Override
  protected void addApplicationModules(List<Module> modules) {
    modules.add(new InjectionModule());
  }
}
