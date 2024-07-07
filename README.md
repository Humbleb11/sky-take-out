
# 苍穹外卖项目介绍

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
- node.js: 一个流行的服务器端运行时环境，被广泛用于构建 Web 应用程序、API、后端服务等

- Vue.js: 一个流行的前端 JavaScript 框架，用于构建交互式的 Web 用户界面

- ElementUI: 一个基于 Vue.js 的前端 UI 框架，提供了丰富的组件库和工具，用于快速构建现代化的 Web 应用程序
### 用户端：
-  微信小程序开发工具：专门为开发者提供的集成开发环境，用于创建、调试和发布微信小程序

### 网关层：
- Nginx: 使用Nginx来部署前端。是一款高性能Web开源服务器，在大型项目中，我们可以使用Nginx的负载均衡来合理请求到多台服务器，减小后端服务器压力

### 应用层：
- **Spring boot**: 基于Spring的开源框架，简化各项配置，使得开发人员专注于业务功能的实现

- **Spring MVC**: 基于 MVC（Model-View-Controller）模式的 Web 应用程序开发框架。它提供了一种结构清晰、模块化的方式来构建可扩展的 Web 应用程序

- **Spring Task**: 定时任务依赖，完成相关配置，后端可以定时完成任务

- **Httpclient**: HTTP开源的通信库，使得后端可以发送和处理后端请求，常用于后端请求各种接口时用到

- **Spring Cache**: 缓存依赖，把数据存储到缓存中，如果前端再次请求相同数据，使得后端可以从缓存中拿数据，减少了对数据库的IO操作，降低了后端服务器的压力。

- **JWT**: 令牌技术，校验用户身份。

- **阿里云OSS**: 第三方云存储技术，后端调用阿里云OSS来存储菜品等图片。

- **Swagger**: 开源框架，实现设计、构建和测试RESTful API的开源框架，但在本项目中，我们使用的是Swagger的优化版本Knife4j，它基于注解的方式注解在启动类上，在后端启动之后，在网页输入localhost 8080/doc.html就可以打开相关接口管理界面。

- **POI**: 读取和写入Microsoft Office格式文件，如Word文档、Excel电子表格和PowerPoint演示文稿。

- **WebSocket**: 一种通信协议，允许客户端与服务器进行持久化连接，并且区别于请求-响应模式，WebSocket协议实现了客户端与服务器的双向通信。

### 数据层：
- **MySQL**: 关系型存储系统，基于表的形式对数据进行存储，直接存储数据到磁盘当中

- **Redis**: 键值型存储系统，基于键值对的形式对数据进行存储，数据会被存储到缓存当中

- **Mybatis**: 开源的持久层框架，简化了java与关系型数据的之间的操作

- **pagehelper**: 分页框架，以注解的形式使用，简化分页查询中的分页查询操作

- **spring data redis**: spring框架提供的与Redis数据库进行交互的模块，简化在java中使用Redis的操作步骤。


### 工具：
- **Git**: 分布式文件管理工具，追踪管理文件变化，适用于多人开发

- **maven**: 开源的项目管理工具，用于构建和管理Java项目。它提供了一种标准化的项目结构和构建过程，使得开发人员可以更容易地管理项目依赖、构建项目、运行测试和部署应用程序

- **Junit**: Java开源单元测试框架，可以对指定方法进行单元测试，简化开发人员测试流程

- **postman**: 接口测试工具，可以便捷的代替前端对后端发送各种请求，测试接口运行效果。

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



## 项目中的工具类和其他常用的类

### BaseContext

`BaseContext`工具类在Java项目中通常用于管理线程局部变量，特别是用于在一次请求或操作过程中保持某些状态或数据。
`BaseContext`类的主要作用和特点：

1.  **线程局部变量存储**：通过`ThreadLocal<Long> threadLocal`，`BaseContext`为每个线程提供了一个独立的变量存储空间，用于存储线程特定的数据，比如用户ID、会话ID等。
    
2.  **设置当前ID**：`setCurrentId(Long id)`方法允许你为当前线程设置一个ID值。这个ID可以代表当前操作的用户ID或其他任何需要在线程内保持一致性的标识符。
    
3.  **获取当前ID**：`getCurrentId()`方法用于获取当前线程的ID值。这可以在需要识别线程上下文或用户信息时使用。
    
4.  **移除当前ID**：`removeCurrentId()`方法用于清除当前线程的ID值。这在操作结束或需要重置线程状态时非常有用。



### AliOssUtil

`AliOssUtil` 是一个用于与阿里云对象存储服务（Aliyun Object Storage Service，简称 OSS）交互的工具类。它封装了一些常用的操作，使得在Java应用程序中上传和管理文件变得更加方便。
1.  **配置OSS客户端**：`AliOssUtil` 类包含必要的字段来配置OSS客户端，包括服务的endpoint（终端节点）、accessKeyId（访问密钥ID）、accessKeySecret（访问密钥秘密）和bucketName（存储桶名称）。
    
2.  **文件上传**：类中提供了一个 `upload` 方法，该方法接受一个字节数组 `bytes` 和一个对象名称 `objectName`，将字节数据上传到指定的OSS存储桶中。
    
