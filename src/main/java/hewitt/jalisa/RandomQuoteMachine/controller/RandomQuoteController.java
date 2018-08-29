package hewitt.jalisa.RandomQuoteMachine.controller;

import hewitt.jalisa.RandomQuoteMachine.service.RandomQuoteService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jalisa on 8/29/18.
 */

@RestController
public class RandomQuoteController {


    private static final Logger logger = LogManager.getLogger(RandomQuoteController.class);

    @Autowired
    RandomQuoteService service;

    @RequestMapping(path="/getQuote", method = RequestMethod.GET)
    public String getQuote() {
        logger.info("service hit");
        return service.getQuote();

    }
}
