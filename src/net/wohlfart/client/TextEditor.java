package net.wohlfart.client;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.user.client.ui.TextArea;

public class TextEditor extends TextArea implements EntryPoint {

	private boolean initialized = false;
	private final String elementId;
	private Set<String> fixedOptions = new HashSet<>(2); // options that can not be overwritten
	private JSONObject options = new JSONObject(); // all other TinyMCE options

	public TextEditor(String elementId)
	{
		this.elementId = elementId;
		getElement().setId(elementId);

		// fixed attributes
		addOption("mode", "exact");
		addOption("elements", elementId);
		fixedOptions.addAll(options.keySet());
		// load preset
		//addOptions(TextEditorPreset.PRESET_BASIC);
	}

	public void addOptions(Map<String, String> options) {
		for (Map.Entry<String, String> entry : options.entrySet()) {
			addOption(entry.getKey(), entry.getValue());
		}
	}

	public void onModuleLoad() {
		
	}

	protected void onLoad() {
		super.onLoad();
		initialize();
	}

	private native void initTinyMce() /*-{
	    var options = {
	      mode: "exact",
	      elements: this.@net.wohlfart.client.TextEditor::elementId,
	      theme: "modern"
	    }
	    $wnd.tinyMCE.init(options);
	}-*/;

	public String getText() {
		String result;
		if (initialized) {
			result = getContent(elementId);
		} else {
			result = super.getText();
		}
		return result;
	}
	
	private native String getContent(String elementId) /*-{
	     return $wnd.tinyMCE.get(elementId).getContent();
	}-*/;

	public void setText(String text) {
		if (initialized) {
			setContent(elementId, text);
		} else {
			super.setText(text);
		}
	}

	private native String setContent(String elementId, String text) /*-{
	     $wnd.tinyMCE.get(elementId).setContent(text);
	}-*/;

	public void addOption(String key, String value) {
		// do not allow overriding fixed options
		if (fixedOptions.contains(key)) {
			return;
		}
		options.put(key, new JSONString(value));
	}

	private void initialize(){
		initTinyMce(options.getJavaScriptObject());
		initialized = true;
	}

	private native void initTinyMce(JavaScriptObject options) /*-{
	    $wnd.tinyMCE.init(options);
	}-*/;
}