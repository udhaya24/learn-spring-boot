
package in.cloudvalley.api.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for Beer
 * <p>
 * The root of the Beer type's schema.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "country",
    "rating",
    "status",
    "type"
})
public class Beer {

    /**
     * name of the beer
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("name of the beer")
    private String name;
    /**
     * origin country of beer
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("origin country of beer")
    private String country;
    /**
     * rating for the beer
     * 
     */
    @JsonProperty("rating")
    @JsonPropertyDescription("rating for the beer")
    private Double rating;
    /**
     * Stock status
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Stock status")
    private String status;
    /**
     * type of beer
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("type of beer")
    private String type;

    /**
     * name of the beer
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * name of the beer
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * origin country of beer
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * origin country of beer
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * rating for the beer
     * 
     */
    @JsonProperty("rating")
    public Double getRating() {
        return rating;
    }

    /**
     * rating for the beer
     * 
     */
    @JsonProperty("rating")
    public void setRating(Double rating) {
        this.rating = rating;
    }

    /**
     * Stock status
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Stock status
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * type of beer
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * type of beer
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

}
