#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int arr[], size_t arr_len) {
    int answer_len = 0;

    for (size_t i = 0; i < arr_len; i++) {
        answer_len += arr[i];
    }

    int* answer = (int*)malloc(sizeof(int) * answer_len);
    int index = 0;

    for (size_t i = 0; i < arr_len; i++) {
        for (int j = 0; j < arr[i]; j++) {
            answer[index++] = arr[i];
        }
    }

    return answer;
}