3.  **异常处理**：在上传过程中，`AliOssUtil` 能够处理两种类型的异常：
    
    -   `OSSException`：当请求成功到达OSS但因某些原因被OSS拒绝时抛出。
    -   `ClientException`：当客户端尝试与OSS通信时遇到严重问题（如无法访问网络）时抛出。
4.  **日志记录**：使用 `@Slf4j` 注解，`AliOssUtil` 利用SLF4J日志门面记录日志，方便跟踪和调试。
    
5.  **生成访问URL**：上传成功后，`upload` 方法会构建并返回该文件的访问URL，格式为 `https://<bucketName>.<endpoint>/<objectName>`。
    
6.  **关闭OSS客户端**：在 `finally` 块中，确保无论上传成功与否，都会关闭OSS客户端连接，释放资源。


### HttpClientUtil
`HttpClientUtil` 是一个封装了 HTTP 客户端请求的工具类，它使用 Apache HttpClient 库来发送 HTTP 请求

1.  **GET 请求**：提供 `doGet` 方法，允许你构造一个 GET 请求，包括请求参数，从指定的 URL 获取数据。
    
2.  **POST 请求**：提供 `doPost` 方法，允许你构造一个 POST 请求，包括请求参数，向指定的 URL 提交数据。
    
3.  **JSON POST 请求**：提供 `doPost4Json` 方法，专门用于发送 JSON 格式的 POST 请求。这个方法允许你传递一个包含键值对的 Map，它将这些数据构造成一个 JSON 对象，并设置请求体为这个 JSON 字符串。
    
4.  **请求配置**：通过 `builderRequestConfig` 方法配置请求的超时时间，包括连接超时、请求超时和套接字超时。
    
5.  **连接管理**：工具类中创建的 `CloseableHttpClient` 实例用于管理 HTTP 连接，请求完成后需要关闭这些连接以释放资源。
    
6.  **异常处理**：在发送请求的过程中，可能会遇到各种异常情况，如网络问题、请求错误等。`HttpClientUtil` 中的每个方法都包含了异常处理逻辑，以确保在出现异常时能够适当地处理。
    
7.  **响应处理**：对于 GET 和 POST 请求，工具类会检查响应状态码，并在状态码为 200（OK）时读取响应体内容。对于 POST 请求，还会将响应体转换为字符串并返回。

### JwtUtil
`JwtUtil` 是一个用于操作 JSON Web Tokens（JWT）的工具类。JWT 是一种用于在网络应用环境间传递声明的一种紧凑的、URL 安全的方式。
1.  **生成 JWT**：`createJWT` 方法用于生成 JWT。它接受一个秘钥（`secretKey`）、过期时间（`ttlMillis`）和一个包含额外声明的 Map（`claims`）。使用 HS256 签名算法和提供的秘钥对 JWT 进行签名。
    
2.  **设置过期时间**：在生成 JWT 时，可以指定一个过期时间，确保 JWT 在一定时间后失效。
    
3.  **自定义声明**：除了标准的声明（如 `exp` 过期时间、`iat` 发行时间等），还可以添加自定义的声明到 JWT 中。
    
4.  **Token 解密**：`parseJWT` 方法用于解析（解密）一个已存在的 JWT。它需要相同的秘钥来验证签名，并返回一个包含 JWT 声明的 `Claims` 对象。
    
5.  **安全性**：使用 JWT 时，秘钥（`secretKey`）必须保密，不能暴露给客户端。如果秘钥泄露，JWT 的签名可以被伪造。
    
6.  **序列化和反序列化**：`JwtUtil` 可以处理 JWT 的序列化（生成）和反序列化（解析）过程。
    
7.  **标准库支持**：使用 `io.jsonwebtoken` 库提供的方法和类，如 `Jwts`、`JwtBuilder`、`Claims` 等，来构建和解析 JWT。

### WechatPayUtil
`WechatPayUtil` 是一个封装了微信支付功能的 Java 类，它提供了与微信支付 API 交互的方法。
1.  **微信支付下单**：提供了 `jsapi` 方法，用于生成小程序支付需要的预支付交易会话标识（prepay_id）。
    
2.  **小程序支付**：`pay` 方法用于处理小程序支付流程，包括调用 `jsapi` 方法生成预支付交易会话，然后构造小程序调起支付所需的参数。
    
3.  **申请退款**：`refund` 方法封装了向微信支付申请退款的功能，可以提交商户订单号、商户退款单号、退款金额和原订单金额进行退款操作。
    
4.  **发送 HTTP 请求**：类中提供了 `post` 和 `get` 方法，用于发送 POST 和 GET HTTP 请求，这是与微信支付服务器通信的基础。
    
5.  **签名和验签**：微信支付接口通常需要对请求进行签名，并验证响应的签名。`WechatPayUtil` 类通过 `getClient` 方法获取配置好的 `CloseableHttpClient` 实例，该实例自动处理签名和验签。
    
6.  **配置管理**：通过 `WeChatProperties` 类注入微信支付所需的配置信息，如商户 ID、API 密钥、证书路径等。
    
