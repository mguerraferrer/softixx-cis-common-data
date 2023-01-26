package mx.softixx.cis.common.data.address;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class BaseAddress {
	private String state;
	private String town;
    private String colony;
    private String street;
    private String btwStreet;
    private String outsideNumber;
    private String insideNumber;
    private String reference;
    private String postalCode;
    private String lat;
    private String lon;
}