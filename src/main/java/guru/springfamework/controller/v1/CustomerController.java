package guru.springfamework.controller.v1;

import guru.springfamework.api.v1.model.CustomerDTO;
import guru.springfamework.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("customers")
    public ResponseEntity<List<CustomerDTO>> getAllCuistomers() {

        return new ResponseEntity<List<CustomerDTO>>(
                customerService.getAllCustomers(), HttpStatus.OK);
    }

    @GetMapping("customers/{id}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable Long id) {

        return new ResponseEntity<CustomerDTO>(
                customerService.getCustomerById(id), HttpStatus.OK);
    }
}