7.  **错误处理**：在与微信支付 API 交互的过程中，可能会遇到各种错误情况。`WechatPayUtil` 需要能够处理这些错误，并反馈给调用者。
    
8.  **安全性**：涉及到支付的类需要特别注意安全性，确保所有的请求都是在安全的通道（如 HTTPS）中进行，并且敏感信息如私钥和证书要妥善保管。

### BaseException
`BaseException` 是一个自定义的异常类，它继承自 Java 的 `RuntimeException`。
1.  **继承 RuntimeException**：由于 `BaseException` 继承自 `RuntimeException`，它是一个非受检异常（unchecked exception），这意味着在编译时，Java 编译器不会强制调用者处理这种异常（例如通过 `try-catch` 块或 `throws` 子句）。
    
2.  **构造函数**：`BaseException` 提供了两个构造函数。一个是无参构造函数，用于在不需要额外信息时抛出异常。另一个是接受一个字符串参数的构造函数，该字符串作为异常消息，用于提供有关异常的更多信息。
    
3.  **业务异常处理**：`BaseException` 通常用于封装业务逻辑中的错误情况，比如用户输入无效、请求的资源不存在、操作权限不足等。
    
4.  **异常链**：通过在构造函数中使用 `super(msg)`，`BaseException` 可以保留原始异常的消息，这有助于在异常链中维护异常的上下文信息。
    
5.  **自定义异常处理**：在应用程序中，可以通过全局异常处理器（如 Spring 的 `@ControllerAdvice`）捕获并处理 `BaseException`，然后根据异常类型返回相应的错误响应。
    
6.  **易于扩展**：如果需要，可以继续扩展 `BaseException` 来创建更具体的异常类，以适应不同的业务场景。

### JsonObjectMapper
`JsonObjectMapper` 是一个基于 Jackson 库实现的对象映射器类，它的作用是将 Java 对象转换为 JSON 格式的字符串（序列化），或者将 JSON 字符串转换为 Java 对象（反序列化）。
1.  **继承 ObjectMapper**：`JsonObjectMapper` 继承自 Jackson 库中的 `ObjectMapper` 类，扩展了其功能以满足特定的序列化和反序列化需求。
    
2.  **配置日期格式**：通过定义 `DEFAULT_DATE_FORMAT`、`DEFAULT_DATE_TIME_FORMAT` 和 `DEFAULT_TIME_FORMAT` 常量，为日期和时间类型的序列化和反序列化设置了默认格式。
    
3.  **自定义序列化和反序列化**：通过创建 `SimpleModule` 并添加自定义的序列化器和反序列化器，`JsonObjectMapper` 能够处理 Java 8 的日期时间类型（如 `LocalDate`、`LocalDateTime` 和 `LocalTime`）。
    
4.  **忽略未知属性**：
通过调用 `configure(FAIL_ON_UNKNOWN_PROPERTIES, false)` 方法，当反序列化时遇到 JSON 中的未知属性，不会抛出异常，而是简单地忽略它们。
    
5.  **注册模块**：通过 `registerModule(simpleModule)` 方法，将自定义的序列化和反序列化规则注册到 `ObjectMapper` 中。
    
6.  **序列化和反序列化方法**：虽然具体的序列化和反序列化方法没有在代码中显示，但继承自 `ObjectMapper` 的方法（如 `writeValueAsString` 用于序列化，`.readValue` 用于反序列化）可以在 `JsonObjectMapper` 中使用。
    
7.  **配置的灵活性**：`JsonObjectMapper` 可以根据需要配置更多的序列化特性，比如是否需要格式化输出、是否允许单引号等。

### 返回结果封装类和分页封装类

#### Result
`Result` 是一个用于封装 API 响应的 Java 类，它通常用于统一定义后端服务的返回格式。
1.  **泛型数据封装**：`Result` 是一个泛型类 `<T>`，这意味着它可以包含任何类型的数据（`data` 字段）。
    
2.  **状态码**：`code` 字段表示操作的状态。通常，`1` 表示成功，`0` 和其它数字表示失败。
    
3.  **错误信息**：`msg` 字段用于提供错误或状态信息的描述。
    
4.  **数据携带**：`data` 字段用于携带返回的数据，可以是对象、集合或任何其他 Java 类型。
    
5.  **静态工厂方法**：`Result` 类提供了几个静态方法来快速创建实例：
    
    -   `success()`：创建一个状态码为 `1` 的成功响应实例。
    -   `success(T object)`：创建一个包含数据的成功的响应实例。
    -   `error(String msg)`：创建一个包含错误信息的失败响应实例。
#### PageResult
`PageResult` 是一个专门用于封装分页查询结果的 Java 类。在处理分页数据时，它能够提供关于数据集的总记录数以及当前页的数据集合。
1.  **泛型数据集合**：`records` 字段是一个泛型列表 `List<T>`，用于存储当前页的数据记录。
    
2.  **总记录数**：`total` 字段是一个 `long` 类型的值，表示数据集中的总记录数。
    
3.  **序列化支持**：`PageResult` 实现了 `Serializable` 接口，这意味着它的实例可以被序列化和反序列化，便于在网络上传输或者存储。
    
