package coza.trojanc.receipt.context.loader.impl;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import coza.trojanc.receipt.context.ContextDefinition;
import coza.trojanc.receipt.context.impl.SimpleContextDefinition;
import coza.trojanc.receipt.context.loader.ContextDefinitionLoader;
import coza.trojanc.receipt.loader.JsonLoader;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Charl Thiem
 */
public class JsonContextDefinitionLoader extends JsonLoader<ContextDefinition> implements ContextDefinitionLoader {

	@Override
	public ContextDefinition load(InputStream inputStream) throws IOException {
		try {
			return MAPPER.readValue(inputStream, SimpleContextDefinition.class);
		}catch (JsonParseException | JsonMappingException e){
			throw new IOException("Failed to load json object", e);
		}
	}

	@Override
	public ContextDefinition load(String jsonString) throws IOException {
		try {
			return MAPPER.readValue(jsonString, SimpleContextDefinition.class);
		}catch (JsonParseException | JsonMappingException e){
			throw new IOException("Failed to load json object", e);
		}
	}
}
