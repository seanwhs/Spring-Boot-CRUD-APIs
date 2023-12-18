package learn.springboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("{customerId}")
    public Optional<Object> getCustomerById(@PathVariable("customerId") Integer id) {
    Optional<Customer> optionalCustomer = customerRepository.findById(id);

    return optionalCustomer.map(customer -> ResponseEntity.ok().body(customer));
    }


    @PostMapping
    public void addCustomer(@RequestBody Customer request) {
        customerRepository.save(request);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id) {
        customerRepository.deleteById(id);
    }

    @PutMapping("{customerId}")
    public String updateCustomer(
            @PathVariable("customerId") Integer id,
            @RequestBody Customer request) {

        Optional<Customer> optionalCustomer = customerRepository.findById(id);

        if (optionalCustomer.isPresent()) {
            Customer existingCustomer = optionalCustomer.get();
            existingCustomer.setName(request.getName());
            existingCustomer.setEmail(request.getEmail());
            existingCustomer.setAge(request.getAge());
            customerRepository.save(existingCustomer);

            return "Customer updated successfully";
        } else {
            return "Customer with ID: " + id + " not found";
        }
    }

}
