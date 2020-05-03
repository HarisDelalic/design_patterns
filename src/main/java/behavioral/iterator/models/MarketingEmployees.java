package main.java.behavioral.iterator.models;

import java.util.*;

public class MarketingEmployees implements Iterable {
    private List<String> marketingEmployees = new ArrayList<>(Arrays.asList("Mark Director","Mark Commercial", "Mark Designer"));

    @Override
    public Iterator getIterator() {
        return new MarketingEmployeesIterator();
    }

    private class MarketingEmployeesIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < marketingEmployees.size();
        }

        @Override
        public String next() {
            if (hasNext()) {
                return marketingEmployees.get(index++);
            }
            return null;
        }
    }
}
