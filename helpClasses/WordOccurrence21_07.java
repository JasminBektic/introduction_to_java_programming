package helpClasses;

public class WordOccurrence21_07 implements Comparable<WordOccurrence21_07> {
	String word;
	int count;
	 
    public WordOccurrence21_07(String word, int count) {
        this.word = word;
        this.count = count;
    }
    
    @Override
    public String toString() {
    	return word + "\t" + count;
    }
	
	@Override
	public int compareTo(WordOccurrence21_07 o) {
        if (o.count > count)
            return -1;
        else if (o.count < count)
            return 1;
        else
            return 0;
	}
}