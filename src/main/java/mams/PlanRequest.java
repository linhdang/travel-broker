package mams;
import java.util.Date;

import cartago.OPERATION;
import mams.utils.Identifier;

/**
 * A planning session with User
 * User express interest on flights from Date - to Date in a location, and accomodation type (1 bed, 2 bed, full appartment)
 */
public class PlanRequest {

    @Identifier
    public String name;

    // Destination for toursim
    public String departure;
    // Location when the flight start
    public String arrival;
    // Flight and accomodation start Date in epoch format
    public Long from;
     // Flight and accomodation end Date in epoch format
    public Long to;
    // accomodationtype ONE_BED, TWO_BED, FULL_HOUSE, should be an enum but we can optimize later
    public String accomodationType;
    
    // planner id that the plan want to request available plan from
    public String plannerId;
}