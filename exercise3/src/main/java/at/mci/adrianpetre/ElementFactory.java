package at.mci.adrianpetre;

/**
 * ElementFactory class responsible for creating Element instances with validation.
 */
public class ElementFactory {
    /**
     * Creates an Element with the given name, symbol, and atomic number after validating them.
     *
     * @param name         the name of the element (e.g., "Hydrogen")
     * @param symbol       the symbol of the element (e.g., "H")
     * @param atomicNumber the atomic number of the element (e.g., 1)
     * @return a new Element instance
     * @throws IllegalArgumentException if any of the inputs are invalid
     */
    public static Element createElement(String name, String symbol, int atomicNumber) {
        // Validate atomic number
        if (atomicNumber < 1 || atomicNumber > 118) {
            throw new IllegalArgumentException("Atomic number must be between 1 and 118");
        }

        // Validate name (non-null, non-empty, starts with uppercase followed by lowercase letters)
        if (name == null || name.isEmpty() || !name.matches("^[A-Z][a-z]*$")) {
            throw new IllegalArgumentException("Name must start with an uppercase letter followed by lowercase letters");
        }

        // Validate symbol (1 or 2 letters, first uppercase, second lowercase if present)
        if (symbol == null || !symbol.matches("^[A-Z][a-z]?$")) {
            throw new IllegalArgumentException("Symbol must be one or two letters with the first letter uppercase");
        }

        // If all validations pass, create and return the new Element
        return new Element(name, symbol, atomicNumber);
    }
}

