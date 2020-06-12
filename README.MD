# Introduction
The system is designed to stimulate a travel broker and market place.  Any service providers (airline, accommodation) can self-register their service to a market place as agent reacting to planning request by customer and offering deals to travellers. Travellers doesn’t need to browse on different providers to search for options suit their needs, the MAMS broker can coordinate different provider’s agents to satisfy their plan all in one single place.
# Travel-Broker
Travel-Broker represents a market-place for service operators and planner to make a deal. The Travel-Broker will match Providers with Planner to provide tour deal to customer
# Planner
Planner represents a travel agency. It would have a list of chosenFlightProviders and chosenAccommodationProviders. A customer can use the travel agency site to look for a tour. The Planner just simply forward the tour request to the market place and retrieve the quote and pass back to customer 

When plan is submitted to Planner, Planner intiate a "provider_request" to all providers, to fill in the plan
Planner will accept only preferred Provider's bid based on its preferences
Planner will get the 1 lowest bid on Accomodation and 1 lowest bid on flight on the same date

# Provider
Provider represents flight operators, hotels. They register their services onto the Travel-Broker's market place. 
