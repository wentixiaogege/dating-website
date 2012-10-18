package user_components;
/**
 * @author jeffreymeyerson
 * 
 *         The VisitorExperiment. This class contains the main method. This
 *         experiment tests the results of a data set being put through a system
 *         modeling a dating website. The data set initializes a User set and
 *         defines their UndisclosedPreference set. The User set has been
 *         generated by a Python program which does the following: 1) Define a
 *         Trait set of single-value Traits. The same Trait will have different
 *         values across the population. 2) For each User, for each Trait
 *         defined in the previous step, declare that Trait to have the value of
 *         a random double between 0 and 10. 3) For each User, define an
 *         UndisclosedPreferences which is derived from ordered pairs of Traits
 *         from the set created in 1). This Trait pair is converted to a single
 *         trait through the TraitConvertible interface, and now belongs to the
 *         User's Trait set wihin a User's UndisclosedPreferences. 4) For each
 *         User, define that user's profile by assigning a random value to each
 *         Trait required by profile definition; this Trait set defines a User.
 *         5) For each User, initialize that User's list of predicted sought
 *         traits with three things: a) a random Trait t from among that User's
 *         Preference set, b) the value of the Trait belonging to the numerator
 *         in t, and c) the value in the trait belonging to the denominator in
 *         t.
 * 
 *         The goal of the system is to provide relevant suggestions to each
 *         user correlative to that user's UndisclosedPreferences set while
 *         knowing as few of that user's UndisclosedPreferences explicitly as
 *         possible. In terms of a user's UndisclosedPreferences, the system
 *         creates an OptimalMatch vector for each user based on these
 *         Assumptions. It then uses vector similarity to figure out how closely
 *         each other user is to the OptimalMatch, before presenting a set of
 *         Users as a Suggestion.
 * 
 *         At each line, do the following: the line consists of a number n
 *         followed by n user name pairs. Within each user pair, the first user
 *         visits the profile of the second user. This implies a level of
 *         interest, which will be taken into account when processOccurredData()
 *         is run and a round of Suggestions are made by the system.
 * 
 *         A user profile consists of several Traits that define them. Each user
 *         has defined all of his/her traits as a double ranging from 0 to 10.
 * 
 *         After a number of lines equal to
 *         LINES_PROCESSED_BEFORE_PERFORMING_CALCULATION_FROM_CURRENT_ROUND_OF_SEEDING
 *         is processed, PERCENTAGE_CALCULATED_BY_INTRINSIC_DATA decreases by
 *         PERCENTAGE_CALCULATION_DELTA, and
 *         PERCENTAGE_CALCULATED_BY_MACHINE_INFERENCE increases by
 *         PERCENTAGE_CALCULATION_DELTA.
 * 
 * 
 * 
 */
public class VisitorExperiment {

	/**
	 * As time proceeds, the machine is given more room to infer based on its
	 * predictions. After each round of Suggestions processing,
	 * INITIAL_PERCENTAGE_CALCULATED_BY_EXPLICIT_DATA decreases by PERCENTAGE_DELTA and
	 * PERCENTAGE_CALCULATED_BY_MACHINE_INFERENCE increases by PERCENTAGE_DELTA.
	 */
	final static int INITIAL_PERCENTAGE_CALCULATED_BY_EXPLICIT_DATA = 100;
	final static int INITIAL_PERCENTAGE_CALCULATED_BY_MACHINE_INFERENCE = 0;
	final static int PERCENTAGE_DELTA = 1;

	/**
	 * Defines how many iterations will be performed once the machine has been
	 * fully seeded.
	 */
	final int NUMBER_OF_ITERATIONS_TO_PERFORM_WITH_FULL_MACHINE_INFERENCE = 1000;

	/**
	 * At the beginning of each iteration in main
	 */
	final int NUMBER_OF_SUGGESTIONS_TO_PRESENT_TO_USER = 3;

	public static void main(String[] args) {
		
		// Create dynamic instances of the final ints declared above
		int percentIntrinsic = INITIAL_PERCENTAGE_CALCULATED_BY_EXPLICIT_DATA;
		int percentMachine = INITIAL_PERCENTAGE_CALCULATED_BY_MACHINE_INFERENCE;
		
		// Process input files, define Users
		
		while(percentMachine < 100){
			
		}

	}

}
