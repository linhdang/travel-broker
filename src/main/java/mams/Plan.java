package mams;
import java.util.Date;

import mams.utils.Identifier;

/**
 * A planning session with User
 * User express interest on flights from Date - to Date in a location, and accomodation type (1 bed, 2 bed, full appartment)
 */
public class Plan {

    @Identifier
    public String name;

    // Destination for toursim
    public String destination;
    // Location when the flight start
    public String location;
    // Flight and accomodation start Date, assume both are the same
    public Date from;
     // Flight and accomodation start Date, assume both are the same
    public Date to;
    // accomodationtype ONE_BED, TWO_BED, FULL_HOUSE, should be an enum but we can optimize later
    public String accomodationType;
    
}