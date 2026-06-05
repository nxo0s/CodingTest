#include <stdio.h>

int main(void) {
    char str[21];

    scanf("%s", str);

    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] >= 'A' && str[i] <= 'Z') {
            str[i] = str[i] + 32; // 대문자 → 소문자
        } else if (str[i] >= 'a' && str[i] <= 'z') {
            str[i] = str[i] - 32; // 소문자 → 대문자
        }
    }

    printf("%s", str);

    return 0;
}