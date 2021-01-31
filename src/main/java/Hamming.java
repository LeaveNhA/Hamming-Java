class Hamming {
    protected String leftStrand_ = "";
    protected String rightStrand_ = "";

    Hamming(String leftStrand, String rightStrand) {
        if( leftStrand.length() != rightStrand.length() )
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        leftStrand_ = leftStrand;
        rightStrand_ = rightStrand;
    }

    boolean isStrandsEmpty(){
        return leftStrand_.isEmpty() || rightStrand_.isEmpty();
    }

    int getHammingDistance() {
        if(this.isStrandsEmpty())
            return 0;

        int totalCount = 0;

        for(int i = 0; i < leftStrand_.length(); i++)
            {
                char l = leftStrand_.charAt(i);
                char r = rightStrand_.charAt(i);

                if( l != r )
                    totalCount++;
            }

        return totalCount;
    }
}
