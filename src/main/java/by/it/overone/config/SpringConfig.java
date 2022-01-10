package by.it.overone.config;

import by.it.overone.dao.UserDAOImpl;
import by.it.overone.dao.UserDao;
import by.it.overone.services.UserService;
import by.it.overone.services.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }
@Bean
    public DataSource getDataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setUrl("jdbc:mysql://localhost:3306/Onlineshop?useSll=false");
    dataSource.setUsername("root");
    dataSource.setPassword("111111");
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    return dataSource;
    }
    @Bean
    public UserDao getUserDao(){
        return new UserDAOImpl(getJdbcTemplate());
    }
    @Bean
    public UserService getUserService(){
        return new UserServiceImpl();

    }
}
