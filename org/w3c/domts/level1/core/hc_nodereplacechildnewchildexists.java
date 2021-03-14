
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:


Copyright (c) 2001-2003 World Wide Web Consortium,
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University). All
Rights Reserved. This program is distributed under the W3C's Software
Intellectual Property License. This program is distributed in the
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.
See W3C License http://www.w3.org/Consortium/Legal/ for more details.

*/

package org.w3c.domts.level1.core;

import org.w3c.dom.*;


import org.w3c.domts.DOMTestCase;
import org.w3c.domts.DOMTestDocumentBuilderFactory;



/**
 *     If the "newChild" is already in the tree, it is first
 *     removed before the new one is added.
 *    
 *     Retrieve the second "p" and replace "acronym" with its "em".
* @author Curt Arnold
* @see <a href="http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-785887307">http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-785887307</a>
* @see <a href="http://www.w3.org/Bugs/Public/show_bug.cgi?id=246">http://www.w3.org/Bugs/Public/show_bug.cgi?id=246</a>
*/
public final class hc_nodereplacechildnewchildexists extends DOMTestCase {

   /**
    * Constructor.
    * @param factory document factory, may not be null
    * @throws org.w3c.domts.DOMTestIncompatibleException Thrown if test is not compatible with parser configuration
    */
   public hc_nodereplacechildnewchildexists(final DOMTestDocumentBuilderFactory factory)  throws org.w3c.domts.DOMTestIncompatibleException {
      super(factory);

    //
    //   check if loaded documents are supported for content type
    //
    String contentType = getContentType();
    preload(contentType, "hc_staff", true);
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
   public void runTest() throws Throwable {
      Document doc;
      NodeList elementList;
      Node employeeNode;
      NodeList childList;
      Node oldChild = null;

      Node newChild = null;

      Node child;
      String childName;
      Node childNode;
      java.util.List actual = new java.util.ArrayList();
      
      java.util.List expected = new java.util.ArrayList();
      expected.add("strong");
      expected.add("code");
      expected.add("sup");
      expected.add("var");
      expected.add("em");
      
      Node replacedChild;
      int nodeType;
      doc = (Document) load("hc_staff", true);
      elementList = doc.getElementsByTagName("p");
      employeeNode = elementList.item(1);
      childList = ((Element) /*Node */employeeNode).getElementsByTagName("*");
      newChild = childList.item(0);
      oldChild = childList.item(5);
      replacedChild = employeeNode.replaceChild(newChild, oldChild);
      assertSame("return_value_same", oldChild, replacedChild);
for (int indexN10094 = 0; indexN10094 < childList.getLength(); indexN10094++) {
          childNode = (Node) childList.item(indexN10094);
    childName = childNode.getNodeName();
      nodeType = (int) childNode.getNodeType();
      
      if (equals(1, nodeType)) {
          actual.add(childName);
      } else {
          assertEquals("textNodeType", 3, nodeType);
      assertEquals("textNodeName", "#text", childName);
      }
        
      }
      assertEqualsAutoCase("element", "childNames", expected, actual);
        }
   /**
    *  Gets URI that identifies the test.
    *  @return uri identifier of test
    */
   public String getTargetURI() {
      return "http://www.w3.org/2001/DOM-Test-Suite/level1/core/hc_nodereplacechildnewchildexists";
   }
   /**
    * Runs this test from the command line.
    * @param args command line arguments
    */
   public static void main(final String[] args) {
        DOMTestCase.doMain(hc_nodereplacechildnewchildexists.class, args);
   }
}