4.  **简洁的构造函数**：使用 Lombok 库的 `@Data`、`@AllArgsConstructor` 和 `@NoArgsConstructor` 注解，`PageResult` 类自动生成了 get/set 方法、全参构造函数和无参构造函数，简化了代码的编写。



### 配置类

#### OssConfiguration
`OssConfiguration` 是一个 Spring Boot 的配置类，用于创建和管理与阿里云对象存储服务（Aliyun OSS）相关的 Bean。

1.  **@Configuration 注解**：这个注解标记了 `OssConfiguration` 类作为一个配置类，Spring Boot 在启动时会自动扫描并注册此类中定义的 Bean。
    
2.  **@ConditionalOnMissingBean 注解**：在 `aliOssUtil` Bean 的定义上使用了 `@ConditionalOnMissingBean` 注解，这意味着如果应用程序的 Spring 应用上下文中已经存在相同类型的 Bean，则不会创建 `aliOssUtil` Bean。这提供了一种自动配置的机制，允许开发者自定义配置。
    
3.  **@Bean 注解**：`aliOssUtil` 方法上使用了 `@Bean` 注解，这告诉 Spring 这个方法将创建一个 Bean，并将其注册到 Spring 应用上下文中。
    
4.  **依赖注入**：`aliOssUtil` 方法通过参数接收 `AliOssProperties` Bean，这是一个包含 OSS 配置属性的 Bean，如端点、访问密钥 ID、访问密钥密文和存储桶名称。
    
5.  **日志记录**：使用 SLF4J 的 `log` 对象记录日志，提供有关配置过程的反馈信息。
    
6.  **创建 AliOssUtil 实例**：`aliOssUtil` 方法使用 `AliOssProperties` 中的配置信息来创建 `AliOssUtil` 类的实例。`AliOssUtil` 是一个工具类，封装了与 OSS 交互的方法，如文件上传等。


#### RedisConfiguration
`RedisConfiguration` 是一个 Spring Boot 配置类，它用于设置和自定义应用程序中 Redis 操作的相关配置。

1.  **@Configuration 注解**：这个注解表明 `RedisConfiguration` 是一个 Spring Boot 配置类，Spring Boot 在初始化时会自动扫描并应用此类中定义的所有配置。
    
2.  **@Bean 注解**：标记方法用于声明一个新 Bean。在 `RedisConfiguration` 中，`redisTemplate` 方法被标记为 `@Bean`，这意味着该方法的返回值将被注册为 Spring 应用上下文中的一个 Bean。
    
3.  **RedisTemplate 配置**：`redisTemplate` 方法创建并配置了 `RedisTemplate` 对象，这个对象是 Spring Data Redis 用于操作 Redis 的核心组件。
    
4.  **连接工厂注入**：方法参数 `RedisConnectionFactory` 是 Spring Data Redis 用于创建和配置 Redis 连接的工厂类。通过依赖注入，Spring 会提供合适的连接工厂实例。
    
5.  **设置序列化器**：`RedisTemplate` 默认使用 `StringRedisSerializer` 作为键的序列化器，这确保了所有的 Redis 键都以字符串形式序列化。
    
6.  **日志记录**：使用 SLF4J 的 `log` 对象记录日志，以提供配置过程中的反馈信息。
    
7.  **自定义 RedisTemplate 配置**：如果需要，开发者可以在 `RedisConfiguration` 类中进一步自定义 `RedisTemplate` 的配置，例如设置不同的值序列化器、更改连接参数等。

#### WebConfiguration
`WebConfiguration` 是一个 Spring Boot 的配置类，它用于自定义和注册 Web 层相关的组件，如拦截器、消息转换器、静态资源处理以及 Swagger 文档生成等。

1.  **@Configuration 和 @Slf4j 注解**：`@Configuration` 标记这个类为 Spring Boot 配置类，`@Slf4j` 用于简化日志记录。
    
2.  **继承 WebMvcConfigurationSupport**：通过继承 `WebMvcConfigurationSupport`，`WebConfiguration` 获得了 Spring MVC 的配置能力。
    
3.  **注册自定义拦截器**：通过 `addInterceptors` 方法注册自定义拦截器，例如 `JwtTokenAdminInterceptor` 和 `JwtTokenUserInterceptor`，这些拦截器可以用于处理身份验证和授权。
    
4.  **Swagger 文档生成**：使用 `@Bean` 注解注册 Swagger 的 `Docket` Bean，用于生成和管理 API 文档。可以为不同的 API 分组创建不同的 `Docket` 实例。
    
5.  **静态资源映射**：通过 `addResourceHandlers` 方法添加静态资源的映射规则，例如 Swagger UI 的 `doc.html` 和 Webjars 资源。
    
6.  **自定义消息转换器**：通过 `extendMessageConverters` 方法扩展 Spring MVC 的消息转换器，例如使用自定义的 `JacksonObjectMapper` 来序列化和反序列化 JSON 数据。
    
7.  **依赖注入**：使用 `@Autowired` 注解自动注入配置类中需要的组件，如拦截器。
    

