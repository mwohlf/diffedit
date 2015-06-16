package net.wohlfart.client;

import java.util.HashMap;
import java.util.Map;

public class TextEditorPreset
{
	public static Map PRESET_ADVANCED = new HashMap();
	public static Map PRESET_BASIC = new HashMap();

	static {
		PRESET_BASIC.put("theme", "modern");

		PRESET_ADVANCED.put("theme", "advanced");
		PRESET_ADVANCED.put("plugins", "emotions,spellchecker,advhr,insertdatetime,preview");
		PRESET_ADVANCED.put("theme_advanced_buttons1", "newdocument, |, "
				+ "bold, italic, underline, |, justifyleft, justifycenter,"
				+ "justifyright, fontselect, fontsizeselect, formatselect");
		PRESET_ADVANCED.put("theme_advanced_buttons2", "cut, copy, paste, |,"
				+ "bullist, numlist, |, outdent, indent, |, undo, redo, |,"
				+ "link, unlink, anchor, image, |, code, preview, |, forecolor, backcolor");
		PRESET_ADVANCED.put("theme_advanced_buttons3", "insertdate, inserttime,"
				+ "|, spellchecker, advhr, ,removeformat, |,"
				+ "sub, sup, |, charmap, emotions");
		PRESET_ADVANCED.put("theme_advanced_toolbar_location", "top");
		PRESET_ADVANCED.put("theme_advanced_toolbar_align", "left");
		PRESET_ADVANCED.put("theme_advanced_statusbar_location", "bottom");
	}
}