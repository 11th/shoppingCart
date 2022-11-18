package com.eleventh.shoppingcart.controllers;

import com.eleventh.shoppingcart.services.ShoppingCartService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
public class ShoppingCartController {
    private ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/order/get")
    public Collection<Integer> get(){
        return shoppingCartService.get();
    }

    @PostMapping("/order/add")
    public List<Integer> add(@RequestParam List<Integer> id){
        return shoppingCartService.add(id);
    }
}