### GlobalExceptionHandler
`GlobalExceptionHandler` 是一个 Spring Boot 应用程序中用于全局异常处理的配置类。它通过使用 `@RestControllerAdvice` 注解来捕获和处理控制器层（Controller）抛出的异常。

1.  **@RestControllerAdvice 注解**：这个注解表明该类是一个全局异常处理类，它将捕获所有控制器层的异常。
    
2.  **@ExceptionHandler 注解**：这个注解用于标记能够处理特定类型异常的方法。在 `GlobalExceptionHandler` 中，可以定义多个这样的方法来处理不同类型的异常。
    
3.  **业务异常处理**：通过定义一个方法来捕获自定义的业务异常（如 `BaseException`），并返回一个错误响应（通常是 `Result.error`）。
    
4.  **SQL 异常处理**：通过定义一个方法来捕获 SQL 相关的异常，例如 `SQLIntegrityConstraintViolationException`，这通常表示数据库层面的约束违反，如尝试插入重复的数据。
    
5.  **日志记录**：使用 SLF4J 的 `log` 对象记录异常信息，便于开发者调试和追踪问题。
    
6.  **错误信息返回**：在异常处理方法中，通常会返回一个包含错误信息的 `Result` 对象，这样前端就可以根据这些信息给用户相应的提示。
    
7.  **自定义错误信息**：可以自定义错误信息，如使用 `MessageConstant` 常量类来管理错误信息，使得错误信息更加统一和易于管理。



### JwtTokenAdminInterceptor
`JwtTokenAdminInterceptor` 是一个 Spring MVC 拦截器，用于处理与 JWT（JSON Web Tokens）相关的认证工作，特别是针对管理员端的请求。

1.  **@Component 注解**：这个注解表明 `JwtTokenAdminInterceptor` 是一个 Spring 组件，Spring 容器会自动管理这个类的实例。
    
2.  **@Slf4j 注解**：用于简化日志记录，提供日志功能。
    
3.  **实现 HandlerInterceptor 接口**：通过实现 `HandlerInterceptor` 接口，`JwtTokenAdminInterceptor` 能够拦截请求并执行预处理、后处理和后置处理。
    
4.  **@Autowired 注解**：用于自动注入 `JwtProperties` 类的实例，该类可能包含 JWT 相关的配置信息，如密钥。
    
5.  **preHandle 方法**：这是 `HandlerInterceptor` 接口的一个方法，用于在请求被处理之前执行。在这个方法中，`JwtTokenAdminInterceptor` 会进行 JWT 的验证。
    
6.  **从请求头获取令牌**：`preHandle` 方法从 HTTP 请求头中获取 JWT。
    
7.  **校验 JWT**：使用 `JwtUtil` 工具类中的 `parseJWT` 方法对获取的 JWT 进行解析和验证。
    
8.  **设置上下文信息**：如果 JWT 验证成功，从 JWT 中提取信息（如员工ID），并使用 `BaseContext` 工具类将其设置为当前线程的上下文信息。
    
9.  **异常处理**：如果 JWT 验证失败，响应 HTTP 状态码 401（未授权）。
 
## 项目运用的技术
###  JWT令牌加密技术：
**JSON Web Token**是一种用于身份验证和授权的开放标准。它由三部分组成，分别是头部（Header）、载荷（Payload）和签名（Signature）。其中，签名是用于验证令牌的完整性和可信任性。

 使用JWT进行令牌加密可以确保令牌的安全性和完整性，防止被篡改或伪造。具体选择哪种加密方式取决于安全需求和性能要求，开发者可以根据具体场景选择合适的加密技术。同时，还需要注意保护私钥的安全，以防止密钥泄露导致令牌被篡改。
### Nginx负载均衡和反向代理
#### 负载均衡：
   Nginx 的负载均衡功能允许将请求分发给多个应用服务器，以均衡负载和提高系统的可扩展性和可靠性。下面是一些常用的 Nginx 负载均衡配置方法：

   - 轮询（Round Robin）：这是默认的负载均衡策略。Nginx 将请求依次分发给每个后端服务器，确保每个服务器都能获得相同的请求数量。

 - IP 哈希（IP Hash）：Nginx 使用客户端 IP 地址的哈希值来决定将请求发送给哪个后端服务器。这种方式可以确保同一客户端的请求始终发送到同一个后端服务器，适用于某些需要会话保持的场景。

  -  加权轮询（Weighted Round Robin）：可以为每个后端服务器设置权重，高权重的服务器将获得更多的请求。这种方式可以根据服务器的性能和处理能力来分配负载。

-   最少连接（Least Connections）：Nginx 根据当前连接数来选择最空闲的后端服务器，将请求发送给它。这样可以确保负载更均衡，避免某些服务器过载。

 
  #### 反向代理

 - 有反向代理就有正向代理，而二者的区别很明显：*反向代理隐藏服务器，正向代理隐藏客户端*
    - 正向代理是客户端发送请求后通过代理服务器访问目标服务器，代理服务器代表客户端发送请求并将响应返回给客户端。正向代理隐藏了客户端的真实身份和位置信息，为客户端提供代理访问互联网的功能。

    - 反向代理是位于目标服务器和客户端之间的代理服务器，它代表服务器接收客户端的请求并将请求转发到真正的目标服务器上，并将得到的响应返回给客户端。反向代理隐藏了服务器的真实身份和位置信息，客户端只知道与反向代理进行通信，而不知道真正的服务器。

  **反向代理可以缓存后端响应，使得相同的请求不需要再次发送到服务器，有效降低了服务器的访问压力**
  ### MD5加密登录：

