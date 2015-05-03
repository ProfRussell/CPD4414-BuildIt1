/*
 * Copyright 2015 Len Payne <len.payne@lambtoncollege.ca>.
 * Updated 2015 Mark Russell <mark.russell@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cpd4414.buildit1;

import java.util.Scanner;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class CPD4414BuildIt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a Word:");
        String str = kb.next();
        System.out.println(scrambler(str));
    }

    /**
     * Takes a string and reverses the order of the odd-indexed characters.
     *
     * @param str - the input string
     * @return - the scrambled string
     */
    public static String scrambler(String str) {
        // Convert the String to an Array
        char[] chars = str.toCharArray();

        // Set the cursor to the last odd-numbered index 
        //    (eg- 4->4/2*2-1->2*2-1->4-1->3, 5->5/2*2-1->2*2-2->4-1->3)
        int backwardCursor = (chars.length / 2) * 2 - 1;

        // Iterate Through with Two Counters
        for (int forwardCursor = 1; forwardCursor < chars.length / 2; forwardCursor += 2) {
            // Swap
            char tmp = chars[forwardCursor];
            chars[forwardCursor] = chars[backwardCursor];
            chars[backwardCursor] = tmp;

            // Update the Second Counter
            backwardCursor -= 2;
        }

        // Convert the Characters Back to a String
        return String.valueOf(chars);
    }

}
