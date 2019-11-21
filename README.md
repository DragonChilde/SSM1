[SSM](http://120.77.237.175:9080/photos/ssm1/)

# pom.xml #

	<?xml version="1.0" encoding="UTF-8"?>
	<project xmlns="http://maven.apache.org/POM/4.0.0"
	         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	    <modelVersion>4.0.0</modelVersion>
	
	    <groupId>com.ssm</groupId>
	    <artifactId>SSM</artifactId>
	    <version>1.0-SNAPSHOT</version>
	
	
	    <properties>
	        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
	
	        <!-- spring版本号 -->
	        <spring.version>4.3.25.RELEASE</spring.version>
	
	        <!-- mybatis版本号 -->
	        <mybatis.version>3.4.6</mybatis.version>
	
	        <!-- log4j日志包版本号 -->
	        <!--<slf4j.version>1.7.25</slf4j.version>-->
	        <log4j.version>1.2.17</log4j.version>
	
	    </properties>
	
	    <dependencies>
	        <!-- 添加spring核心依赖 -->
	        <dependency>
	            <groupId>org.springframework</groupId>
	            <artifactId>spring-core</artifactId>
	            <version>${spring.version}</version>
	        </dependency>
	        <dependency>
	            <groupId>org.springframework</groupId>
	            <artifactId>spring-web</artifactId>
	            <version>${spring.version}</version>
	        </dependency>
	        <dependency>
	            <groupId>org.springframework</groupId>
	            <artifactId>spring-orm</artifactId>
	            <version>${spring.version}</version>
	        </dependency>
	        <dependency>
	            <groupId>org.springframework</groupId>
	            <artifactId>spring-tx</artifactId>
	            <version>${spring.version}</version>
	        </dependency>
	        <dependency>
	            <groupId>org.springframework</groupId>
	            <artifactId>spring-jdbc</artifactId>
	            <version>${spring.version}</version>
	        </dependency>
	        <dependency>
	            <groupId>org.springframework</groupId>
	            <artifactId>spring-webmvc</artifactId>
	            <version>${spring.version}</version>
	        </dependency>
	        <dependency>
	            <groupId>org.springframework</groupId>
	            <artifactId>spring-context</artifactId>
	            <version>${spring.version}</version>
	        </dependency>
	        <dependency>
	            <groupId>org.springframework</groupId>
	            <artifactId>spring-context-support</artifactId>
	            <version>${spring.version}</version>
	        </dependency>
	        <dependency>
	            <groupId>org.springframework</groupId>
	            <artifactId>spring-aop</artifactId>
	            <version>${spring.version}</version>
	        </dependency>
	        <dependency>
	            <groupId>org.springframework</groupId>
	            <artifactId>spring-test</artifactId>
	            <version>${spring.version}</version>
	        </dependency>
	        <dependency>
	            <groupId>org.springframework</groupId>
	            <artifactId>spring-aspects</artifactId>
	            <version>${spring.version}</version>
	        </dependency>
	
	        <dependency>
	            <groupId>net.sourceforge.cglib</groupId>
	            <artifactId>com.springsource.net.sf.cglib</artifactId>
	            <version>2.2.0</version>
	        </dependency>
	
	        <dependency>
	            <groupId>org.aopalliance</groupId>
	            <artifactId>com.springsource.org.aopalliance</artifactId>
	            <version>1.0.0</version>
	        </dependency>
	        <dependency>
	            <groupId>org.aspectj</groupId>
	            <artifactId>com.springsource.org.aspectj.weaver</artifactId>
	            <version>1.7.2.RELEASE</version>
	        </dependency>
	
	        <!-- 添加mybatis依赖 -->
	        <dependency>
	            <groupId>org.mybatis</groupId>
	            <artifactId>mybatis</artifactId>
	            <version>${mybatis.version}</version>
	        </dependency>
	        <!-- 添加mybatis/spring整合包依赖 -->
	        <dependency>
	            <groupId>org.mybatis</groupId>
	            <artifactId>mybatis-spring</artifactId>
	            <version>1.3.2</version>
	        </dependency>
	
	        <!-- 添加日志相关jar包 -->
	        <!--日志-->
	        <dependency>
	            <groupId>log4j</groupId>
	            <artifactId>log4j</artifactId>
	            <version>${log4j.version}</version>
	        </dependency>
	<!--        <dependency>
	            <groupId>org.slf4j</groupId>
	            <artifactId>slf4j-api</artifactId>
	            <version>${slf4j.version}</version>
	        </dependency>
	        <dependency>
	            <groupId>org.slf4j</groupId>
	            <artifactId>slf4j-log4j12</artifactId>
	            <version>${slf4j.version}</version>
	        </dependency>-->
	
	        <dependency>
	            <groupId>commons-logging</groupId>
	            <artifactId>commons-logging</artifactId>
	            <version>1.2</version>
	        </dependency>
	
	
	        <!-- 数据库驱动 -->
	        <dependency>
	            <groupId>mysql</groupId>
	            <artifactId>mysql-connector-java</artifactId>
	            <version>5.1.37</version>
	        </dependency>
	
	        <!-- junit -->
	        <dependency>
	            <groupId>junit</groupId>
	            <artifactId>junit</artifactId>
	            <version>4.12</version>
	            <scope>test</scope>
	        </dependency>
	
	        <dependency>
	            <groupId>javax.annotation</groupId>
	            <artifactId>javax.annotation-api</artifactId>
	            <version>1.3.2</version>
	        </dependency>
	
	
	        <dependency>
	            <groupId>com.mchange</groupId>
	            <artifactId>c3p0</artifactId>
	            <version>0.9.5.4</version>
	        </dependency>
	
	        <!--替换之前JSTL用的两个JAR包,如果用的不爽的话可以换回来-->
	        <!--导入jstl，解决jsp页面使用jstl标签无效<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>-->
	        <dependency>
	            <groupId>org.apache.taglibs</groupId>
	            <artifactId>taglibs-standard-impl</artifactId>
	            <version>1.2.5</version>
	        </dependency>
	        <dependency>
	            <groupId>org.apache.taglibs</groupId>
	            <artifactId>taglibs-standard-spec</artifactId>
	            <version>1.2.5</version>
	        </dependency>
	
	
	    </dependencies>
	
	    <build>
	        <plugins>
	            <!-- 设置编译版本为1.8 -->
	            <plugin>
	                <groupId>org.apache.maven.plugins</groupId>
	                <artifactId>maven-compiler-plugin</artifactId>
	                <configuration>
	                    <source>1.8</source>
	                    <target>1.8</target>
	                    <encoding>UTF-8</encoding>
	                </configuration>
	            </plugin>
	        </plugins>
	
	    </build>
	</project>

# web.xml #

	<?xml version="1.0" encoding="UTF-8"?>
	<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
	         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
	         version="4.0">
	
	    <!-- 初始化SpringIOC容器的监听器 -->
	    <context-param>
	        <param-name>contextConfigLocation</param-name>
	        <param-value>classpath:spring.xml</param-value>
	    </context-param>
	    <listener>
	        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	    </listener>
	
	    <!-- 字符编码过滤器 -->
	    <filter>
	        <filter-name>CharacterEncodingFilter</filter-name>
	        <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
	        <init-param>
	            <param-name>encoding</param-name>
	            <param-value>UTF-8</param-value>
	        </init-param>
	    </filter>
	    <filter-mapping>
	        <filter-name>CharacterEncodingFilter</filter-name>
	        <url-pattern>/*</url-pattern>
	    </filter-mapping>
	
	    <!--REST过滤器-->
	    <filter>
	        <filter-name>hiddenHttpMethodFilter</filter-name>
	        <filter-class>org.springframework.web.filter.HiddenHttpMethodFilter</filter-class>
	    </filter>
	    <filter-mapping>
	        <filter-name>hiddenHttpMethodFilter</filter-name>
	        <url-pattern>/*</url-pattern>
	    </filter-mapping>
	
	    <!--DispatcherServlet-->
	    <servlet>
	        <servlet-name>springDispatcherServlet</servlet-name>
	        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	        <init-param>
	            <param-name>contextConfigLocation</param-name>
	            <param-value>classpath:springmvc.xml</param-value>
	        </init-param>
	        <load-on-startup>1</load-on-startup>
	    </servlet>
	    <servlet-mapping>
	        <servlet-name>springDispatcherServlet</servlet-name>
	        <url-pattern>/</url-pattern>
	    </servlet-mapping>
	</web-app>

# mybatis-config.xml #

**settings配置必须要在mybatis里配置**

	<?xml version="1.0" encoding="UTF-8" ?>
	<!DOCTYPE configuration
	        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
	        "http://mybatis.org/dtd/mybatis-3-config.dtd">
	<!--配置-->
	<configuration>
	    <!-- settings:  包含了很多重要的设置项 -->
	    <settings>
	        <!-- 映射下划线到驼峰命名 ,默认是关闭的-->
	        <setting name="mapUnderscoreToCamelCase" value="true"/>
	        <!-- 开启延迟加载 -->
	        <setting name="lazyLoadingEnabled" value="true"/>
	        <!-- 配置按需加载-->
	        <setting name="aggressiveLazyLoading" value="false"/>
	    </settings>
	</configuration>

# sprimg.xml #

	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
	       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	       xmlns:context="http://www.springframework.org/schema/context" xmlns:tx="http://www.springframework.org/schema/tx"
	       xmlns:aop="http://www.springframework.org/schema/aop"
	       xmlns:mybatis-spring="http://mybatis.org/schema/mybatis-spring"
	       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.0.xsd http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd http://www.springframework.org/schema/aop https://www.springframework.org/schema/aop/spring-aop.xsd http://mybatis.org/schema/mybatis-spring http://mybatis.org/schema/mybatis-spring.xsd">
	
	   <!--指定properties属性文件的位置-->
	    <context:property-placeholder location="classpath:db.properties"/>
	
	    <!--组件扫描,排除扫描Controller-->
	    <context:component-scan base-package="com.ssm" use-default-filters="true">
	         <context:exclude-filter type="annotation" expression="org.springframework.stereotype.Controller"/>
	     </context:component-scan>
	
	    <!--数据源-->
	    <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
	        <property name="driverClass"  value="${jdbc.driver}"/>
	        <property name="jdbcUrl" value="${jdbc.url}"/>
	        <property name="user" value="${jdbc.username}"/>
	        <property name="password" value="${jdbc.password}"/>
	    </bean>
	
	    <!--事务-->
	    <bean id="dataSourceTransactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
	        <property name="dataSource" ref="dataSource"/>
	    </bean>
	
	    <!--基于注解使用事务-->
	    <tx:annotation-driven transaction-manager="dataSourceTransactionManager"/>
	
	    <!--Spring和Mybatis整合-->
	    <!--1.SqlSession对象的创建管理等-->
	    <bean  class="org.mybatis.spring.SqlSessionFactoryBean">
	        <!--数据源-->
	        <property name="dataSource" ref="dataSource"/>
	        <!--Mybatis的全局配置文件-->
	        <property name="configLocation" value="classpath:mybatis-config.xml"/>
	        <!--Mybatis的SQL映射文件,现在可以随意指定加载目录-->
	        <property name="mapperLocations" value="classpath:mybatis/mapper/*.xml"/>
	        <!--别名处理-->
	        <property name="typeAliasesPackage" value="com.ssm.beans"/>
	    </bean>
	
	    <!--2.Mapper接口代理实现类对象的创建管理等
	            MapperScannerConfigurer会为指定包下的Mapper接口生成代理实现类对象并管理到IOC容器中
	        EmployeeMapper  ==>代理实现 ==>对象 对象在IOC容器中的id:employeeMapper
	    -->
	    <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
	        <property name="basePackage" value="com.ssm.mapper"/>
	    </bean>
	
	    <!--同上面的把Mapper注入到容中的原理效果一样-->
	    <!--<mybatis-spring:scan base-package="com.ssm.mapper"/>-->
	</beans>


# springmvc.xml #

	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
	       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	       xmlns:mvc="http://www.springframework.org/schema/mvc"
	       xmlns:context="http://www.springframework.org/schema/context"
	       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.0.xsd http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc-4.0.xsd">
	
	    <!--  组件扫描,指定扫描@Controller -->
	    <context:component-scan base-package="com.ssm" use-default-filters="false">
	        <context:include-filter type="annotation" expression="org.springframework.stereotype.Controller"/>
	    </context:component-scan>
	
	    <!--  视图解析器
			 工作机制:  prefix + 请求处理方法的返回值 + suffix  =  物理视图路径.
			 		 /WEB-INF/views/success.jsp
	
			WEB-INF: 是服务器内部路径。 不能直接从浏览器端访问该路径下的资源. 但是可以内部转发进行访问
		-->
	    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	        <property name="prefix" value="/WEB-INF/views/"/>
	        <property name="suffix" value=".jsp"/>
	    </bean>
	
	    <!--MVC-->
	    <mvc:annotation-driven/>
	    <mvc:default-servlet-handler/>
	</beans>

# log4j.xml #

	<?xml version="1.0" encoding="UTF-8" ?>
	<!DOCTYPE log4j:configuration SYSTEM "http://logging.apache.org/log4j/1.2/apidocs/org/apache/log4j/xml/doc-files/log4j.dtd">
	<log4j:configuration debug="true">
	    <appender name="STDOUT" class="org.apache.log4j.ConsoleAppender">
	        <param name="Encoding" value="UTF-8" />
	        <layout class="org.apache.log4j.PatternLayout">
	            <param name="ConversionPattern" value="%-5p %d{MM-dd HH:mm:ss,SSS} %m  (%F:%L) \n" />
	        </layout>
	    </appender>
	    <logger name="java.sql">
	        <level value="debug" />
	    </logger>
	    <logger name="org.apache.ibatis">
	        <level value="info" />
	    </logger>
	    <root>
	        <level value="debug" />
	        <appender-ref ref="STDOUT" />
	    </root>
	</log4j:configuration>

# db.properties #

	jdbc.driver=com.mysql.jdbc.Driver
	jdbc.url=jdbc:mysql://120.77.237.175:9306/mybatis?serverTimezone=GMT&useSSL=false&characterEncoding=utf-8
	jdbc.username=xxxxx
	jdbc.password=xxxxxx

