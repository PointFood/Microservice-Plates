package com.example.model;


import com.example.entity.Dish;
import com.example.entity.DishExtra;
import lombok.Data;

import java.util.List;


@Data

public class OrderDetail{

    private Long id;
    private Long order;
    private Dish dish;
    private List<DishExtra> extras;
    private double subTotal;
}

