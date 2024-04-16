package src.main.java.RoundHoleAdapter.adapters;

import src.main.java.RoundHoleAdapter.round.RoundPeg;
import src.main.java.RoundHoleAdapter.square.SquarePeg;

/**
 * Adapter allows fitting RoundHoleAdapter.square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}