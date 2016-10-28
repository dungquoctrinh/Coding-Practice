using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace interview
{
    class longestSubstringNoRep
    {
        private bool isRepeatedChar(char checkingChar, ref int[] ASCIITable)
        {
            if (ASCIITable[checkingChar] >= 2)
                    return true;
            return false;
        }

        private void getCurrentlongestSubstring(int startIndex, int endIndex, string str, ref int currentLongestLength, ref string longest)
        {
            if (currentLongestLength < endIndex - startIndex)
            {
                currentLongestLength = endIndex - startIndex;
                longest = str.Substring(startIndex, currentLongestLength);
            }
        }

        public string getLongestSubstringNoRep(string str)
        {
            int[] ASCIITable = new int[256];
            string longest = null;
            int currentLongestLength = 0;
            int startIndex = 0;

            for (int i = 0; i < str.Length; i++)
            {
                ASCIITable[str[i]]++;
                if (isRepeatedChar(str[i], ref ASCIITable))
                {
                    getCurrentlongestSubstring(startIndex, i, str, ref currentLongestLength, ref longest);
                    startIndex = i;
                    ASCIITable = new int[256];
                    ASCIITable[str[i]]++;
                }
                else if (i == str.Length - 1 && !isRepeatedChar(str[i], ref ASCIITable))
                {
                    getCurrentlongestSubstring(startIndex, i + 1, str, ref currentLongestLength, ref longest);
                }
            }

            return longest; 
        }
    }
}
