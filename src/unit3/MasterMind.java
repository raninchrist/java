package unit3;

public class MasterMind {
    private char[] cha;
    private int numGuess;
    final static String[] wordPool = {"JESUS", "WORLD", "BOBBY", "ADAMS","EMILY"};
    
    public MasterMind () {
        int i = (int) (Math.random() * wordPool.length);
        String word = wordPool[i];
        cha = new char[word.length()];
        for (int j = 0; j < word.length(); j++) {
            cha[j] = word.charAt(j);
        }
        numGuess = 0;
    }
    /*
     * int exactMatch(String guess)
     * returns the number of exact matches
     * 
     */
    public int exactMatch(String guess) {
        return 0;
    }
    /*
     * int anyMatch(String guess)
     * returns the number of any matches
     * 
     */
    public int anyMatch(String guess) {
        return 0;
    }

}

