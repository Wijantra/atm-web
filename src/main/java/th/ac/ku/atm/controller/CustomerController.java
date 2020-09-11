package th.ac.ku.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CustomerController {

    private List<Customer> customers = new ArrayList<>();

    @GetMapping("/customer")
    public String getCustomerPage(Model model){


        model.addAttribute("allCustomers", customers);

        return "customer";
    }
    @PostMapping("/customer")
    public String registerRegister(@ModelAttribute Customer customer, Model model) {
        customers.add(customer);
        model.addAttribute("allCustomers", customers);
        return "redirect:customer";
    }

}
