
/**
 * Repräsentiert eine Stadt, der Flughäfen zugeordnet werden können.
 * Jede Stadt in diesem System _muss_ mindestens einen Flughafen zugeordnet haben,
 * und kann maximal fünf Flughäfen zugeordnet bekommen.
 *
 * @author Henri Bußmann [198315]
 * @version 1.0.0 (2018-03-19)
 */
public class Stadt {
    public final String name;

    private final Flughafen flughafens[] = new Flughafen[5];
    private int numFlughafens;

    /**
     * Konstruktor
     *
     * @param name            Name der Stadt
     * @param ersterFlughafen erster Flughafen, der dieser Stadt zugeordnet werden soll
     */
    public Stadt(String name, Flughafen ersterFlughafen) {
        this.name = name;
        addFlughafen(ersterFlughafen);
        System.out.println(String.format("Stadt '%s' mit erstem Flughafen '%s' erstellt!", name, ersterFlughafen.toString()));
    }

    /**
     * Konstruktor
     *
     * @param name Name der Stadt
     */
    public Stadt(String name) {
        this.name = name;
        System.out.println(String.format("Stadt '%s' erstellt!", name));
    }

    /**
     * Ordnet einen Flughafen dieser Stadt zu.
     * Neue Flughäfen werden immer an's Ende der Liste gestellt.
     *
     * @param f Flughafen, der dieser Stadt zugeordnet werden soll
     * @return Die neue Anzahl an Flughäfen, die dieser Stadt zugeordnet sind
     * @throws UnsupportedOperationException wenn die Höchstanzahl an Flughäfen für diese Stadt erreicht ist
     * @throws UnsupportedOperationException wenn der gegebene Flughafen dieser Stadt bereits zugeordnet ist
     */
    public int addFlughafen(Flughafen f) throws UnsupportedOperationException {
        if (f == null)
            throw new IllegalArgumentException("Argument kann nicht 'null' sein");
        if (numFlughafens >= flughafens.length)
            throw new UnsupportedOperationException("Eine Stadt kann von nur 5 Flughäfen zugleich bedient werden!");
        if (findFlughafen(f) != -1)
            throw new UnsupportedOperationException("Der angegebene Flughafen ist dieser Stadt bereits zugeordnet.");

        flughafens[numFlughafens++] = f;

        System.out.println(String.format("Stadt '%s' hat als %dten Flughafen '%s' bekommen.", name, numFlughafens, f.toString()));

        return numFlughafens;
    }

    /**
     * Entfernt einen Flughafen von dieser Stadt, falls dieser Stadt zugeordnet ist.
     *
     * @param f Flughafen, der entfernt werden soll
     * @return 'true' bei Erfolg, 'false' falls der gegebene Flughafen dieser Stadt nicht zugeordnet ist.
     */
    public boolean removeFlughafen(Flughafen f) {
        // search for it
        int index = findFlughafen(f);
        if (index != -1) {
            removeFlughafen(index);
            return true;
        }
        return false;
    }

    /**
     * Entfernt einen Flughafen von dieser Stadt, dessen Position bereits bekannt ist.
     * Die Reihenfolge der Flughäfen ist die, in der sie hinzugefügt wurden.
     *
     * @param index Position des Flughafens, der entfernt werden soll
     * @throws UnsupportedOperationException Wenn die Stadt bereits von nur einem Flughafen bedient wird
     */
    public void removeFlughafen(int index) throws UnsupportedOperationException {
        if (index >= numFlughafens)
            throw new IndexOutOfBoundsException("Kann Flughafen #" + index + " nicht entfernen, es gibt nur " + numFlughafens);
        if (numFlughafens == 1)
            throw new UnsupportedOperationException("Der einzige Flughafen einer Stadt kann nicht entfernt werden!");

        // delete it
        System.out.println(String.format("Stadt '%s' wird ab sofort nicht mehr von Flughafen '%s' bedient", name, flughafens[index].toString()));
        flughafens[index] = null;

        // move the remaining down
        System.arraycopy(flughafens, index + 1, flughafens, index, numFlughafens - 1 - index);
        numFlughafens--;
        flughafens[numFlughafens] = null;
    }

    /**
     * Gibt die Anzahl an Flughäfen zurück, die dieser Stadt zugeordnet sind.
     *
     * @return Anzahl an Flughäfen für diese Stadt
     */
    public int getNumFlughafens() {
        return numFlughafens;
    }


    //XXX  'Flughafen' muss `equals' und und `hashCode' überschreiben, damit auch die
    //XXX   exakte Kopie eines Flughafens als identisch mit seinem Original erkannt wird!
    //      (ansonsten werden nur Referenzen verglichen - was aber auch das gewünschte Verhalten sein kann)
    private int findFlughafen(Flughafen f) {
        for (int i = 0; i < numFlughafens; i++) {
            if (flughafens[i] == f || flughafens[i].equals(f)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public String toString() {
        return String.format("Stadt '%s' (bedient von %d Flugh%sfen)", this.name, this.numFlughafens, this.numFlughafens == 1 ? "a" : "ä");
    }

}
