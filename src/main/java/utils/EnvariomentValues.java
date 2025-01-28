package utils;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvariomentValues {
  Dotenv dotenv;
  String github = "GITHUB_ACTIONS";

  public EnvariomentValues() {
    if (System.getenv(github) == null) {
      dotenv = Dotenv.configure().load();
    }
  }

  public String getenv(String key) {
    if (System.getenv(github) == null) {
      return dotenv.get(key);
    } else {
      return System.getenv(key);
    }
  }
}
