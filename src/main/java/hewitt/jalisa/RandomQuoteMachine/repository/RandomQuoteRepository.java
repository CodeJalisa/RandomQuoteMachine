package hewitt.jalisa.RandomQuoteMachine.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Jalisa on 8/29/18.
 */

@Repository
public class RandomQuoteRepository {

    public String getQuote(){

        return "Is minimalism right for me?";
    }
}
