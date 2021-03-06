package org.twiliofaces.test;

import junit.framework.Assert;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.resteasy.client.ClientResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.twiliofaces.test.common.AbstractTwimlClientTest;

@RunWith(Arquillian.class)
@RunAsClient
public class AllTwimlTest extends AbstractTwimlClientTest {

	@Test
	public void testClient() throws Exception {
		setJsfPage("client.jsf");
		setTwimlFile("client.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testConference() throws Exception {
		setJsfPage("conference.jsf");
		setTwimlFile("conference.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testDial() throws Exception {
		setJsfPage("dial.jsf");
		setTwimlFile("dial.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testEnqueue() throws Exception {
		setJsfPage("enqueue.jsf");
		setTwimlFile("enqueue.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testGather() throws Exception {
		setJsfPage("gather.jsf");
		setTwimlFile("gather.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testHangup() throws Exception {
		setJsfPage("hangup.jsf");
		setTwimlFile("hangup.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testLeave() throws Exception {
		setJsfPage("leave.jsf");
		setTwimlFile("leave.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testNumber() throws Exception {
		setJsfPage("number.jsf");
		setTwimlFile("number.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testPause() throws Exception {
		setJsfPage("pause.jsf");
		setTwimlFile("pause.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testPlay() throws Exception {
		setJsfPage("play.jsf");
		setTwimlFile("play.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testQueue() throws Exception {
		setJsfPage("queue.jsf");
		setTwimlFile("queue.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testRecord() throws Exception {
		setJsfPage("record.jsf");
		setTwimlFile("record.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testRedirect() throws Exception {
		setJsfPage("redirect.jsf");
		setTwimlFile("redirect.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testReject() throws Exception {
		setJsfPage("reject.jsf");
		setTwimlFile("reject.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testSay() throws Exception {
		setJsfPage("say.jsf");
		setTwimlFile("say.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testSip() throws Exception {
		setJsfPage("sip.jsf");
		setTwimlFile("sip.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

	@Test
	public void testSms() throws Exception {
		setJsfPage("sms.jsf");
		setTwimlFile("sms.twiml");
		ClientResponse<String> result = execute();
		Assert.assertEquals(200, result.getStatus());
		Assert.assertEquals(getTwiml(), result.getEntity().trim());
	}

}
