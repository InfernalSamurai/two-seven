class TwoSevenCount
{
    String countAndGet()
    {
        StringBuilder result = new StringBuilder();
        for( int i = 1; i <= 100; i++ )
        {
            if( i % 2 != 0 && i % 7 != 0 )
            {
                result.append( i );
            }
            else
            {
                if( i % 2 == 0 )
                {
                    result.append( "Two" );
                }
                if( i % 7 == 0 )
                {
                    result.append( "Seven" );
                }
            }

            result.append( System.lineSeparator() );
        }

        return result.toString()
                     .trim();
    }
}
