
# 苍穹外卖项目介绍

![](https://gitee.com/humbleb11/image/raw/master/QQ%E5%9B%BE%E7%89%8720240702102720.jpg)

## 项目介绍：
这是一款为餐饮类企业定制的软件产品，分为管理端和用户端。实现用户端点单，管理端处理订单的简易外卖软件。

## 业务模板介绍：

### 用户端基本业务：
- 微信登录
- 浏览商品
- 购物车
- 用户下单
- 微信支付
- 历史订单
- 地址管理
- 用户催单

### 商家端：
- 员工管理
- 菜品管理
- 套餐管理
- 订单管理
- 工作台
- 来电提醒
- 数据统计

## 使用的技术栈：

### *用户层*：


### 商家端：
- node.js

- Vue.js

- ElementUI
### 用户端：
-  微信小程序开发工具

### 网关层：
- Nginx

### 应用层：
- **Spring boot**

- **Spring MVC**
- **Spring Task**

- **Httpclient**

- **Spring Cache**
- **JWT**

- **阿里云OSS**

- **Swagger**
- **POI**

- **WebSocket**
### 数据层：
- **MySQL**

- **Redis**

- **Mybatis**

- **pagehelper**

- **spring data redis**


### 工具：
- **Git**

- **maven**

- **Junit**

- **Apipost**

# 后端初始环境介绍

## sky-common层
| 包名       | 作用                                                         |
|------------|--------------------------------------------------------------|
| constant   | 封装各种常量类，代替硬编码                                 |
| context    | 封装基础上下文类                                            |
| enumeration| 封装各种枚举类                                              |
| exception  | 封装各种异常类                                              |
| json       | 处理json转换的类                                            |
| properties | 存放Spring boot的相关配置的类                              |
| result     | 封装各种返回结果的类                                        |
| utils      | 封装各种工具类                                               |

## sky-pojo层
| 包名 | 作用                                                         |
|-------|--------------------------------------------------------------|
| dto   | 提供实体，封装前端发送给后端的数据，方便后端处理             |
| entity| 提供各种实体类，例如员工类                                   |
| vo    | 提供实体，封装后端发送给前端的数据，方便前端处理             |

## sky-server层
| 包名        | 作用                                                         |
|-------------|--------------------------------------------------------------|
| annotation  | 存放自定义注解                                               |
| aspect      | 存放各种切面                                                 |
| config      | 存放各种配置类                                               |
| controller  | 存放各种处理前端请求的方法，向下还细分为管理端，用户端，通用端 |
| handler     | 封装和处理异步任务，事件或消息。                           |
| interceptor | 存放拦截器，按照指定条件拦截前端请求                       |
| mapper      | 存放mapper，是Java与MySQL直接进行交互的包               |
| service     | 存放各种业务功能的具体实现逻辑方法                       |
| Task        | 任务类，存放各种任务                                       |
| websocket   | 封装websocket，简化websocket的使用。                     |

## 数据库各张表的作用
| 表名          | 作用                                                         |
|---------------|--------------------------------------------------------------|
| address_book  | 存放用户下单地址                                             |
| category      | 存放菜品类型                                                 |
| dish          | 存放菜品                                                     |
| dish_flavor   | 存放菜品口味                                                 |
| employee      | 存放管理端员工信息                                           |
| order_detail  | 存放各个订单的明细                                          |
| orders        | 存放各个订单                                                 |
| setmeal       | 存放套餐                                                     |
| setmeal_dish  | 存放套餐内的具体菜品                                         |
| shopping_cart| 购物车，方便前端购物车回显                                |
| user          | 用户表，存放用户账号密码                                    |
## 项目环境

本项目模板已经配置好了整个项目所需要的Maven依赖。以下是环境和使用到的依赖及其版本：

### Maven依赖及版本

| 依赖名称               | 版本号           |
|----------------------|----------------|
| mybatis-spring        | 2.2.0          |
| lombok               | 1.18.20        |
| fastjson             | 1.2.76         |
| commons-lang         | 2.6            |
| druid                | 1.2.1          |
| pagehelper           | 1.3.0          |
| aliyun-sdk-oss       | 3.10.2         |
| knife4j              | 3.0.2          |
| aspectj              | 1.9.4          |
| jjwt                 | 0.9.1          |
| jaxb-api             | 2.3.1          |
| poi                  | 3.16           |

这些依赖涵盖了ORM框架、代码简化、JSON处理、通用工具类、数据库连接池、分页插件、云存储服务、接口文档工具、AOP框架、JSON Web Token处理、XML绑定以及Office文档处理等多个方面，为项目提供了全面的功能支持。

##  Swagger接口测试工具
有了这个我还要Apipost干嘛，也不是，但是确实Kinfe4j为我们提供了方便，利用它生成一个请求接口文档，我们就可以做接口测试了

![](https://gitee.com/humbleb11/image/raw/master/QQ%E6%88%AA%E5%9B%BE20240708041925.png)
补一句，通过注解可以控制生成的接口文档,让文档具有更好的可读性比如说基本每个功能实现都有
-  **@Api**：用于对Controller类进行说明和描述，可以指定Controller的名称、描述、标签等信息。

  - **@ApiOperation**：用于对Controller中的方法进行说明和描述，可以指定方法的名称、描述、请求方法（GET、POST等）等信息。

## 项目中的CURD基础实现
### 以员工管理为例
 #### 员工登录
 * 请求路径
 ``` /admin/employee/login         ```
 *请求方式*
 `Post`
 * 接口描述：该接口用于员工登陆管理系统
 
 * 响应数据样例：
 ``` {
  "code": 1,
  "msg": null,
  "data": {
    "id": 1,
    "userName": "admin",
    "name": "管理员",
    "token": "eyJhbGciOiJIUzI1NiJ9.eyJlbXBJZCI6MSwiZXhwIjoxNzIwMzg4NjEwfQ.WY87I62mZVzli8U1umox_gQaiA7Mr-dfzjd-ZQXEUsg"
  }
  ```
  - 这之中运用JWT生成用户登录成功后的令牌，包含用户信息，以便后续请求验证用户身份，服务端生成JWT，并在客户端保存并在请求中携带JWT，以实现用户认证，让双向的传输更安全。
  ### 新增员工
  这个就很简单了 ，用POST的请求方式将JSON格式例如
```  {
    "idNumber":"1548573",
    "name":"彼时陌寒",
    "phone":"11548578435",
    "sex":"1",
    "username":"55555"
    }
   ```
   发送后得到：
   ```{
  "code": 1,
  "msg": null,
  "data": null
}
```
说明成功完成新增员工的功能实现，每一个接口都会运用到JWT的加密，所以就不用赘述了。
### 编辑员工信息
也是很简单的运用，给出JSON格式的
```
{
  "id": 0,
  "idNumber": "23",
  "name": "hahaha",
  "phone": "23123123123",
  "sex": "1",
  "username": "12334532"
}
```
将其通过PUT后得到返回值中`code:1`就说明成功了
### 查询员工信息
可以通过分页查询员工信息，这里就运用到了Pagehelper了给出页码、每页记录数，就可以实现分页查询功能实现，这个还真有点方便，解放双手了，再一个就是根据Id查询员工信息，给出参数ID的参数值，就可以返回一个封装好了的JSON数据，例如
```
{
  "code": 1,
  "msg": null,
  "data": {
    "id": 2,
    "username": "dasb",
    "name": "大二逼",
    "password": "****",
    "phone": "15548578142",
    "sex": "1",
    "idNumber": "548573213123213122",
    "status": 1,
    "createTime": "2024-06-30 22:33",
    "updateTime": "2024-07-01 02:32",
    "createUser": 10,
    "updateUser": 1
  }
}
```
就可以得到这个大二逼的具体信息啦！

当然一个店铺也可能人走茶凉，也可能有新生血液，所以**启用禁用账号**是很有必要的，毕竟偷偷改价格白嫖外卖怎么办，所以设置了`status`为1则启用账号，为0则禁用账号，只需要给出`id`和`status`就可以进行设置了。

>
>不管是分类还是套餐呀，菜品呀，它们的相关增删改查的代码的相似度还是挺高的，所以就不一一列出了，就去一个典型就可以了，但是在整个CRUD的编写中，我还是运用了一些比较方便的方法去让码代码更简单。
### 基于注解和AOP的公共字段填充：
通过注解的方式，利用AOP思想创建一个切面，在切面中实现对字段的填充，然后再运行原方法。这样就实现了在**不改动**原方法的前提下，实现了对代码的优化升级。
在菜品管理的阶段中有好多好多创建时间和Id,修改时间和Id，难道说每次都要重新手打一边吗，或者是cv。不管怎样都挺麻烦，所以通过
-   自定义注解AutoFill,用于表示需要进行公共字段填充的方法
-   自定义切面类AutoFillAspect,统一拦截AutoFill注解方法,通过反射为公共字段赋值
-   在Mapper对应方法加入注解

诶，这样就可以使用`@AutoFill(value = OperationType.INSERT或UPDATE)`进行对以下内容的修改

![](https://gitee.com/humbleb11/image/raw/master/1.png)
### 对方法开启事务：
那么问题又来了，随着业务操作的增加，对任何一张表的修改可能对会影响到其他的表，例如我们在插入dish中的菜品的时候，也应该一并插入dish_flavor中该菜品的对应的口味。

但是这两张表的数据的插入，应该是确保都完成的，不可以出现只插入了菜品或者只插入了口味的情况。因此我们要把对这两张表的操作设置为一个事务，只需要在启动类上方添加 **@EnableTransactionManagement**之后我们只需要在需要捆绑成为一个事务的方法上添加 **@Transactional** 这样就把对两张表的操作捆绑成为了一个事务。
### Redis
随着黑马大哥的学习的深入，我也意识到好像在小程序端每次点击一个分类就得重新进行查询操作，这好像会让数据库有点苦不堪言了，诶
Redis来了，所以我们利用Redis来对业务优化：

缓存请求相应内容，如果小程序又发送相同请求，那么我们就从缓存中直接返回相应内容。这样就减少了直接对后端的数据库的查询。查一查资料，Redis是高性能的，基于键值对的，写入缓存的内存存储系统。这不正是我想要的，我们就可以通过**Redis Template**对象操作**Redis**，在店铺的营业状态就可以利用**Redis Template**去设置和获取店铺的营业状态
，舒服了。例如
```
//获取店铺的营业状态  
@GetMapping("/status")  
@ApiOperation("获取店铺的营业状态")  
public Result<Integer> getStatus() {  
  Integer status =(Integer) redisTemplate.opsForValue().get(KEY);  
    log.info("获取到店铺的营业状态为：{}",status==1?"营业中":"打烊中");  
    return Result.success(status);  
}
```
 ### 利用Spring cache来对业务进行优化：
 在进入了更深入的学习，我也发现Spring cache也是一种很好的缓存技术，基于注解的方式去进行缓存的操作，这不比Redis还要定义一个Redis Template更方便腻，所以在套餐管理，菜品管理中就可以运用给list方法加上 **@Cacheable**，在save,delete,update等方法加上 **@CacheEvict**，进行缓存的相关操作，这样就比较丝滑了

### Spring Task：
等等，在订单的处理好像有点问题，下单后未支付怎么办,用户收货后管理端没有点击完成按钮，订单还没完成怎么办，所以我的做法就是超过一定时间自动取消订单订单一定时间后自动完成，要怎么完成这个操作呢，怎样完成这个操作呢，这就需要 **Spring Task**的帮助了，有了它我们就可以处理定时的任务,就像这样
>INFO 23392 --- [   scheduling-1] com.sky.task.OrderTask                   : 定时处理超时订单:2024-07-08T05:30:00.014320800
 
 系统每分钟处理一次超时订单，每天凌晨一点处理完成但没点完成的订单，这样就没有异常订单啦


### 引入Websocket来实现用户端和商家端通信：

最后，我咋知道有新的订单呢，难道只是用眼睛看嘛，但是我在做菜或者端盘子，我眼睛看不到怎么办，或者我是消费者，你这个外卖做的太慢了，我想掀桌子了，我就只能坐着发呆等外卖吗，有了Websocket，一切都好起来了，有了它，就可以实现外卖催单和来单提醒这两个功能。然后商家也能知道有外卖订单啦，消费者也可以一直按**催单**按钮疯狂折磨店家，岂不是很爽

这两个业务功能的逻辑思路很简单：

    用户端下单或者催单后，发送特定请求到后端，后端再发送请求到商家端，商家端再根据后端的请求判断是催单还是来单提醒。
![商家端接收订单](https://gitee.com/humbleb11/image/raw/master/2.png)
![用户端催单](https://gitee.com/humbleb11/image/raw/master/3.png)
![商家端得到催单信息](https://gitee.com/humbleb11/image/raw/master/4.png)


###Apache POI技术实现导出文件：
你是老板，你要看这个月的详细报告，我是员工，我抓耳挠腮，我咋给你看，直接给你看客户端吗，那也不行呀，自己手搓一个报告Exccel表，不可能的，这点工资想教我做事。突然我发现了 **Apache POI**，我如得天兵天将。我准备了一个报告模板
![报告模板](https://gitee.com/humbleb11/image/raw/master/5.png)

这样以后的数据都可以通过POI,导入进EXcel啦，但是我发现这个代码是真的又臭又长
```
//基于模板文件创建一个新的Excel文件  
XSSFWorkbook excel =new XSSFWorkbook(in);  
  
//获取标签页  
XSSFSheet sheet = excel.getSheet("Sheet1");  
//填充数据--时间  
sheet.getRow(1).getCell(1).setCellValue("时间："+dateBegin+"至"+dateEnd);  
  
//获得第4行  
XSSFRow row = sheet.getRow(3);  
row.getCell(2).setCellValue(businessDataVO.getTurnover());  
row.getCell(4).setCellValue(businessDataVO.getOrderCompletionRate());  
row.getCell(6).setCellValue(businessDataVO.getNewUsers());  
  
//获得第5行  
row =sheet.getRow(4);  
row.getCell(2).setCellValue(businessDataVO.getValidOrderCount());  
row.getCell(4).setCellValue(businessDataVO.getUnitPrice());
```
balabala
这样就可以让老板开开心心的看报告了

>到这里基本的代码实现都弄好啦



   ### 阿里云OSS云存储服务：
 - 我们通过这项技术来存储菜品，套餐，员工的图片。之所以不存到本地，这是因为前端无法回调服务器的本地图片，这也就造成我们只能存图片，无法回显图片的BUG，而我们如果调用阿里云的云存储服务，照片存储到阿里巴巴的云之后，会返送一个URL，我们通过这段URL就可以回调图片。
 - 但是在云存储服务中，我们还要注意

> 使用UUID生成文件名

我们需要使用UUID来为上传到阿里云OSS的图片命名。而阿里云图片命名不允许重复，否则就会覆盖。因此我们使用UUID来生成一串随机数，这样就确保了文件不被新文件覆盖。
 

### 微信登录接口：
 - **1.** 我们的小程序会调用wx.login()来获得一个code。该 code 的作用是用于后续的用户身份验证和获取用户信息。

 - **2.** 小程序的wx.request会把code发送给后端，后端再打包自己的小程序ID（appid）和小程序密钥(appsecert) 最后加上小程序发送给自己的code，利用Httpclient从后端发送给微信接口服务。而微信接口服务会在校验之后返回session_key和openid
 - **3.** 在后端获取到微信接口服务发送给自己的session_key和openid，**自定义用户登录态**，并且发送给小程序
 - **4.** 小程序把后端发送过来的自定义登录态存入到storge中
 ### 微信支付接口：
这个东西说实话原理说复杂也不复杂，但是如果要实现微信支付功能，就必须要我有商户号一系列balbala的东西，很不幸，我没那能力，但是我可以通过改写前后端的支付相关代码，跳过支付过程，实现 **支付成功**的功能，厉害吧
![](https://gitee.com/humbleb11/image/raw/master/6.png)

>最后来看看商家端和用户端的页面实现吧
### 商家端
1.工作台业务实现


![](https://gitee.com/humbleb11/image/raw/master/7.png)

2.数据统计业务实现


![](https://gitee.com/humbleb11/image/raw/master/8.png)


3.订单管理界面实现


![](https://gitee.com/humbleb11/image/raw/master/9.png)


4.菜品管理页面实现


![](https://gitee.com/humbleb11/image/raw/master/10.png)


5.新增套餐分类业务实现


![](https://gitee.com/humbleb11/image/raw/master/11.png)


#### 当然是装不下全部的页面的，所以挑了几个比较有代表性的页面
### 用户端
即微信小程序端的页面
1.用户登录界面实现


![](https://gitee.com/humbleb11/image/raw/master/21.png)


2.菜品选择界面实现


![](https://gitee.com/humbleb11/image/raw/master/22.png)


3.地址管理界面实现


![](https://gitee.com/humbleb11/image/raw/master/23.png)


4.提交订单界面实现


![](https://gitee.com/humbleb11/image/raw/master/24.png)


5.订单详情界面实现


![](https://gitee.com/humbleb11/image/raw/master/25.png)

# 能看到这里的都是大哥，求求大哥让我过55555