- 为了防止数据库泄露带来的用户账号密码安全性问题，我们即使是在数据库中也不会进行明文存储密码，而是存储**MD5加密**方法加密后的一串字符串。

- 基于MD5的特性，我们在验证用户密码是否正确的时候，思路是：**把用户输入的密码与正确密码加密后得到的MD5字符串进行比较**，如果相同则说明得到的是正确的密码。
 ### 使用基于Swagger的Knife4j注解
  Knife4j是Swagger的一个增强工具，是基于Swagger构建的一款功能强大的文档工具。它提供了一系列注解，用于增强对API文档的描述和可视化展示。

以下是一些常用的Knife4j注解介绍：
   -  **@Api**：用于对Controller类进行说明和描述，可以指定Controller的名称、描述、标签等信息。

   - **@ApiOperation**：用于对Controller中的方法进行说明和描述，可以指定方法的名称、描述、请求方法（GET、POST等）等信息。
  -   **@ApiImplicitParam**：用于对方法的参数进行说明和描述，可以指定参数的名称、描述、数据类型、是否必须等信息。
  -   **@ApiModel**：用于对请求或响应的数据模型进行说明和描述，可以指定模型的名称、描述、属性等信息。
  -   **@ApiModelProperty**：用于对模型的属性进行说明和描述，可以指定属性的名称、描述、数据类型、示例值等信息。
   -  **@ApiParam**：用于对方法的参数进行说明和描述，可以指定参数的名称、描述、数据类型、是否必须等信息。
这些注解可以在Spring Boot项目中与Swagger集成使用，通过使用这些注解，可以在生成的API文档中提供更详尽的说明和描述。同时，Knife4j还提供了一些自定义配置。

### ThreadLocal：
   - ThreadLocal是Java中的一个线程本地变量，它可以为每个线程提供一个独立的变量副本。线程本地变量意味着每个线程都拥有自己的变量副本，互不影响。

- ThreadLocal的主要作用是在多线程环境下提供线程安全的变量访问。它常用于解决线程间数据共享的问题，特别是在并发编程中，当多个线程需要使用同一个变量时，可以使用ThreadLocal确保每个线程访问的都是自己的变量副本，从而避免了线程安全问题。

- 使用ThreadLocal的主要步骤如下：
    - 创建ThreadLocal对象：可以通过ThreadLocal的静态方法ThreadLocal.withInitial()来创建ThreadLocal对象，并初始化变量的初始值。

    - 设置变量值：通过ThreadLocal对象的set()方法可以设置当前线程的变量副本的值。

    - 获取变量值：通过ThreadLocal对象的get()方法可以获取当前线程的变量副本的值。

    - 清除变量值：通过ThreadLocal对象的remove()方法可以清除当前线程的变量副本的值，释放资源。

### 基于PageHelper的分页查询：

  - PageHelper是基于java的一个开源框架，用于在MyBatis等持久层框架中方便地进行分页查询操作。它提供了一组简单易用的API和拦截器机制，可以帮助开发者快速集成和使用分页功能。

- PageHelper的主要功能包括：

    - 分页查询支持：PageHelper提供了直接在SQL语句中添加分页相关的信息，如页码、每页记录数等，从而实现分页查询功能。

    - 参数解析和设置：PageHelper可以解析传入的查询参数，并自动设置分页的相关参数，无需手动计算和设置。

    - SQL拦截器：PageHelper通过自定义的SQL拦截器拦截和处理查询SQL，自动添加分页的SQL语句，实现分页查询。

    - 排序支持：PageHelper还提供了对排序的支持，可以在分页查询中指定排序字段和排序方式。

    - 分页信息返回：PageHelper会将查询结果封装在一个Page对象中，包含了分页的相关信息，如总记录数、总页数等。

- PageHelper的底层原理是拦截，拦截需要进行分页查询的SQL请求，读取用户传入参数，自主构造分页SQL语句。

### 基于注解和AOP的公共字段填充：
通过注解的方式**标记方法**，利用AOP思想创建一个切面，在切面中实现对标记方式中字段的填充，然后再运行原方法。这样就实现了在**不改动**原方法的前提下，实现了对代码的优化升级。
- 创建一个注解： **AutoFill**

注解的作用：使用在mapper层，标记对数据库的操作类型。这里是因为公共字段的填充只有修改和新增这两个类业务。需要准确的拦截这两个数据库层面的操作，在切面中完成对公共字段的填充。

- 其次完成切面的代码


- 通过反射的思想进行字段赋值。

