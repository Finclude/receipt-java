package coza.trojanc.receipt.template.loader.impl;

import coza.trojanc.receipt.TestUtils;
import coza.trojanc.receipt.template.PrintTemplate;
import coza.trojanc.receipt.template.loader.TemplateDefinitionLoader;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static coza.trojanc.receipt.TestUtils.TEST_OUT;

/**
 * Unit test for {@link JsonTemplateDefinitionLoader}
 * @author Charl Thiem
 */
public class JsonTemplateDefinitionLoaderTest{

	@Test
	public void testGenerateJson() throws IOException {
		TemplateDefinitionLoader loader = new JsonTemplateDefinitionLoader();
		PrintTemplate template = TestUtils.createTemplate();

		loader.write(template, TEST_OUT);
	}

	@Test
	public void testLoadBackJsonTemplate() throws IOException {
		TemplateDefinitionLoader loader = new JsonTemplateDefinitionLoader();
		PrintTemplate template = TestUtils.createTemplate();
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		loader.write(template, byteArrayOutputStream);

		template = loader.load(byteArrayOutputStream.toString());
	}

}