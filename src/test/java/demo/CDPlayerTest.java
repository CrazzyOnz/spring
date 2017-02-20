package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cisco.spring.demo.api.MediaPlayer;
import com.cisco.spring.demo.config.AppConfig;

public class CDPlayerTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// Basic
		MediaPlayer player = (MediaPlayer)context.getBean("cdPlayer");
		player.play();

	}
}
