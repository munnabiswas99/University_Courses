#include <stdio.h>

void firstFit(int weights[], int n, int binCapacity) {
    int bins = 0;
    int binSpace[n];

    for (int i = 0; i < n; i++) {
        int j;
        for (j = 0; j < bins; j++) {
            if (binSpace[j] >= weights[i]) {
                binSpace[j] -= weights[i];
                break;
            }
        }

        if (j == bins) {
            binSpace[bins] = binCapacity - weights[i];
            bins++;
        }
    }

    printf("Minimum number of bins required: %d\n", bins);
}

int main() {
    int n;
    printf("Enter the number of weights to be packed: ");
    scanf("%d", &n);

    int weights[n];
    printf("Enter the given weights:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &weights[i]);
    }

    int binCapacity;
    printf("Enter the bin capacity: ");
    scanf("%d", &binCapacity);

    firstFit(weights, n, binCapacity);

    return 0;
}

