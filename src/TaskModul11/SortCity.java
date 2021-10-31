package TaskModul11;

import java.util.Comparator;
import java.util.Objects;

public class SortCity implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        if (o1.getStreetName().length()==o2.getStreetName().length()){
            if (o1.getNumberOfHouse()==o2.getNumberOfHouse()){
                return o1.getNumberOfApartment()- o2.getNumberOfApartment();
            }else{
                return o1.getNumberOfHouse()- o2.getNumberOfHouse();
            }
        }else {
            if (o1.getNumberOfHouse()==o2.getNumberOfHouse()){
                return o1.getNumberOfApartment()- o2.getNumberOfApartment();
            }else{
                return o1.getNumberOfHouse()- o2.getNumberOfHouse();
            }
        }

    }
}