- 过程总结为两步

    - 自定义注解（标记类型），通过注解快速标记目标方法
    - 完成切面的逻辑代码，通过切入点表达式快速捕捉需要进行切入的方法，对这些方法进行处理
    ### 阿里云OSS云存储服务：
 - 这是阿里巴巴为我们提供了一项云存储服务。我们通过这项技术来存储菜品，套餐，员工的图片。之所以不存到本地，这是因为前端无法回调服务器的本地图片，这也就造成我们只能存图片，无法回显图片的BUG，而我们如果调用阿里云的云存储服务，照片存储到阿里巴巴的云之后，会返送一个URL，我们通过这段URL就可以回调图片。
 - 在云存储服务中，还有两个小知识点：

> 1.使用UUID生成文件名

我们需要使用UUID来为上传到阿里云OSS的图片命名。而阿里云图片命名不允许重复，否则就会覆盖。因此我们使用UUID来生成一串随机数，这样就确保了文件不被新文件覆盖。

> 2.不要把配置类写死

### 对方法开启事务：

 随着业务操作的增加，对任何一张表的修改可能对会影响到其他的表，例如我们在插入dish中的菜品的时候，也应该一并插入dish_flavor中该菜品的对应的口味。

而这两张表的数据的插入，应该是确保都完成的，不可以出现只插入了菜品或者只插入了口味的情况。因此我们要把对这两张表的操作设置为一个事务。

而使用方式也非常简单：

- 在启动类上方添加@EnableTransactionManagement

 - 开启事务注解之后，我们只需要在需要捆绑成为一个事务的方法上添加@Transactional 

  - 这样就把对两张表的操作捆绑成为了一个事务。

最后再介绍一些@Transactional 的常见属性

   - **value**：可以用于指定事务管理器的名称或ID，用来管理当前方法的事务。例如：@Transactional(value = "transactionManager")。
    - **readOnly**：用于指定事务是否是只读的。如果将 readOnly 设置为 true，则事务只能进行读操作，而不能进行写操作。默认值为 false。
    - **timeout**：用于指定事务的超时时间，单位为秒。在指定的时间内，如果事务还未提交或回滚，则事务将被强制回滚。
   - **isolation**：用于指定事务的隔离级别。常见的隔离级别包括 DEFAULT、READ_UNCOMMITTED、READ_COMMITTED、REPEATABLE_READ 和 SERIALIZABLE。
    - **propagation**：用于指定事务的传播行为。常见的传播行为包括 REQUIRED、REQUIRES_NEW、SUPPORTS、NOT_SUPPORTED、NEVER 和 MANDATORY。
    - **rollbackFor**：用于指定需要回滚事务的异常类型数组。当方法抛出指定的异常时，事务将被回滚。
    - **noRollbackFor**：用于指定不需要回滚事务的异常类型数组。当方法抛出指定的异常时，事务将不会被回滚
    
   ### Redis：

Redis（Remote Dictionary Server）是一个开源的内存存储系统，常用于构建高性能、高可扩展性的应用程序。它支持多种数据结构，如字符串、哈希表、列表、集合、有序集合等，并提供了丰富的操作命令，使开发人员能够快速、灵活地处理数据。
#### 利用Redis来对业务优化：

用户一旦点进店铺，店铺就需要向用户展示菜品，套餐等等数据。这种通过少量的操作可以调起大量后端操作的行为，是一个很危险的杠杆操作。而在高并发环境下，这无疑又是在拷打服务器。

而且这种重复查询的请求，正是我们要优化的目标。

我们的思路很简单：缓存请求相应内容，如果小程序又发送相同请求，那么我们就从缓存中直接返回相应内容。这样就减少了直接对后端的数据库的查询。

而这句话中，解决问题的重点两个字就可以概括：缓存！

这与我们上面讲到的Redis的职能岂不是相同嘛？我们在初识Redis的时候就说过：Redis是高性能的，基于键值对的，写入缓存的 内存存储系统。
 ### 利用Spring cache来对业务进行优化：

- Spring Cache 是 Spring Framework 提供的缓存抽象和实现框架。它为应用程序提供了一种统一的缓存抽象，支持多种缓存技术的集成，并支持 AOP 机制实现基于方法的缓存，从而简化了缓存的使用和管理。

- 下面是 Spring Cache 的一些特点和常用功能：

    - 缓存技术支持：Spring Cache 支持多种主流的缓存技术，包括 EHCache、Redis、Guava 等。

    - 基于注解的缓存：Spring Cache 提供了基于注解的缓存，可以在方法上直接使用 @Cacheable、@CachePut、@CacheEvict 等注解，实现对方法结果的自动缓存和更新
 - 简单的说：它也是一种缓存技术，使得所用工具不局限于Redis。相比较于使用Redis的时候需要把相关代码内嵌到方法体种，Spring Cache是一种基于注解方式来达到内嵌代码相同的效果。
 - ### Httpclient：

