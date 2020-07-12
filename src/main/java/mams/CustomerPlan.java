package mams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mams.utils.Identifier;
public class CustomerPlan {
    @Identifier
    public String name;
    public String departure;
    public String arrival;
    public long from;
    public long to;
    public List<Map<String, Object>> proposedFlights; 
    public List<Map<String, Object>> proposedAccomodations; 
}