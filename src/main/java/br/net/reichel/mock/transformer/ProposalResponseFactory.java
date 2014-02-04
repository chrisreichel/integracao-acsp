package br.net.reichel.mock.transformer;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;
import org.mule.transformer.types.DataTypeFactory;

public class ProposalResponseFactory extends AbstractMessageTransformer {

	private final String separator = "|";
	
	public ProposalResponseFactory(){
		setReturnDataType(DataTypeFactory.STRING);
	}
	
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {		
		
		final Long proposalId = message.getProperty("proposalId", PropertyScope.INVOCATION);
		final String decision = message.getProperty("decision", PropertyScope.INVOCATION);
		final String amount = message.getProperty("amount", PropertyScope.INVOCATION);
		
		final StringBuilder response = new StringBuilder(proposalId.toString()).append(separator);
		response.append(decision).append(separator);
		if(amount != null){
			response.append(amount);
		}		
		return response.toString();
	}

}
