## DealArenas (暫定)好康競技場

請按照 Getting Started Guide 的教學把專案跑起來玩一玩他的基本功能 基本上大部份的功能已經完成 主要就是中文化和外觀改一改 資料庫的部分現在先暫定Mysql因為他有教學 Readme就當做我們留言板吧 有問題請留言
																	       
安裝步驟：
1. 開Eclipse 然後File-> import-> Git->Project from Git->Clone URL 把把URL貼上去 然後確認他就開始抓

2. File->import->Maven->Existing Maven Projects 然後去找你剛剛抓到的project

3. Eclipse 有ant的功能 如官方所教 把三個build.xml 放上去

4. 在每個project右鍵 Maven->update project 然後refresh一下

5. 在project ecommerce-website 去找 build.properties file的maven.home 改到你的路徑 看maven home 路徑的方式請到console打mvm -version 	   ps:請記得安裝maven

6. 在ant的視窗啟動admin和site的jetty-demo-jrebel 然後休息一下

7. 開browser http://localhost:8080/    and http://localhost:8444/admin/  (id:admin,pwd:admin)

8. 搞定收工

>有關Spring framework的教學 可以看這裡 [here](http://openhome.cc/Gossip/SpringGossip/)
	
克勳補充(08/16)

1. stanly找了一個spring tool：http://spring.io/tools ，左邊的下載後再從步驟一開赤，eclipse就不用重裝一堆plugin了~~

2. project import後左上角有個M表示project已經是maven project了，但我的狀況是porm.xml會少掉jdk.tools的dependency

如果遇到此情況，請在porm.xml增加dependency，參考資料：http://forum.broadleafcommerce.org/viewtopic.php?f=14&t=2321

																			

/* Original*/
This Maven project is meant to be used as a solid started project for any [Broadleaf Commerce](http://www.broadleafcommerce.org) application. It has many sensible defaults set up along with examples of how a fully functioning eCommerce site based on Broadleaf might work.

One typical way of using this project would be to follow the [Getting Started Guide](http://docs.broadleafcommerce.org/current/Getting-Started.html), which would walk you through using our pre-bundled Eclipse workspace.

However, if you would like to utilize your own workspace or IDE configuration, you may prefer to fork this project. This would give you the added benefit of being able to pull in upstream changes as we work to improve the DemoSite.

> Note: If you are going to fork this project, we recommend basing your work on the `master` branch, and not the develop branch. develop is our ongoing development branch and there are no guarantees of stability on it.
																		
