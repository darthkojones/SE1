package at.mci.adrianpetre;


/**
 * Element class that represents an element with attributes like name, symbol, and atomic number
 * the class is final because we don't want to extend it
 * 
 */
public final class Element {
    //attributes
    private final String name;
    private final String symbol;
    private final int atomicNumber;

    /*
     * constructor 
     * will throw an exception if the name is null or empty
     * will throw an exception if the symbol is null or empty
     * will throw an exception if the atomic number is not between 1 and 118
     */
    public Element(String name, String symbol, int atomicNumber) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        } else if (symbol == null || symbol.isEmpty()){
            throw new IllegalArgumentException("Symbol cannot be null or empty");
        } else if (atomicNumber < 1 || atomicNumber > 118){
            throw new IllegalArgumentException("Atomic number must be between 1 and 118");
        } else {
            this.name = name;
            this.symbol = symbol;
            this.atomicNumber = atomicNumber;
        }
    }

    /*
     * we'll only use getters since the attributes are final
     */
    //getter for name
    public String getName() {
        return name;
    }

    //getter for symbol
    public String getSymbol() {
        return symbol;
    }

    //getter for atomicNumber
    public int getAtomicNumber() {
        return atomicNumber;
    }

    @Override
    public String toString(){
        return String.format ("Element: %s, Symbol: %s, Atomic Number: %d", name, symbol, atomicNumber);
    }

    @Override
    public boolean equals(Object obj) {  

        // Check if the object is the same
        if (this == obj) return true;
        // Check if obj is null or not the same class
        if (obj == null || getClass() != obj.getClass()) return false;

        Element element = (Element) obj;

        // Compare fields
        if (atomicNumber != element.atomicNumber) return false;
        if (!name.equals(element.name)) return false;
        return symbol.equals(element.symbol);
    }

    /*
     * hashCode method
     * initializes of the result variable
     * multiplies of the result variable with a prime number - 67
     * adds the hash code of the name to the result
     * adds the hash code of the symbol to the result
     * adds the atomic number to the result
     * returns the result
     * 
     */
    @Override
    public int hashCode(){
        int result = name.hashCode();
        result = 67 * result + symbol.hashCode();
        result = 67 * result + atomicNumber;
        return result;
    }

}
