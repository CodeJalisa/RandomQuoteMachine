package hewitt.jalisa.RandomQuoteMachine.service;

import hewitt.jalisa.RandomQuoteMachine.repository.RandomQuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jalisa on 8/29/18.
 */

@Service

public class RandomQuoteService {

    @Autowired
    RandomQuoteRepository repo;

    public String getQuote(){
        return repo.getQuote();
    }
}
