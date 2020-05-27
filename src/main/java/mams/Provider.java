package mams;
import java.util.Date;

import mams.utils.Identifier;

// A generic provider, can provide either provide FLIGHT or ACCOMODATIon
public class Provider {
    // FLIGHT or ACCOMODATION
    public String type;
    public Date from;
    public Date to;
    public String destination;
    public String fromLocation;
    public int capacity;
    public String accomodationType;

    @Identifier
    public String name;
    
}