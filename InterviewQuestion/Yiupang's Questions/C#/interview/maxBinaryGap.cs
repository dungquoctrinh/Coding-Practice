using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace interview
{
    class maxBinaryGap
    {
        public int getLongestGap(int number)
        {
            int currentLongest = 0;
            int counter = 0;

            while (number > 0)
            {
                if ((number & 1) == 0)
                    counter++;
                else
                {
                    currentLongest = counter > currentLongest ? counter : currentLongest;
                    counter = 0;
                }
                number >>= 1;
            }

            return currentLongest;
        }
        
    }
}
