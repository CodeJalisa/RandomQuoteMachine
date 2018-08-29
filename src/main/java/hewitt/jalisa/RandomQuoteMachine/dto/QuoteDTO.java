package hewitt.jalisa.RandomQuoteMachine.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Created by Jalisa on 8/29/18.
 */

@JsonIgnoreProperties
@Data
public class QuoteDTO {

    public String id;

    public String title;

    public String content;
}
