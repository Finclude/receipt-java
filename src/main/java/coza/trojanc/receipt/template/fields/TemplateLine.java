package coza.trojanc.receipt.template.fields;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * @author Charl Thiem
 */
@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,
		include = JsonTypeInfo.As.PROPERTY,
		property = "type")
@JsonSubTypes({
		@JsonSubTypes.Type(value = Feed.class, name = "feed"),
		@JsonSubTypes.Type(value = Line.class, name = "line"),
		@JsonSubTypes.Type(value = FillLine.class, name = "fillLine"),
		@JsonSubTypes.Type(value = RepeatBlock.class, name = "repeatBlock"),
})
public interface TemplateLine {
}
