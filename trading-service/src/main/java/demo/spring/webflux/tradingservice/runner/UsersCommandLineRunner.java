package demo.spring.webflux.tradingservice.runner;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import demo.spring.webflux.tradingservice.model.TradingUser;
import demo.spring.webflux.tradingservice.repository.TradingUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UsersCommandLineRunner implements CommandLineRunner {
    private final TradingUserRepository repository;

    public UsersCommandLineRunner(TradingUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        List<TradingUser> users = Arrays.asList(
                new TradingUser("gayanb", "Gayan Belpamulle"),
                new TradingUser("nayomik", "Nayomi Katugaha"),
                new TradingUser("rstoyanchev", "Rossen Stoyanchev"),
                new TradingUser("poutsma", "Arjen Poutsma"),
                new TradingUser("smaldini", "Stephane Maldini"),
                new TradingUser("simonbasle", "Simon Basle"),
                new TradingUser("violetagg", "Violeta Georgieva"),
                new TradingUser("bclozel", "Brian Clozel")
        );
        this.repository.insert(users).blockLast(Duration.ofSeconds(3));
    }
}