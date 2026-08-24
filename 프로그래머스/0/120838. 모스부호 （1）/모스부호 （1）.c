#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

char* solution(const char* letter) {
    const char* morse[] = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
        "....", "..", ".---", "-.-", ".-..", "--", "-.",
        "---", ".--.", "--.-", ".-.", "...", "-", "..-",
        "...-", ".--", "-..-", "-.--", "--.."
    };

    int len = strlen(letter);
    char* answer = (char*)malloc(len + 1);
    char* copy = (char*)malloc(len + 1);

    strcpy(copy, letter);

    int index = 0;
    char* token = strtok(copy, " ");

    while (token != NULL) {
        for (int i = 0; i < 26; i++) {
            if (strcmp(token, morse[i]) == 0) {
                answer[index++] = 'a' + i;
                break;
            }
        }

        token = strtok(NULL, " ");
    }

    answer[index] = '\0';

    free(copy);
    return answer;
}