//package no.systema.altinn.integration;
//
//import static org.junit.Assert.assertEquals;
//
//import java.net.URI;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import no.systema.altinn.entities.ServiceCode;
//import no.systema.altinn.entities.ServiceEdition;
//import no.systema.altinn.entities.ServiceOwner;
//import no.systema.altinn.integration.ActionsUriBuilder;
//
//public class TestJActionsUribuilder {
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@Test
//	public final void testProfile() {
//		String host = "host";
//		int orgnr = 12345678;
//		URI uri = ActionsUriBuilder.profile(host, orgnr);
//		assertEquals(uri.getHost(), host);
//		assertEquals(uri.getPath(), "/api/12345678/profile");
//	}
//
//
//	@Test
//	public final void testMessagesFromSamlesider() {
//		String host = "host";
//		String orgnr = "12345678";
//		URI uri = ActionsUriBuilder.messages(host, orgnr, ServiceOwner.Samlesider);
//		assertEquals(uri.getHost(), host);
//		assertEquals(uri.toString(), "https://host/api/12345678/messages?$filter=ServiceOwner%20eq%20'Samlesider'");
//	}	
//
//	@Test
//	public final void testMessagesWithServiceOwner_ServiceCode_ServiceEdition() {
//		String host = "host";
//		String orgnr = "12345678";
//		URI uri = ActionsUriBuilder.messages(host, orgnr, ServiceOwner.Skatteetaten, ServiceCode.Dagsobjor, ServiceEdition.Dagsobjor);
//
//		assertEquals(uri.getHost(), host);
//		
//		assertEquals(uri.toString(), "https://host/api/12345678/messages?$filter=ServiceOwner%20eq%20'Skatteetaten'%20and%20ServiceCode%20eq%20'5012'%20and%20ServiceEdition%20eq%20171208");
//		
//	}	
//
//
//	@Test
//	public final void testAuthentication() {
//		String host = "host";
//		String path = "/api/authentication/authenticatewithpassword";  //copy from application.properties
//		URI uri =ActionsUriBuilder.authentication(host, path);
//		assertEquals(uri.getHost(), host);
//		assertEquals(uri.toString(), "https://host/api/authentication/authenticatewithpassword?ForceEIAuthentication");
//	}		
//	
//	
//	
//	
//}