**Httpclient**是一个服务器端进行HTTP通信的库，他使得后端可以发送各种HTTP请求和接收HTTP响应，使用HTTPClient，可以轻松的发送GET,POST,PUT,DELETE等各种类型的的请求
### 微信登录接口：
 - **1.** 我们的小程序会调用wx.login()来获得一个code。该 code 的作用是用于后续的用户身份验证和获取用户信息。

 - **2.** 小程序的wx.request会把code发送给后端，后端再打包自己的小程序ID（appid）和小程序密钥(appsecert) 最后加上小程序发送给自己的code，利用Httpclient从后端发送给微信接口服务。而微信接口服务会在校验之后返回session_key和openid
 - **3.** 在后端获取到微信接口服务发送给自己的session_key和openid，**自定义用户登录态**，并且发送给小程序
 - **4.** 小程序把后端发送过来的自定义登录态存入到storge中
 ### 微信支付接口：
 - 1.用户进入小程序下单 ，小程序会发送下单请求给商家系统后台，商家后端会生成平台订单，请求微信支付系统的下单接口，创建订单。微信支付系统接收到商家系统后台的请求后，会生成预付单，并且返回预付单标识给商家系统后台，此时商户系统后台利用算法生成带签名支付信息，并且把相关支付参数返回给商家小程序

- 2.当小程序接收到相关的参数之后，就会调用wx.requestPayment发起微信支付，此时小程序会先向微信支付系统发送请求，检查当前用户身份，微信支付系统在检验当前用户符合权限之后，会给小程序返回支付授权，允许小程序调起支付页面。

- 3.当小程序调起支付页面之后，用户输入密码确定支付，此时微信小程序会打包相关参数给微信支付系统，校验身份通过之后，就异步通知平台支付交易结果给商家后端，商家后端对其进行保存通知处理，并且在这同时返回支付结果，并且发送微信消息提醒。 

- 4.上述已经完整的介绍了一次微信小程序调用微信支付的具体过程。如果我们后续要查询判断微信支付结果，就在后端调用查寻订单接口，查询支付结果。而微信支付平台就会为商家后端返送支付结果，供我们进行各种判断。
### Spring Task：

 - Spring Task 是 Spring 框架提供的一种任务调度工具，用于在应用程序中执行定时任务或者周期性任务。它基于线程池机制，可以创建并管理多个线程来执行任务。

- 通过 Spring Task，开发人员可以通过注解或者配置的方式定义需要执行的任务，并设置执行的时间间隔或者执行时间点。Spring Task 提供了灵活的任务调度能力，可以满足各种任务执行的需求，例如定时的数据同步、定时的报表生成、定时的缓存清理等。

- 简单的说：Spring Task为我们提供了一种基于注解的方式来使得我们的后端具有定时处理任务的能力，这项功能可以说是十分常见：我们CSDN的每日周报，就是定时任务。
 > 而这项工具，在我们的项目中的主要作用是：**处理异常订单** 
在我们的数据库中，总会有一些异常订单，例如用户一直未点击送达的订单，而我们需要对这些订单进行集中的处理。

### 引入Websocket来实现用户端和商家端通信：

在项目中，有外卖催单和来单提醒这两个功能。

这两个业务功能的逻辑思路很简单：

    用户端下单或者催单后，发送特定请求到后端，后端再发送请求到商家端，商家端再根据后端的请求判断是催单还是来单提醒。

在这种思路中我们发现最关键的就在于：后端如何与商家端建立链接，实现实时通信？

基于这样的一个问题，我们使用了：Websocket   来实现这关键点：

- WebSocket 是一种在 Web 应用程序中实现双向通信的协议。它允许客户端和服务器之间建立持久的、双向的通信通道，使得服务器可以主动向客户端推送消息，而无需客户端发送请求。

- 传统的 HTTP 协议是一种请求-响应模式，客户端需要定期发送请求并等待服务器的响应。但在某些场景下，需要实时地将数据推送给客户端，如聊天应用、实时数据监控等。这时就可以使用 WebSocket 协议。

- WebSocket 协议通过在客户端和服务器之间建立一个持久的连接，实现了双向通信。它使用 HTTP 升级请求来升级到 WebSocket 连接，并在连接建立后，使用轻量级的帧来传递数据。与 HTTP 相比，WebSocket 具有更低的开销和更高的性能。

- 使用 WebSocket，客户端和服务器之间可以实时地发送消息和接收消息，不需要频繁地发起请求。这样可以减少网络流量和延迟，并提供更好的用户体验。在开发中，可以使用各种编程语言和框架来实现 WebSocket，如Java中的Spring WebSocket、Node.js中的Socket.io等。
### Apache POI技术实现导出文件：

Apache POI（Poor Obfuscation Implementation）是一个用于处理Microsoft Office格式文档的开源Java库。POI提供了一组可以读取、写入和操作各种Office文件的API，包括Word文档（.doc和.docx）、Excel电子表格（.xls和.xlsx）以及PowerPoint演示文稿（.ppt和.pptx）。

通过POI，开发者可以在Java应用程序中读取和编辑Office文档，实现对文档内容、样式、格式和元数据的操作。它提供了向现有文档添加新内容、修改现有内容、删除内容以及进行格式设置和样式调整等功能。

而在本项目中，我们并不使用ApachePOI建表，这样无疑是在拷打自己。我们的想法是直接就提供一张创建好的模板表，这样我们只需要使用ApachePOI来实现填充数据就好了。
