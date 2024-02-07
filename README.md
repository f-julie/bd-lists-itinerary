### Context

Typically, when we take a multi-city trip we need a travel itinerary. In
this activity we will implement an `Itinerary` class that will enable us
to perform useful operations like adding or removing a destination. The
`Destination` class, which has been provided to you, contains
information on the location and days that will be spent in the given
location.

### Task

You will be implementing 6 methods in the `Itinerary` class:

- `addDestination(Destination destination)`
- `getDestination(int position)`
- `removeDestination(int position)`
- `getListOfLocations()`
- `getTotalNumberOfDays()`
- `getNumberOfDestinations()`

The `Itinerary` class is located in the `com.amazon.ata.lists`
package. Follow the existing Javadoc in the class and implement the
methods based on the behavior specified by the Javadoc.

Hint: You will probably need to introduce a member variable storing the
locations.

#### Testing

The tests for the `Itinerary` class have been added to the
`com.amazon.ata.lists.ItineraryTest` class. As you implement the
methods of the `Itinerary` class you should verify that the tests change
from failing to passing before moving on to the next method
implementation.

You can run the tests in IntelliJ by clicking the play button left of
`public class ItineraryTest` near the top of the file or by clicking the
play button left of the individual method to test. If you prefer to run
tests in your terminal, use the command `./gradlew -q clean :test`

**You have completed this pre-work when:**
* You have implemented the 6 methods in class `Itinerary`
* All tests in class `ItineraryTest` are passing
