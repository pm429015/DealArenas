package site;

import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonEncoder {
	public static void main(String[] args) {
		Map iPhone_qualities = new LinkedHashMap<String, Boolean>();
		
		// 受潮檢測 http://www.iconarchive.com/show/crystal-clear-icons-by-everaldo/App-ksplash-water-icon.html
		iPhone_qualities.put("手機受潮檢測", new Boolean(true));
		
		// 多點觸碰測試 http://www.iconarchive.com/show/outline-icons-by-iconsmind/Hand-TouchSmartphone-icon.html
		iPhone_qualities.put("觸控螢幕測試", new Boolean(true));
		
//		// 螢幕死區測試
//		iPhone_qualities.put("screen_deadZone", new Boolean(true));
		
		// 耳機與麥克風測試 http://www.iconarchive.com/show/oxygen-icons-by-oxygen-icons.org/Actions-speaker-icon.html
		iPhone_qualities.put("聽筒測試", new Boolean(true));
		
		// 喇叭與麥克風測試 http://www.iconarchive.com/show/media-icons-by-bevel-and-emboss/microphone-icon.html
		iPhone_qualities.put("話筒測試", new Boolean(true));
		
		// 撥接功能測試 http://www.iconarchive.com/show/mobile-icons-by-youdu/Phone-List-icon.html
		iPhone_qualities.put("手機撥接", new Boolean(true));
		
		// 照相機測試 http://www.iconarchive.com/show/captiva-icons-by-bokehlicia/camera-icon.html
		iPhone_qualities.put("照相測試", new Boolean(true));
		
		// 閃光燈測試
//		iPhone_qualities.put("flash", new Boolean(true));
		
		// 震動功能測試
//		iPhone_qualities.put("手機震動", new Boolean(true));
		
		// 按鈕檢測 http://www.iconarchive.com/show/colorful-long-shadow-icons-by-graphicloads/Power-icon.html
		iPhone_qualities.put("電源按鈕", new Boolean(true));
		
		// 按鈕檢測 http://www.iconarchive.com/show/blox-folder-icons-by-poundffffff/iPhone-icon.html
		iPhone_qualities.put("Home按鈕", new Boolean(true));
		
		// http://www.iconarchive.com/show/colorful-long-shadow-icons-by-graphicloads/Button-1-play-icon.html
		iPhone_qualities.put("音量按鈕", new Boolean(true));
		
		// 耳機孔檢測 http://www.iconarchive.com/show/oxygen-icons-by-oxygen-icons.org/Devices-audio-input-line-icon.html
		iPhone_qualities.put("手機耳機孔", new Boolean(true));
		
		// 衛星導航測試 http://iconmonstr.com/navigation-14-icon/
		iPhone_qualities.put("衛星導航測試", new Boolean(true));
		
		// 3G晶片測試 https://www.iconfinder.com/icons/40512/feed_iphone_mobile_rss_icon#size=128
		iPhone_qualities.put("3G晶片", new Boolean(true));
		
		// WiFi晶片測試 http://www.iconarchive.com/show/hex-icons-by-martz90/wifi-icon.html
		iPhone_qualities.put("WiFi晶片", new Boolean(true));
		
		// 藍芽測試 https://www.iconfinder.com/icons/82101/bluetooth_icon#size=128
		iPhone_qualities.put("藍芽", new Boolean(true));
		
		// 方向感測器測試 http://www.iconarchive.com/show/oxygen-icons-by-oxygen-icons.org/Actions-transform-rotate-icon.html
		iPhone_qualities.put("方向感測器", new Boolean(true));
		
		// 陀螺儀測試  http://iconmonstr.com/layer-13-icon/
		iPhone_qualities.put("陀螺儀", new Boolean(true));
		
		// 接近感測器測試 http://iconmonstr.com/cpu-7-icon/
		iPhone_qualities.put("接近感測器", new Boolean(true));
		
		// 電子羅盤測試 https://www.iconfinder.com/icons/283041/browser_compass_direct_direction_navigation_northeast_path_pathfinder_pointer_safari_way_icon#size=128
		iPhone_qualities.put("電子羅盤", new Boolean(true));
		
		// 硬碟測試 http://www.iconarchive.com/show/oxygen-icons-by-oxygen-icons.org/Apps-partitionmanager-icon.html
		iPhone_qualities.put("手機硬碟", new Boolean(true));
		
		// 記憶體測試 http://www.iconarchive.com/show/crystal-clear-icons-by-everaldo/App-kcm-memory-icon.html
		iPhone_qualities.put("記憶體", new Boolean(true));
		
		// 處理器測試 http://iconmonstr.com/cpu-6-icon/
		iPhone_qualities.put("處理器", new Boolean(true));
		
		StringWriter results_str = new StringWriter();
		try {
			JSONValue.writeJSONString(iPhone_qualities, results_str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print(results_str.toString());
	}
}
