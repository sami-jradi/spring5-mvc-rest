package guru.springfamework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Value;

import javax.persistence.Entity;

@Data
public class VendorDTO {

    private String name;

    @JsonProperty("vendor_url")
    private String vendorUrl;


}
