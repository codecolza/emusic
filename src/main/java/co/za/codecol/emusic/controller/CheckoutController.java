package co.za.codecol.emusic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckoutController {

    @RequestMapping(name = "/checkout/start")
    public String startCheckout(){
        return "checkout/checkout1";
    }
}

