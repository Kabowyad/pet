package net.yan.pet.clients.restaurant;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("restaurantservice")
public interface RestaurantFeignClient {

    @RequestMapping(method = RequestMethod.GET,
            value = "/v1/test/{testId}",
            consumes = "application/json")
    String getTest(@PathVariable("testId") String testId);
}
