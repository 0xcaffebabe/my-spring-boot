package wang.ismy.spring.boot;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author MY
 * @date 2020/1/21 15:54
 */
public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * spring 相关配置
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    /**
     * spring mvc 相关配置
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
