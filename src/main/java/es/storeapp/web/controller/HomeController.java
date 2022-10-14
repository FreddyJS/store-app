package es.storeapp.web.controller;

import es.storeapp.business.entities.Category;
import es.storeapp.business.services.ProductService;
import es.storeapp.common.Constants;
import java.text.MessageFormat;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    @Autowired
    private ProductService productService;
    
    @GetMapping(value = {Constants.ROOT_ENDPOINT})
    public String doGetHome(Model model, HttpServletResponse response) {
        List<Category> categories = productService.findHighlightedCategories();
        model.addAttribute(Constants.CATEGORIES, categories);
        if(logger.isDebugEnabled()) {
            logger.debug(MessageFormat.format("Home categories: {0}", categories));
        }
        response.setHeader("Content-Security-Policy", 
            "default-src * 'self'; "+
            "script-src  * 'self' 'unsafe-eval' 'unsafe-inline'; "+
            "style-src   * 'self' 'unsafe-inline';");
        return Constants.HOME_PAGE;
    }
}
