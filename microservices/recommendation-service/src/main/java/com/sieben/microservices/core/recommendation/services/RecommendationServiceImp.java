package com.sieben.microservices.core.recommendation.services;

import com.sieben.api.core.recommendation.Recommendation;
import com.sieben.api.core.recommendation.RecommendationService;
import com.sieben.util.http.ServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RecommendationServiceImp implements RecommendationService {

    private final ServiceUtil serviceUtil;

    @Autowired
    public RecommendationServiceImp(ServiceUtil serviceUtil){
        this.serviceUtil = serviceUtil;
    }
    @Override
    public List<Recommendation> getRecommendations(int productId) {
        List<Recommendation> recommendations = new ArrayList<>();
        recommendations.add(new Recommendation(productId, 123, "author", 4, "the contents", serviceUtil.getServiceAddress()));
        return recommendations;
    }
}
