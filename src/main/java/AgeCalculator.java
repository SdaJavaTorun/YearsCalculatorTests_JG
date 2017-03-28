import java.util.Date;

/**
 * Created by RENT on 2017-03-26.
 */


public class AgeCalculator {

    private static final int INDEX_OF_YEAR = 0;
    private static final int INDEX_OF_MONTH = 1;
    private static final int INDEX_OF_DAY = 2;
    private static final String DATE_SEPARATOR = "-";

    /**
     * Method calculating age in a given date
     * Throws NumberFormatException when bornDate or givenDate are not well formatted
     * @param bornDate - date of birth in the following format : "YYYY-MM-DD"
     * @param givenDate - given in the following format: "YYYY-MM-DD",
                          requires a givenDate to be later than a bornDate
     * @return age of person in the given date
     */
    public static int calculateAge(String bornDate, String givenDate){
        String[] bornDateArray = bornDate.split(DATE_SEPARATOR);
        String[] givenDateArray = givenDate.split(DATE_SEPARATOR);

        int yearOfBorn = extractString(bornDateArray[INDEX_OF_YEAR]);
        int yearOfGivenDate = extractString(givenDateArray[INDEX_OF_YEAR]);

        int monthOfBorn = extractString(bornDateArray[INDEX_OF_MONTH]);
        int monthOfGivenDate = extractString(givenDateArray[INDEX_OF_MONTH]);

        int dayOfBorn = extractString(bornDateArray[INDEX_OF_DAY]);
        int dayOfGivenDate = extractString(givenDateArray[INDEX_OF_DAY]);
        int age = yearOfGivenDate - yearOfBorn;

        if (monthOfBorn > monthOfGivenDate ||(monthOfBorn == monthOfGivenDate && dayOfBorn > dayOfGivenDate)){
            age--;
        }

        if (age < 0) {
            throw new IllegalArgumentException("Given Date should be later than a day of birth");
        }
        return age;
    }

    private static int extractString(String number){
        try{
            return Integer.parseInt(number);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("Wrong date format");
        }
    }
}
