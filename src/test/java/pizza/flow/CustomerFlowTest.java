package pizza.flow;

import org.junit.Ignore;
import org.springframework.webflow.config.FlowDefinitionResource;
import org.springframework.webflow.config.FlowDefinitionResourceFactory;
import org.springframework.webflow.test.MockFlowBuilderContext;
import org.springframework.webflow.test.execution.AbstractXmlFlowExecutionTests;

@Ignore
public class CustomerFlowTest extends AbstractXmlFlowExecutionTests{

	@Override
	protected FlowDefinitionResource getResource(FlowDefinitionResourceFactory resourceFactory) {
		return resourceFactory.createResource("file:src/main/webapp/WEB-INF/flows/pizza/customer/customer-flow.xml");
	}

	
	

}
