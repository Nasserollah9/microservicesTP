package ma.emsi.elyamami.billingservices.Feign;

import ma.emsi.elyamami.customerservice.entities.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.web.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "customer-service")
public interface CustomerRestClient {
    @GetMapping("/api/customers/{id}")
    Customer getCustomerById(@PathVariable Long id); // verifier est ce que customer exist

    @GetMapping("/api/customers")
    PagedModel<Customer> getAllCustomers();

}
