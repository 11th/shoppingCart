package com.eleventh.shoppingcart.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
@SessionScope
public class ShoppingCartService {
    private final List<Integer> products = new ArrayList<>();

    public Collection<Integer> get(){
        return products;
    }

    public List<Integer> add(List<Integer> id){
        products.addAll(id);
        return id;
    }
}
