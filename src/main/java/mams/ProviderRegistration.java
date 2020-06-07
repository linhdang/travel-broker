package mams;
import mams.utils.Identifier;

// A generic provider, can provide either provide FLIGHT or ACCOMODATIon
public class ProviderRegistration {
    // FLIGHT or ACCOMODATION
    public String type;
    @Identifier
    public String name;
}