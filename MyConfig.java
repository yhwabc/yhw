package cn.yanghuiwu.c20;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration   //告诉系统我是一个配置类
public class MyConfig {
	@Bean //加入容器
	@ConfigurationProperties("spring.datasource")//自动到application.yml中取值
	public DataSource druid(){
		return new DruidDataSource();//写一个获取DRUID数据连接池对象的方法
	}
	
}
