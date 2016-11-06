using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace interview
{
    class findLoneInteger
    {
        /*
         [4, 4, 4, 1, 5, 4]
         [0000 0100, 0000 0101, 0000 0001, 0000 0101, 0000 0100]
         Scan eight bits at a time.
         
         
         */

        public int getLoneInteger(List<int> list)
        {
            int buffer = 0;
            //int firstOcurrence
            // (4 ^ 4) ^ 4
            for (int i = 0; i < list.Count; i++)
            {
                buffer ^= list[i];
            }

            return buffer;
        }
    }
}
