# MIPS246 Spring改造计划

技术栈：SpringBoot+Mybatis+MySQL+thymeleaf模板引擎+ H+UI

idea中通过Spring Initializer创建

## 一、model

首先是原始的pojo

### Admin

```java
private String userid;
private String name;
private String password;
```



### Student

```java
private String userid;
private String name;
private String password;
```



### Teacher

```java
private String userid;
private String name;
private String password;
private String description;
```



### MyFile

```java
private String fileurl;
private String studentid;
private String courseid;
private String teacherid;
private int    filetype;
private int	   grade;
private int    coursesection;
private String createtime;
private String filename;
```



### Course

```java
private String coursename;
private String courseid;
private int studentcount;
private String teacherid;
private String createtime;
```

然后是关系类

### CourseSelect

```java
private String courseid;
private String userid;
private String teacherid;
private int grade;
```



### CourseTeacher

```java
private String courseid;
private String teacherid;
private String coursename;
private String teachername;
```





## 二、dao接口的数据

Mybatis中只需要创建Dao接口，不需要写实现类。然后Mybatis会自动匹配pojo和数据库中的字段，前提是pojo中的字段和数据库中的字段完全一致，如果不一致可以自建Mybatis-config.xml指定映射。

### AdminDao

​	

### StudentDao

### FileDao

### TeacherDao

## 三、服务层

dao接口中返回的数据过于简单，可以在服务层中进一步封装，比如添加事务控制等。但实际中仅仅做最简单的封装。

## 四、Controller控制层

### LoginController

用于控制登录和登出，还有注册

包含方法

```java
//用于接收url中的"/login"请求，跳转到login.html
public String login(){
	return login/login;//这需要login.html放在login文件夹中
}
public String 
```



## 五、页面展示层

### 公共部分

#### login

向controller.LoginController传递登录数据，包含role，userid，userpass，POST请求方式。

当url是login时，controller会自动跳转到这个页面，而后由form表单将数据提交到/users/login/do的controller，post请求方式。

#### logout

#### errorpage

