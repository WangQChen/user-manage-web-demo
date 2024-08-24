# user-manage-web-demo

此项目是一个使用vue+springboot实现的用户管理系统网页demo

要尝试这个示例应用程序，请使用稳定版本的npm-cli以及idea来运行

此项目仅用于南开大学软件学院2024研究生实训第二周的作业

## 各文件解释

demo-java:  本项目的后端部分，提供前端使用的api接口，使用springboot框架，添加了登录与token认证

demo-vue：  本项目的前端部分，提供网页的外观，使用npm脚手架

demo.sql：  保存了本项目中使用到的数据库的sql文件，可用于mysql导入


## 关键点

#### [分页查找](demo-java/src/main/java/cn/fighter3/controller/UserController.java)
允许用户通过输入字符串主题来查找满足条件的用户列表：
* [非SQL语句进行分页查找](demo-java/src/main/java/cn/fighter3/controller/UserController.java#L34). 直接使用IService模板自带的page函数来返回IPage类型的对象,这样就可以不需要在Mapper层进行SQL语句的映射。同时使用QueryWrapper来进行查询条件的筛选。但使用IService模板自带的page函数返回的IPage对象中records会包含所有的记录，而非只有当前页码的记录，所以需要进行修改返回当前的页面包含的记录。
* [前端序号显示](demo-vue/src/views/user/index.vue#L43). 通过scope来让序号随着页码和每页大小的改变而改变。


## 数据
本项目使用到的数据由MySQL navicat 在数据库中可视化创建


## 开源
[user-manage-web-demo]: https://github.com/WangQChen/user-manage-web-demo.git
