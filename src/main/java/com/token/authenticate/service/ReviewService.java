package com.token.authenticate.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewService {


    public String write() {
        return "리뷰가 등록되었습니다.";
    }
}
