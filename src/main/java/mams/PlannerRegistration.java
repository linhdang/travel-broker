package mams;
import java.util.List;

import mams.utils.Identifier;

public class PlannerRegistration {
    // list of flight providers, the planner prefers to get quote from
    public List<String> chosenFlightProviders;

    // list of accommodation providers, the planner prefers to get quote from
    public List<String> chosenAccommodationProviders;

    @Identifier
    public String name;
}