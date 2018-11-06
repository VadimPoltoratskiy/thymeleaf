package com.thymeleaf.course.controller;

import com.thymeleaf.course.domain.model.entity.Company;
import com.thymeleaf.course.domain.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
//@RequestMapping(value = "/api/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    /* TODO You need to implement endpoint here. */
    /* TODO Endpoint should be map by Get method. You need to retrieve data from service, and return it to the 'company.html'. */
    @RequestMapping(value="/companies", method = RequestMethod.GET)
    public String getCompanies(ModelMap model) {
        List<Company> companyList = companyService.getAllCompanies();
        model.put("companyList", companyList);
        return "showCompanies";
    }


}
