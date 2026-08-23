#include <stdlib.h>

int** solution(int num_list[], size_t num_list_len, int n) {
    size_t rows = num_list_len / n;
    int** answer = malloc(sizeof(int*) * rows);

    for (size_t i = 0; i < rows; i++) {
        answer[i] = malloc(sizeof(int) * n);

        for (int j = 0; j < n; j++) {
            answer[i][j] = num_list[i * n + j];
        }
    }

    return answer;
}