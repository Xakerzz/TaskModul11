package TaskModul11;

import java.util.Comparator;


public class SortCity implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        if (o1.getStreetName().equals(o2.getStreetName())){
            if (o1.getNumberOfHouse()==o2.getNumberOfHouse()){
                return o1.getNumberOfApartment()- o2.getNumberOfApartment();
            }else{
                return o1.getNumberOfHouse()- o2.getNumberOfHouse();
            }
        }else {
            if (o1.getNumberOfHouse()==o2.getNumberOfHouse()){
                return o1.getNumberOfApartment()- o2.getNumberOfApartment();
            }else{
                return o1.getNumberOfHouse()- o2.getNumberOfHouse(); //Тут я сделал сортировку, но неуверен, что она работает правильно. В первом методе где я по очереди добавляю, все хорошо. Во втором, где все генерируется кроме улиц, по улице не сортирует!
            }
        }

    }
}
