# DealArenas (暫定)二手競技場

###近期主要事項:
1. 提升google自然排序與買關鍵字(Stanley,克勳, 班代)

2. 賣家上架頁面+買賣家的FQA (Stanley)

3. 歐付寶 (Stanley, 克勳)

4. 怎麼在7-11和郵局寄手機 (運費多少?  花多久? 有沒有追蹤碼? 有沒有適合的寄物箱子可以裝iPhone的盒子呢? ) (克勳, 班代)

###大方向規劃:
一方面慢慢培養網站知名度和搜尋引擎排序  一方面開始填上網站內容  網站內容中又以介紹性的內容優先  然後買家賣家是雞生蛋 蛋生雞的問題  先從賣家開始下手(上架頁面 收款...等等) 再來買家的部分  預估明年過年完成

###流程:
    
賣家:上我們的網頁->點首頁賣家連結到賣家介紹頁面->點開始上架到上架頁面->(上架頁面中)選擇手機model 設定價格等-> (上架頁面中)賣家登入會員與開通歐付寶-> 上架商品與賣家基本資料Review-> 把手機寄過來
>請看這個範例網站: [here](http://glyde.com/)

買家:商城選擇手機然後放到購物車->歐付寶付款

####潛在問題:
1. 網站Memory用量大

2. 缺人手缺美工?!

##時間計劃表:

####九月: 
1. - [x] 賣家+買賣家的FQA ( 1 week)
	
####十月: 	
1. - [] 賣家商品登錄流程( 包括 登錄手機資訊 會員登入和註冊 等) 

2. - [] 賣家帳號結合歐付寶 ( 1 + 2  大概 3 weeks)

3. - [] 結合admin 網站 手機上架測試

####十一月:
1. - [] 如果以上還沒做完  這個月把它完成

2. - [] 規劃手機測試流程與測試結果頁面呈現 

####十二月:
1. - [] 規劃手機測試流程與測試結果頁面呈現 商城 ( 3 weeks )

2. - [] 購物車和買家歐付寶付款 (1 week)

3. - [] 測試 

####一月:
1. - [] 商城啟動  找親朋好友看誰想賣手機 我們幫忙上架或者推薦他來用

2. - [] 會員專區 (賣家可看目前他上架的手機,取款,取回手機要求等) (買家確認付款和退貨等) ( 2 weeks )

3. - [] 測試與需求調整

####二月:
1. 測試與需求調整 擴大宣傳

##安裝方式:

請按照 Getting Started Guide 的教學把專案跑起來玩一玩他的基本功能 基本上大部份的功能已經完成 主要就是中文化和外觀改一改 資料庫的部分現在先暫定Mysql因為他有教學 Readme就當做我們留言板吧 有問題請留言
																	       
安裝步驟：
1. 開Eclipse 然後File-> import-> Git->Project from Git->Clone URL 把把URL貼上去 然後確認他就開始抓

2. File->import->Maven->Existing Maven Projects 然後去找你剛剛抓到的project

3. Eclipse 有ant的功能 如官方所教 把三個build.xml 放上去

4. 在每個project右鍵 Maven->update project 然後refresh一下

5. 在project ecommerce-website 去找 build.properties file的maven.home 改到你的路徑 看maven home 路徑的方式請到console打mvm -version 	   ps:請記得安裝maven

6. 在ant的視窗啟動admin和site的jetty-demo-jrebel 然後休息一下

7. 開browser http://localhost:8080/    and http://localhost:8444/admin/  (id:admin,pwd:admin)

8. 安裝Mysql 設定帳號root 密碼833069237 新開一個資料叫broadleaf

9. 搞定收工

>有關Spring framework的教學 可以看這裡 [here](http://openhome.cc/Gossip/SpringGossip/)
	
克勳補充(08/16)

1. stanly找了一個spring tool：http://spring.io/tools ，左邊的下載後再從步驟一開赤，eclipse就不用重裝一堆plugin了~~

2. project import後左上角有個M表示project已經是maven project了，但我的狀況是porm.xml會少掉jdk.tools的dependency

如果遇到此情況，請在porm.xml增加dependency，參考資料：http://forum.broadleafcommerce.org/viewtopic.php?f=14&t=2321
																		
