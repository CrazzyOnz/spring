package com.cisco.spring.demo.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.cisco.spring.demo.api.MediaPlayer;
import com.cisco.spring.demo.biz.cd.BlankDisc;
import com.cisco.spring.demo.biz.cd.ColoredBankDisc;
import com.cisco.spring.demo.biz.cd.MagicDisc;
import com.cisco.spring.demo.biz.cd.MagicExistsCondition;
import com.cisco.spring.demo.biz.concert.Drama;
import com.cisco.spring.demo.biz.concert.Film;
import com.cisco.spring.demo.biz.player.CDPlayer;
import com.cisco.spring.demo.utils.Audience;

@Configuration
//@ComponentScan(basePackageClasses = { Drama.class })
@PropertySource("classpath:/com/cisco/spring/demo/biz/cd/cd.properties")
@EnableAspectJAutoProxy
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean(name = "cdPlayer")
	@Profile("test")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public MediaPlayer getBlankCdPlayer() {

		BlankDisc blankCd = new BlankDisc("abc", "Abhi");
		MediaPlayer cdPlayer = new CDPlayer();
		cdPlayer.setCd(blankCd);
		return cdPlayer;

	}

	@Bean(name = "cdPlayer")
	@Profile("dev")
	public MediaPlayer getColorBlankCd() {

		ColoredBankDisc coloredDisc = new ColoredBankDisc("abc", "Abhi", "yellow");
		MediaPlayer cdPlayer = new CDPlayer();
		cdPlayer.setCd(coloredDisc);
		return cdPlayer;
	}

	@Bean
	@Conditional(MagicExistsCondition.class)
	@Profile("dev")
	public MagicDisc getMagicCD() {
		return new MagicDisc();
	}

	@Bean
	@Profile("dev")
	public Drama drama() {
		return new Drama();
	} 
	
	@Bean
	@Profile("dev")
	@Electronic
	public Film film() {
		return new Film();
	} 
	
	@Bean
	@Profile("dev")
	public Audience audience(){
		return new Audience();
	}

}
