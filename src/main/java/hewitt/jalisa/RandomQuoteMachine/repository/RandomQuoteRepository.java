package hewitt.jalisa.RandomQuoteMachine.repository;

import hewitt.jalisa.RandomQuoteMachine.dto.QuoteDTO;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Jalisa on 8/29/18.
 */

@Repository
public class RandomQuoteRepository {

    public String getQuote(){
        final String url = "http://quotesondesign.com/wp-json/posts?filter[orderby]=rand&filter[posts_per_page]=1";
        RestTemplate restTemplate = new RestTemplate();
        QuoteDTO[] result = restTemplate.getForObject(url, QuoteDTO[].class);
        return result[0].getContent();
    }
}
