package mams;

import java.util.HashMap;
import java.util.Map;

import cartago.LINK;
import cartago.OPERATION;
import mams.utils.Identifier;
public class CustomerPlan {
    @Identifier
    public String name;
    public String departure;
    public String arrival;
    public long from;
    public long to;
    public String accomodationType;
    public Map<String, Long> proposedFlights = new HashMap<String,Long>(); 
    public Map<String, Long> proposedAccomodation = new HashMap<String,Long>(); 
    
    @LINK
    public void putProposedFlight(String provider, Long price) {
        proposedFlights.put(provider, price);
    }

    @LINK
    public void putProposedAccomodation(String provider, Long price) {
        proposedFlights.put(provider, price);
    }

}