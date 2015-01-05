/*
 * Copyright 2015 Len Payne <len.payne@lambtoncollege.ca>.
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

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class CPD4414BuildIt1Test {
    
    public CPD4414BuildIt1Test() {
    }

    /**
     * Test of scrambler method, of class CPD4414BuildIt1.
     */
    @Test
    public void testScrambler() {
        System.out.println("scrambler");
        String str = "Hello!";
        String expResult = "H!lloe";
        String result = CPD4414BuildIt1.scrambler(str);
        assertEquals(expResult, result);
    }
    
}
