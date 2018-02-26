# spring-cloud-demo
项目pom.xml提供两种打包方式：
1、maven-jar-plugin 配合 maven-dependency-plugin
2、maven-shade-plugin  

注：打包完成后，方式1需要把jar包和lib目录放在同一目录下
使用命令 java -jar ****.jar 启动即可注册到dubbo