tools4java
==========

#### 项目中经常会用到的些工具类，如httpclient, guava， fastjson... ,慢慢的完善积累...

### 使用方法
找到工具类，复制到项目中，然后在pom.xml 中找到相应的dependency， 放到你的pom.xml中， 使用`mvn eclipse:clean eclipse:eclipse`，使用工具类中的方法

### 使用到的类库
1. google guava ，官方代码库[github_guava](https://github.com/google/guava), 使用教程可以参考[guava教程](http://ifeve.com/google-guava/)
2. alibaba fastjson, 官方代码库[fastjson](https://github.com/alibaba/fastjson), [fastjson wiki](https://github.com/alibaba/fastjson/wiki)
3. httpclient ，在此项目中使用的是4.3的版本，这个版本与之前的版本变动比较大， [教程](http://www.yeetrack.com/?p=779)