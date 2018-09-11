package demo.spring.webflux.tradingservice.controller;

import demo.spring.webflux.tradingservice.repository.TradingUserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final TradingUserRepository tradingUserRepository;

    public HomeController(TradingUserRepository tradingUserRepository) {
        this.tradingUserRepository = tradingUserRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("users", this.tradingUserRepository.findAll());
        return "index";
    }
}
