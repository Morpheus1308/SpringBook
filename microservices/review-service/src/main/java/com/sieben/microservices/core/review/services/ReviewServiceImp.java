package com.sieben.microservices.core.review.services;

import com.sieben.api.core.review.Review;
import com.sieben.api.core.review.ReviewService;
import com.sieben.util.http.ServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReviewServiceImp implements ReviewService {

    private final ServiceUtil serviceUtil;
    @Autowired
    public ReviewServiceImp(ServiceUtil serviceUtil){
        this.serviceUtil = serviceUtil;
    }

    @Override
    public List<Review> getReviews(int productId) {
        List<Review> recommendations = new ArrayList<>();
        recommendations.add(new Review(productId, 123, "author of review", "subject", "content of review", serviceUtil.getServiceAddress()));
        return recommendations;
    }
}
