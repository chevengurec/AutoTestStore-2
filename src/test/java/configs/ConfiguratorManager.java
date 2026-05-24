package configs;

import org.aeonbits.owner.ConfigCache;

public class ConfiguratorManager {
    protected static ProjectConfig projectConfig;
    public static ProjectConfig getProjectConfig() {
        if (projectConfig == null) {
              projectConfig = ConfigCache.getOrCreate(ProjectConfig.class,
                      System.getenv(),
                      System.getProperties()
              );
        }
        return projectConfig;
    }
}
