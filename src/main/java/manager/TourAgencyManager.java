package manager;

import model.Family;
import model.Tour;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TourAgencyManager {


    private List<Tour> tours;

    private Comparator<Tour> comparatorByName = new ComparatorByName();
    private Comparator<Tour> comparatorByPrice = new CompareByPrice();

    public List<Tour> getTours() {
        return tours;
    }

    public TourAgencyManager() {
        tours = new ArrayList<Tour>();
    }

    public void setTours() {
        this.tours = new ArrayList<Tour>();
    }

    public void add(Tour tour) {
        this.tours.add(tour);
    }

    public void remove(Tour tour) {
        this.tours.remove(tour);
    }

    public void sortByName() {
        tours.sort(comparatorByName);
    }

    public void sortByPrice() {
        tours.sort(comparatorByPrice);

    }

    @Override
    public String toString() {
        String s = "";
        for (Tour t : tours)

             s+=t.toString()+"\n";


        return s;
    }

    public void show() {
        for (Tour t : tours) {
            System.out.println(t);

        }
    }

    public List<Tour> findFamilyTour() {
        List<Tour> result = new ArrayList<Tour>();
        for (Tour t:tours) {
            if(t instanceof Family)
                result.add(t);
        }
        return result;
    }


}
