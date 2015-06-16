package net.wohlfart.client;

import java.util.HashMap;
import java.util.Map;

public class TextEditorPreset {
	public static Map<String,String> PRESET_BASIC = new HashMap<>();
	public static Map<String,String> PRESET_ADVANCED = new HashMap<>();
	public static Map<String,String> PRESET_ICE = new HashMap<>();

	static {
		PRESET_BASIC.put("theme", "modern");

		PRESET_ADVANCED.put("theme", "modern");
		PRESET_ADVANCED.put("plugins", "insertdatetime,preview,ice");
		PRESET_ADVANCED.put("theme_advanced_buttons1", "newdocument, | "
				+ ",bold, italic, underline, |, justifyleft, justifycenter"
				+ ",justifyright, fontselect, fontsizeselect, formatselect"	
			//	+ ",ice_togglechanges,ice_toggleshowchanges,iceacceptall,icerejectall,iceaccept,icereject"
				);
		PRESET_ADVANCED.put("theme_advanced_buttons2", "cut, copy, paste, |"
				+ ",bullist, numlist, |, outdent, indent, |, undo, redo, |"
				+ ",link, unlink, anchor, image, |, code, preview, |, forecolor, backcolor");
		PRESET_ADVANCED.put("theme_advanced_buttons3", "insertdate, inserttime"
				+ ",|, spellchecker, ,removeformat, |"
				+ ",sub, sup, |, charmap, emotions");
		PRESET_ADVANCED.put("theme_advanced_toolbar_location", "top");
		PRESET_ADVANCED.put("theme_advanced_toolbar_align", "left");
		PRESET_ADVANCED.put("theme_advanced_statusbar_location", "bottom");
		
		PRESET_ICE.put("theme", "modern");

	}
}