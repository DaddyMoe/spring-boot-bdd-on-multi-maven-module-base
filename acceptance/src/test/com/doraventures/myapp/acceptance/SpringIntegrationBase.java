package com.doraventures.myapp.acceptance;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author moses@doraventures.com
 */
@ContextConfiguration(classes = com.doraventures.myapp.acceptance.AcceptanceApplication.class)
@WebAppConfiguration
public class SpringIntegrationBase {

}