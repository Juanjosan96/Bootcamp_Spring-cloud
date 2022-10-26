package ntt.data.bootcamp.springcloud;

import lombok.extern.log4j.Log4j2;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Mono;

public interface FiltroGlobal {
@Bean
@Order(-1)
@Log4j2
public GlobalFilter a() {
    return(exchange, chain)->{
        log.info("first pre filter");
        return chain.filter(exchange).then(Mono.fromRunnable(()->{
            log.info("third post filter");
        }));
    };
}
}
}
