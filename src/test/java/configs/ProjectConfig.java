package configs;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.*;

@LoadPolicy(LoadType.MERGE)
@Sources(
        {"system:properties",
         "system:env",
         "classpath:config.properties"
        }
)
public interface ProjectConfig extends Config {
    @Key("homepage.url")
    String homePageURL();

    @Key("books.category.url")
    String booksPageURL();

    @Key("paperback.subcategory.url")
    String paperbackSubcategoryURL();
}
