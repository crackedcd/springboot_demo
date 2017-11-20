# 1. [start.spring.io](http://start.spring.io/)

search for dependencies: web, mybatis, mysql
generate project.

导入eclipse, spring的pom.xml就自动生成了

# 2. maven

下载apache maven
Window -> Preferences -> Maven -> User Settings
设置maven的settings.xml
    <mirror>
      <id>alimaven</id>
      <name>aliyun maven</name>
      <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
      <mirrorOf>central</mirrorOf>
    </mirror>

# 3. mybatis

eclipse安装mybatis generator插件
新建并设置src/main/resources/static/generatorConfig.xml文件
根据javaModelGenerator/sqlMapGenerator/javaClientGenerator的配置, 手动建立model/sqlmapper/dao目录
完成后右键点击generatorConfig.xml, run as -> run mybatis generator, 自动生成orm映射

# 4. 新建service逻辑层, 编写controller路由和逻辑层代码

> 参考(http://www.cnblogs.com/ityouknow/p/5662753.html)
