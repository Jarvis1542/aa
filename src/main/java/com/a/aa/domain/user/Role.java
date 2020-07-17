package com.a.aa.domain.user;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    일반("ROLE_GUEST", "일반"), // 권한 코드에 항상 ROLE_이 앞에 있어야함.
    전문가("ROLE_USER", "전문가"); // 그래서 코드별 키 값을 ROLE_GUEST, ROLE_USER 등으로 지정

    private final String key;
    private final String title;
}