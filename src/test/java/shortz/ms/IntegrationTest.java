package shortz.ms;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import shortz.ms.ShortzApp;
import shortz.ms.config.AsyncSyncConfiguration;
import shortz.ms.config.EmbeddedKafka;
import shortz.ms.config.EmbeddedRedis;
import shortz.ms.config.EmbeddedSQL;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { ShortzApp.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
