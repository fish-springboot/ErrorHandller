# SpringBoot的错误处理

url not found

throw exception

org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration
中定义了bean

如果发生4xx,5xx的错误，就会交给这个Controller处理

```java
	@Bean
	@ConditionalOnMissingBean(value = ErrorController.class, search = SearchStrategy.CURRENT)
	public BasicErrorController basicErrorController(ErrorAttributes errorAttributes) {
		return new BasicErrorController(errorAttributes, this.serverProperties.getError(), this.errorViewResolvers);
	}
```

```java
@Controller
@RequestMapping("${server.error.path:${error.path:/error}}")
public class BasicErrorController extends AbstractErrorController {
    
}
```
path = server.error.path != null ? server.error.path : (error.path != null ? error.path : error)

可以通过自己继承ErrorController的方式代替默认的配置

