package com.lechos22.pizzeria.remote.rest.dto.response;

import com.lechos22.pizzeria.remote.rest.dto.response.PizzaDto;

import java.util.List;

public class MenuDto
{
    private List<PizzaDto> pizzas;

    public MenuDto()
    {

    }

    public MenuDto(List<PizzaDto> pizzas)
    {
        this.pizzas = pizzas;
    }

    public List<PizzaDto> getPizzas()
    {
        return pizzas;
    }

    public void setPizzas(List<PizzaDto> pizzas)
    {
        this.pizzas = pizzas;
    }
}
