package coza.trojanc.stonewriter.context;

/**
 * Created by Charl-PC on 2016-10-16.
 */
public class SimpleContextVariable implements ContextVariable {

	/**
	 * Text to be printed
	 */
	private String expression;

	private DynamicType type = DynamicType.String;

	/**
	 * Formatting to apply to value
	 * The following fomatters will be applied to each of these types
	 * <table>
	 *    <tr>
	 *        <th>DynamicType</th>
	 *        <th>Class</th>
	 *     </tr>
	 *     <tr>
	 *         <td>Date</td>
	 *         <td>SimpleDateFormat</td>
	 *     </tr>
	 *     <tr>
	 *         <td>Number</td>
	 *         <td>String.format()</td>
	 *     </tr>
	 *     <tr>
	 *         <td>Decimal</td>
	 *         <td>DecimalFormat</td>
	 *     </tr>
	 * </table>
	 */
	private String formatting;

	private String key;

	@Override
	public DynamicType getType() {
		return this.type;
	}

	@Override
	public String getKey() {
		return this.key;
	}

	@Override
	public String getFormatting() {
		return this.formatting;
	}

	@Override
	public String getExpression() {
		return this.expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public void setType(DynamicType type) {
		this.type = type;
	}

	public void setFormatting(String formatting) {
		this.formatting = formatting;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
