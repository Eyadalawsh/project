public class ArraysOpration {
    private int[] array;
    private int numberOfElements;

    public ArraysOpration() {
        this.array = new int[5];
        this.numberOfElements = 0;
    }

    public int[] getArray() {
        return array;

    }

    public boolean isFull() {
        return !(this.numberOfElements < this.array.length);
    }
    public boolean isEmpty() {
        return this.numberOfElements == 0;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public boolean add(int element) {
        if( this.isFull() )
            return false;

        this.array[this.numberOfElements] = element;
        this.numberOfElements++;
        return true;
    }

    public boolean addSortedElement(int element) {
        if( this.isFull() ) return false;

        int i = this.numberOfElements;
        while ( i > 0 && element < this.array[i-1] ) {
            this.array[i] = this.array[i-1];
            i--;
        }
        this.array[i] = element;
        this.numberOfElements++;

        return true;
    }

    public boolean deleteLastElement() {
        if(this.isEmpty()) return false;

        this.array[ this.numberOfElements - 1 ] = Integer.MIN_VALUE;
        this.numberOfElements--;
        return true;
    }

    public boolean deleteSortedElement(int index) {
        if(!this.isFull() && !(index >= 0)) return false;

        int i = index;
        while( i < this.numberOfElements ) {
            this.array[i] = this.array[i + 1];
            i++;
        }
        this.array[i] = Integer.MIN_VALUE;
        return true;
    }

    public int indexOf(int element) {
        if(this.isEmpty()) return -1;

        int index = -1;
        boolean found = false;

        int i = 0;
        while ( i < this.numberOfElements && !found ) {
            if (this.array[i] == element) {
                found = true;
                index = i;
            }
            i++;
        }
        return index;
    }



}