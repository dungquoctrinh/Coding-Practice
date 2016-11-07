using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace interview
{
    class main
    {
        static void Main(string[] args)
        {
            Console.ReadLine();
        }
    }

    [TestClass]
    public class unitTest
    {
        
        [TestMethod]
        public void test_getLongestSubstringNoRep()
        {
            longestSubstringNoRep lsr = new longestSubstringNoRep();
            Assert.AreEqual(lsr.getLongestSubstringNoRep("abca"), "abc");
            Assert.AreEqual(lsr.getLongestSubstringNoRep("abcapkoe"), "apkoe");
            Assert.AreEqual(lsr.getLongestSubstringNoRep("addbcapkoe"), "dbcapkoe");
            Assert.AreEqual(lsr.getLongestSubstringNoRep("bcapkoe"), "bcapkoe");
            Assert.AreEqual(lsr.getLongestSubstringNoRep("aaaaaabbbbbbdf"), "bdf");
        }

        [TestMethod]
        public void test_getLongestGap()
        {
            maxBinaryGap mbg = new maxBinaryGap();
            Assert.AreEqual(mbg.getLongestGap(9), 2);
            Assert.AreEqual(mbg.getLongestGap(34), 3);
            Assert.AreEqual(mbg.getLongestGap(3135135), 2);
        }

        [TestMethod]
        public void test_getLoneInteger()
        {
            findLoneInteger fli = new findLoneInteger();
            Assert.AreEqual(fli.getLoneInteger(new List<int> { 4, 5, 1, 5, 4 }), 1);
           // Assert.AreEqual(fli.getLoneInteger((new List<int> { 4, 5, 1, 5, 4 }));
           // Assert.AreEqual(fli.getLoneInteger((new List<int> { 4, 5, 1, 5, 4 }));
        }
    }
}
