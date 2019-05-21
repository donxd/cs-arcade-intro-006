int makeArrayConsecutive2(int[] statues) {
    Arrays.sort( statues );
    int limitPosition = statues.length-1;
    int insertions = 0;
    
    int valuePosition;
    for ( int i = 0; i < limitPosition; ){
        valuePosition = statues[ i ];
        valuePosition++;
        if ( valuePosition != statues[ ++i ] ){
            insertions += statues[ i ] - valuePosition;
        }
    }
    
    
    System.out.println( "makeArrayConsecutive2(statues) = " + insertions );
    
    return insertions;
}
