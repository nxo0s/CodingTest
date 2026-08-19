#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int numbers[], size_t numbers_len, const char* direction) {
    int* answer = malloc(sizeof(int) * numbers_len);

    for (size_t i = 0; i < numbers_len; i++) {
        if (direction[0] == 'r') {
            answer[(i + 1) % numbers_len] = numbers[i];
        } else {
            answer[i] = numbers[(i + 1) % numbers_len];
        }
    }

    return answer;
}