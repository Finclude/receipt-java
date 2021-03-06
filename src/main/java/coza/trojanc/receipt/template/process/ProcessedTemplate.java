package coza.trojanc.receipt.template.process;

import coza.trojanc.receipt.template.process.fields.ProcessedLineItem;

import java.util.ArrayList;
import java.util.List;

/**
 * A class representing a template that has been processed
 * @author Charl Thiem
 */
public class ProcessedTemplate {

	private List<ProcessedLineItem> items = new ArrayList<>();

	public List<ProcessedLineItem> getItems() {
		return items;
	}

	public void setItems(List<ProcessedLineItem> items) {
		this.items = items;
	}
}
