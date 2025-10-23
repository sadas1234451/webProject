package org.embed;

import static org.assertj.core.api.Assertions.assertThat;

import org.embed.configuration.MyTestsConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest(args = "--app.test=one")
@Import(MyTestsConfiguration.class)
class SpringMyApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void applicationArgumentsPopulate(@Autowired ApplicationArguments args) {
		assertThat(args.getOptionNames()).containsOnly("app.test");
		assertThat(args.getOptionValues("app.test")).containsOnly("one");
	}
}
