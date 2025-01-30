#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int weight;
    int profit;
    double ratio;
} Item;

int compareItems(const void* a, const void* b) {
    Item* itemA = (Item*)a;
    Item* itemB = (Item*)b;
    return (itemB->ratio - itemA->ratio);
}

double fractionalKnapsack(Item items[], int n, int capacity) {
    qsort(items, n, sizeof(Item), compareItems);

    double totalProfit = 0.0;
    int currentWeight = 0;

    for (int i = 0; i < n; i++) {
        if (currentWeight + items[i].weight <= capacity) {
            totalProfit += items[i].profit;
            currentWeight += items[i].weight;
        } else {
            int remainingWeight = capacity - currentWeight;
            totalProfit += (double)remainingWeight * items[i].ratio;
            break;
        }
    }

    return totalProfit;
}

int main() {
    int n;
    printf("Enter the number of items: ");
    scanf("%d", &n);

    Item items[n];
    printf("Enter the weights and profits of items:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d %d", &items[i].weight, &items[i].profit);
        items[i].ratio = (double)items[i].profit / items[i].weight;
    }

    int capacity;
    printf("Enter the knapsack capacity: ");
    scanf("%d", &capacity);

    double maxProfit = fractionalKnapsack(items, n, capacity);

    printf("Maximum profit that can be obtained: %.2lf\n", maxProfit);

    return 0;
}
