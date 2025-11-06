package com.likelion.likelionjwt.oauth.api;

import com.likelion.likelionjwt.oauth.api.dto.Token;
import com.likelion.likelionjwt.oauth.application.AuthLoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/login/oauth2")
public class AuthLoginController {

    private final AuthLoginService authLoginService;

    /*@GetMapping("/code/{registrationId}")
    public void kakaoLogin(@RequestParam(name = "code", required = true) String code, @PathVariable(value = "registrationId") String registrationId) {
        authLoginService.socialLogin(code, registrationId); }*/

    @GetMapping("/code/kakao")
    public Token kakaoCallbck(@RequestParam("code") String code) {
        return authLoginService.kakaoLoginOrSignUp(code);
    }
}
