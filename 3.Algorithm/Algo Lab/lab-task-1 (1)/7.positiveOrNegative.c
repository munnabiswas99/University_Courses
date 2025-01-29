#include <stdio.h>

int main() {
    int arraySize;

    printf("Enter the size of the array: ");
    scanf("%d", &arraySize);

    int numArray[arraySize];

    printf("Enter %d integer numbers:\n", arraySize);
    for (int i = 0; i < arraySize; i++) {
        printf("Number %d: ", i + 1);
        scanf("%d", &numArray[i]);
    }

    printf("Positive numbers: ");
    for (int i = 0; i < arraySize; i++) {
        if (numArray[i] > 0) {
            printf("%d ", numArray[i]);
        }
    }
    printf("\n");

    printf("Negative numbers: ");
    for (int i = 0; i < arraySize; i++) {
        if (numArray[i] < 0) {
            printf("%d ", numArray[i]);
        }
    }
    printf("\n");

    return 0;
}

