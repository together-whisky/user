package together_whisky.user.util;

import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;

public class Argon2PasswordUtil {

    private static final int SALT_LENGTH = 16;
    private static final int HASH_LENGTH = 32;
    private static final int PARALLELISM = 1;
    private static final int MEMORY = 65536;
    private static final int ITERATIONS = 3;

    private static final Argon2PasswordEncoder encoder =
        new Argon2PasswordEncoder(SALT_LENGTH, HASH_LENGTH, PARALLELISM, MEMORY, ITERATIONS);

    //인스턴스화 방지
    private Argon2PasswordUtil() {
        throw new UnsupportedOperationException(
            "Util Class 인스턴스 생성 방지");
    }

    /**
     * 비밀번호 암호화
     *
     * @param rawPassword 평문 비밀번호
     * @return String 암호화된 비밀번호
     */
    public static String encodePassword(String rawPassword) {
        return encoder.encode(rawPassword);
    }

    /**
     * 비밀번호 검증
     *
     * @param rawPassword     평문 비밀번호
     * @param encodedPassword 암호화된 비밀번호
     * @return boolean 비밀번호 일치 여부
     */
    public static boolean matches(String rawPassword, String encodedPassword) {
        return encoder.matches(rawPassword, encodedPassword);
    }
}
