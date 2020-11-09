# Android多渠道打包的几种方式

#### 友盟多渠道打包方式
 - umeng  模块
 - 加固后不会丢失渠道信息

#### Android Studio自带多渠道打包方式
 - aschannel  模块
 - 加固后不会丢失渠道信息

#### 美团walle多渠道打包方式
 - walle  模块
 - 加固后会丢失渠道信息

#### 360加固+walle打包:解决加固后渠道信息丢失
 - app 模块
 - 所有逻辑都在_360jiagu的包内
 - 代码中写死了只针对release的打包方式，且只对最新一个apk进行加固及多渠道
 - 执行后的结果在_360jiagu/output/walle包中
 - 需要执行的渠道号均写在_360jiagu/walle/channel.txt中
 - 对所有的包都打包在_360jiagu/output/zip的压缩包内
 - 具体使用方法
 - 在终端中使用gradlew _360jiagu(windows)
 - ./gradlew  _360jiagu(mac) 如果权限不足，在前面加上sudo