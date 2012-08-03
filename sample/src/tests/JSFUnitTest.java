//package tests;
//
//import java.io.IOException;
//import javax.faces.component.UIComponent;
//import junit.framework.Test;
//import junit.framework.TestSuite;
//import org.jboss.jsfunit.jsfsession.JSFServerSession;
//import org.jboss.jsfunit.jsfsession.JSFSession;
//
//public class JSFUnitTest extends org.apache.cactus.ServletTestCase
//{
//   public static Test suite()
//   {
//      return new TestSuite( JSFUnitTest.class );
//   }
//
//   public void testInitialPage() throws IOException
//   {
//      // Send an HTTP request for the initial page
//      JSFSession jsfSession = new JSFSession("/index.xhtml");
//
//      // A JSFServerSession gives you access to JSF state
//      JSFServerSession server = jsfSession.getJSFServerSession();
//
//      // Test navigation to initial viewID
//      assertEquals("/index.xhtml", server.getCurrentViewID());
//
//      // Assert that the prompt component is in the
//      //component tree and rendered
//      UIComponent prompt = server.findComponent("userId");
//      assertTrue(prompt.isRendered());
//
//      // Test a managed bean
//      assertEquals("Rafael Nadal",
//         server.getManagedBeanValue("#{userBean.firstName}"));
//   }
//}
