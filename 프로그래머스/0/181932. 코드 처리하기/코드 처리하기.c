#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

char* solution(const char* code) {
    int len = strlen(code);
    char* answer = (char*)malloc(len + 1);

    int mode = 0;
    int pos = 0;

    for (int idx = 0; idx < len; idx++) {
        if (code[idx] == '1') {
            mode = 1 - mode;
        } else if ((mode == 0 && idx % 2 == 0) ||
                   (mode == 1 && idx % 2 == 1)) {
            answer[pos++] = code[idx];
        }
    }

    if (pos == 0) {
        strcpy(answer, "EMPTY");
    } else {
        answer[pos] = '\0';
    }

    return answer;
}