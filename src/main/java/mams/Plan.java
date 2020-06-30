package mams;
import java.util.Date;

import mams.utils.Identifier;

// A generic provider, can provide either provide FLIGHT or ACCOMODATIon

// a flight provider will use the following fields
// (type=FLIGHT, from:Date, departure:String, arrival:String, price: Double, capcaity:int) 
// an accomodation will use following fields
// (type=ACCOMMODATION, from:Date, to:Date, arrival:String, price: Double, capacity:int) 
public class Plan {
    // FLIGHT or ACCOMMODATION
    public String type;
    public Date from;
    public Date to;
    public String departure;
    public String arrival;
    public int capacity;
    public long price;
    public String accomodationType;

    @Identifier
    public String name;
    
}