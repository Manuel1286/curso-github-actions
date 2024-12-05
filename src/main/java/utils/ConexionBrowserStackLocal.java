package utils;

import com.browserstack.local.Local;
import java.util.HashMap;
import java.util.UUID;

public class ConexionBrowserStackLocal {
  static EnvariomentValues env = new EnvariomentValues();

  private ConexionBrowserStackLocal() {}

  static Local bsLocal = new Local();
  static HashMap<String, String> bsLocalArgs = new HashMap<>();

  public static void browserStackLocal() {
    bsLocalArgs.put("key", env.getenv("BROWSERSTACK_ACCESS_KEY"));
    bsLocalArgs.put("geoLocation", "CO");
    bsLocalArgs.put("localIdentifier", UUID.randomUUID().toString());
    bsLocalArgs.put("proxyHost", "localhost");
    bsLocalArgs.put("proxyPort", "8888");
  }

  public static void browserStackLocalfinish() throws Exception {
    bsLocal.stop();
  }
}
