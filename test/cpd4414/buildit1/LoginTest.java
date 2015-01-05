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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testBlankPasswordShouldReturnErrorMessage() {
        String username = "bob";
        String password = "";
        Login instance = new Login();
        String expResult = "ERROR: Invalid Password";
        String result = instance.doLogin(username, password);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBlankUsernameShouldReturnErrorMessage() {
        String username = "";
        String password = "bob";
        Login instance = new Login();
        String expResult = "ERROR: Invalid Username";
        String result = instance.doLogin(username, password);
        assertEquals(expResult, result);
    }
    
}
