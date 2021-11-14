package taskModul11;

import java.util.*;

public class City {
    private final String streetName;
    private final int numberOfHouse;
    private final int numberOfApartment;

    public City(String streetName, int numberOfHouse, int numberOfApartment) {
        if (streetName == null || numberOfHouse < 0 || numberOfApartment < 0)
            throw new IllegalArgumentException();
        this.streetName = streetName;
        this.numberOfHouse = numberOfHouse;
        this.numberOfApartment = numberOfApartment;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public int getNumberOfApartment() {
        return numberOfApartment;
    }

    @Override
    public String toString() {
        return "City{" +
                "streetName='" + streetName + '\'' +
                ", numberOfHouse=" + numberOfHouse +
                ", numberOfApartment=" + numberOfApartment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return numberOfHouse == city.numberOfHouse && numberOfApartment == city.numberOfApartment && streetName.equals(city.streetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetName, numberOfHouse, numberOfApartment);
    }

    public static void createCityList() {
        String[] cityStreetsArray = {"Savvinskaya", "Lugovaya", "Glavnaya", "Lenina", "Lesnaya"};
        List<City> cityMapByLines = new ArrayList<>();

        for (int s = 0; s < cityStreetsArray.length; s++) {
            for (int d = 1; d <= 25; d++) { // Если задаю значение количества домов больше 25, вывод в консоль неполный.
                for (int ap = 1; ap <= 120; ap++) {
                    cityMapByLines.add(new City(cityStreetsArray[s], d, ap));
                }
            }

        }

        Set<City> cityList = new TreeSet<>(new SortCity());
        cityList.addAll(cityMapByLines);
        for (City city : cityMapByLines) {
            System.out.println(city);                                // Пытался сделать этот метод возвратным и передавать TreeSet<City> в Main, но почему-то выводит в консоль только улицу по 0 индексу, с номером дома, квартиры все нормально. Но выводил только список по одной из 5 улиц.
        }

    }
/** Метод с генерацией количества домов и квартир в них, сделал как вариацию.**/
    public static void createNewCityList() {
        String[] cityStreetsArray = {"Savvinskaya", "Lugovaya", "Glavnaya", "Lenina", "Lesnaya"};
        List<City> cityMapByLines = new ArrayList<>();
        for (int i = 0; i < 150; i++) {
            int street = (int) (Math.random() * 4);
            int house = (int) (Math.random() * 25);
            int flat = (int) (Math.random() * 120);
            cityMapByLines.add(new City(cityStreetsArray[street], house, flat)); // Если передаем все в переменку метод compare() по названию улицы не сортирует почему-то!
        }
        for (City city: cityMapByLines) {
            System.out.println(city);
        }
        Set<City> citySet = new TreeSet<>(new SortCity());
        citySet.addAll(cityMapByLines);
        for (City city : citySet) {
          System.out.println(city);
       }



        }



    }
