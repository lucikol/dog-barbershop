package cz.muni.fi.pa165.rest.controllers;

import cz.muni.fi.pa165.rest.ApiUris;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Martin Kuchar 433499
 */

@RestController
public class MainController {

    final static Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public final Map<String, String> getResources() {
        Map<String,String> resourcesMap = new HashMap<>();

        resourcesMap.put("customers_uri", ApiUris.ROOT_URI_CUSTOMERS);
        resourcesMap.put("employees_uri", ApiUris.ROOT_URI_EMPLOYEES);
        resourcesMap.put("dogs_uri", ApiUris.ROOT_URI_DOGS);
        resourcesMap.put("services_uri", ApiUris.ROOT_URI_SERVICES);

        return Collections.unmodifiableMap(resourcesMap);

    }
}
