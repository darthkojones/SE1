package at.mci.adrianpetre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * PeriodicTable class that holds all the elements.
 * Implemented as a Singleton to ensure only one instance exists.
 */
public final class PeriodicTable {
    private static final PeriodicTable INSTANCE = new PeriodicTable();

    private final List<Element> elements = new ArrayList<>();

    private PeriodicTable() {
    }

    public static PeriodicTable getInstance() {
        return INSTANCE;
    }

    public void addElement(Element element) {
        if (element != null && !elements.contains(element)) {
            elements.add(element);
        }
    }

    public void addElements(Element[] elementsArray) {
        for (Element element : elementsArray) {
            addElement(element);
        }
    }

    public List<Element> getElements() {
        return Collections.unmodifiableList(elements);
    }

    public Element getElementByAtomicNumber(int atomicNumber) {
        for (Element element : elements) {
            if (element.getAtomicNumber() == atomicNumber) {
                return element;
            }
        }
        return null;
    }
}
