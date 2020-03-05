package enjoy.timeTrack.service;

import org.springframework.stereotype.Service;

@Service
public class ErrorCodeService {
    public String errorCode(int errorCode) {
        if (errorCode == 1001) {
            return "Girmiş olduğunuz kullanıcı adı veya e-mail adresi başka bir kullanıcı tarafından kullanılmaktadır." +
                    "Lütfen tekrar deneyiniz.";
        }
        else if (errorCode == 1002) {
            return "Kullanıcı adınız veya şifreniz hatalı. Lütfen tekrar deneyiniz.";
        }
        else if (errorCode == 1003) {
            return "Masa numarası kullanılmaktadır. Yeni bir masa numarası giriniz.";
        }
        return null;
    }
}