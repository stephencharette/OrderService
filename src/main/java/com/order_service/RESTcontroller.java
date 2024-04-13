package com.order_service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.order_service.OrderRepository;

@Controller
public class RESTcontroller {
	private final OrderRepository orderRepository;

	public RESTcontroller(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@GetMapping("/get_orders")
	@ResponseBody
	public List<Order> getOrders() {
		List<Order> orders = orderRepository.findAll();
		return orders;
	}
}
