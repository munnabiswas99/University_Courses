#include <stdio.h>
#include <limits.h>

void coinChange(int coins[], int n, int target) {
    int dp[target + 1];
    int selectedCoin[target + 1];

    dp[0] = 0;
    for (int i = 1; i <= target; i++) {
        dp[i] = INT_MAX;
        selectedCoin[i] = -1;

        for (int j = 0; j < n; j++) {
            if (i >= coins[j] && dp[i - coins[j]] != INT_MAX) {
                if (dp[i] > 1 + dp[i - coins[j]]) {
                    dp[i] = 1 + dp[i - coins[j]];
                    selectedCoin[i] = j;
                }
            }
        }
    }

    printf("The coins are: ");
    int remainingAmount = target;
    while (remainingAmount > 0) {
        int coinIndex = selectedCoin[remainingAmount];
        printf("%d ", coins[coinIndex]);
        remainingAmount -= coins[coinIndex];
    }
    printf("\nMinimum number of coins: %d\n", dp[target]);
}

int main() {
    int n;
    printf("Enter the number of coin elements: ");
    scanf("%d", &n);

    int coins[n];
    printf("Enter the coin elements:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &coins[i]);
    }

    int target;
    printf("Enter the given sum: ");
    scanf("%d", &target);

    coinChange(coins, n, target);

    return 0;
}

