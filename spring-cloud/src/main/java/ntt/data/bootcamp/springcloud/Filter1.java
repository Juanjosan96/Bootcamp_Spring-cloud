package ntt.data.bootcamp.springcloud;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Mono;

@Log4j2
@Configuration
public class Filter1 implements FiltroGlobal {
    @Bean
    @Order(-1)
    public GlobalFilter a(){
        return(exchange, chain)->{
            log.info("first pre filter");
            return chain.filter(exchange).then(Mono.fromRunnable(()->{
                log.info("third post filter");
            }));
        };
    }
}