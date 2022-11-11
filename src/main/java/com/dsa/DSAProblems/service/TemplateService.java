package com.dsa.DSAProblems.service;

import org.springframework.stereotype.Service;
import utils.TemplateData;
import utils.TemplateGenerator;

@Service
public class TemplateService {
    public TemplateData createTemplate(TemplateData templateData) {
        new TemplateGenerator(templateData);
        return templateData;
    }
}
