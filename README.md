任务列表：

1，了解Library module，生成library module 对应的aar包。
2，了解App module，使用app module 来 依赖 library 1开发。
3， 使用app module 来 依赖 aar 来开发。
3.1 使用app module 来 依赖 library 2开发。
3.2 使用library1  来 依赖 library 2开发。
3.3 使用app   来 依赖 library 1开发。

4， 实现aar打包发布的脚本
5，验证Microstrategy Badge代码库。


LibraryCore -> Chucker
LibraryCoreChucker = > LibraryCore + Chucker



Case 1: 
Library1
Library2

App -> Library1
App 有没有Library2的代码？ 没有。



Case 2: 
Library1
Library2

Library1 -> api  library2

App -> Library1
App 有没有Library2的代码？ 有。

Case 3: 
Library1
Library2

Library1 -> implementation  library2

App -> Library1
App 有没有Library2的代码？ 没有。



Case 4: 
Library1
Library2

Library1 -> api  library2
Library1 -> Library1 aar

App 有没有Library1的代码？有。
App 有没有Library2的代码？ 没有。


Case 5: 
Library1
Library2

Library1 -> api  library2
Library1 -> Library1 aar
Library2 -> Library2 aar
App -> Library1 aar +  Library2 aar
App 有没有Library1的代码？有。
App 有没有Library2的代码？ 有。


