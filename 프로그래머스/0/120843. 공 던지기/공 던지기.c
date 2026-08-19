#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int numbers[], size_t numbers_len, int k) {
    return numbers[((k - 1) * 2) % numbers_len];
}