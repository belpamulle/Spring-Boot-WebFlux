package demo.spring.webflux.tradingservice.repository;

import demo.spring.webflux.tradingservice.model.TradingUser;
import reactor.core.publisher.Mono;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TradingUserRepository extends ReactiveMongoRepository<TradingUser, String> {
    Mono<TradingUser> findByUserName(String userName);
}