package main.java.behavioral.iterator.models;

public class SaleEmployees implements Iterable {
    private String[] saleEmployees = {"Sale Authority", "Sale Guy", "Sale Organiser"};

    @Override
    public Iterator getIterator() {
        return new SaleEmployeesIterator();
    }

    private class SaleEmployeesIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return index < saleEmployees.length;
        }

        @Override
        public String next() {
            if (hasNext()) {
                return saleEmployees[index++];
            }
            return null;
        }
    }
}
