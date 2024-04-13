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

@Controller
public class RESTcontroller {
	public RESTcontroller() {
	}

	public class Order {
		private Long id;

		public Order(Long id) {
			this.id = id;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@GetMapping("/get_orders")
	@ResponseBody
	public List<Order> getOrders() {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(1L));
		orders.add(new Order(2L));
		return orders;
	}
}
